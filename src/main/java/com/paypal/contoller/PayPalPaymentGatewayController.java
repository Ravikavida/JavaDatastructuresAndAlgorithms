package com.paypal.contoller;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.dto.ResponseDto;
import com.paypal.service.impl.PaypalPaymentServiceImpl;

/**
 * @author Ravi
 *
 *This is Controller call will for Paypal Merchant all services available here.
 */
@RestController
public class PayPalPaymentGatewayController {
	Logger logger = Logger.getLogger(PayPalPaymentGatewayController.class.getName());
	public static final String SUCCESS_URL = "paypal/success";
	public static final String CANCEL_URL = "paypal/cancel";

	public static final String BASE_URL = "http://localhost:8080/";

	@Autowired
	private PaypalPaymentServiceImpl serviceImpl;
	
	/**
	 * This Method will load product Deatils
	 * @return
	 */
	@GetMapping("/")
	public String getHomePage() {
		return "home";
	}

	/**
	 * once the prodcut Details added to the cart here we connect with paypal merchant and will do payment.
	 * @param responseDto
	 * @return
	 */
	@PostMapping(value = "/pay" ,produces = MediaType.TEXT_PLAIN_VALUE)
	public String payment(@ModelAttribute("responseDto") ResponseDto responseDto){
		try {
		Payment payment = serviceImpl.createayment(responseDto.getPrice(), responseDto.getCurrency(),
				responseDto.getMethod(), responseDto.getIntent(), responseDto.getDescription(), BASE_URL + CANCEL_URL,
				BASE_URL + SUCCESS_URL);
		for(Links link:payment.getLinks()) {
			if(link.getRel().equals("approval_url")) {
				return "redirect:"+link.getHref();
			}
		}
		
		}catch(PayPalRESTException e) {
			logger.info(e.getMessage());
		}

		return "redirect:/";
	}
	
	/**
	 * This will redirect cancel url if payment is cancled.
	 * @return
	 */
	@GetMapping(value = CANCEL_URL)
	public String paymaentCanceled() {
		return "cancelpayment";
	}
	

    /**
     * This will called once payment is success and shows success response to the user.
     * @param paymentId
     * @param payerId
     * @return
     */
    @GetMapping(value = SUCCESS_URL)
    public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId) {
        try {
            Payment payment = serviceImpl.executePayment(paymentId, payerId);
            logger.info(payment.toJSON());
            if (payment.getState().equals("approved")) {
                return "paymentSuccess";
            }
        } catch (PayPalRESTException e) {
        	logger.info(e.getMessage());
        }
        return "redirect:/";
    }
}
