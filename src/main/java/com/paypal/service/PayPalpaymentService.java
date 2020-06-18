package com.paypal.service;

import org.springframework.stereotype.Service;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

/**
 * @author Ravi
 *
 */
@Service
public interface PayPalpaymentService {

	/**
	 * @param total
	 * @param currency
	 * @param method
	 * @param intent
	 * @param description
	 * @param cancelUrl
	 * @param successUrl
	 * @return
	 * @throws PayPalRESTException
	 */
	public Payment createayment(Double total, String currency, String method, String intent, String description,
			String cancelUrl, String successUrl)throws PayPalRESTException;
	
	/**
	 * @param paymentId
	 * @param payerId
	 * @return
	 * @throws PayPalRESTException
	 */
	public Payment executePayment(String paymentId, String payerId) throws PayPalRESTException;

}
