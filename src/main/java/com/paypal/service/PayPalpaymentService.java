package com.paypal.service;

import org.springframework.stereotype.Service;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

@Service
public interface PayPalpaymentService {

	public Payment createayment(Double total, String currency, String method, String intent, String description,
			String cancelUrl, String successUrl)throws PayPalRESTException;
	
	public Payment executePayment(String paymentId, String payerId) throws PayPalRESTException;

}
