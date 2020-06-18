package com.paypal.app;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.paypal.api.payments.Payment;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import com.paypal.service.impl.PaypalPaymentServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
class PaymentGateWayApplicationTests {

	@Mock
	 PaypalPaymentServiceImpl service;
	
	@InjectMocks // auto inject helloRepository
    private APIContext helloService = new APIContext();

	@Test
	public void createpaymettest() throws Exception {

		Payment payment = service.createayment(10.0, "currency", "method", "Intent", "description",
				"http://localhost:8080/paypal/cancel", "http://localhost:8080/paypal/success");
		assertNotNull(payment);

	}
	
	@Test
	public void executePaymenttest() throws PayPalRESTException{
		Payment payment = service.executePayment("123", "Test");
		assertNotNull(payment);
		
	}

}
