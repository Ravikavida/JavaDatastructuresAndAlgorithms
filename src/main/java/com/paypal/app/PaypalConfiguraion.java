package com.paypal.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

@Configuration
public class PaypalConfiguraion {

	@Value("${paypal.client.id}")
	private String clientId;

	@Value("${paypal.client.secret}")
	private String secretekey;

	@Value("${paypal.mode}")
	private String mode;
	
	@Bean
	public  Map<String,String> getPaypalsdkConfigDetails(){

	Map<String,String> map = new HashMap<>();
	map.put("mode",mode);
	return map;
	
	}
	@Bean
	public OAuthTokenCredential getcredintials() {
		return new OAuthTokenCredential(clientId, secretekey, getPaypalsdkConfigDetails());
	}
	
	@Bean
	public APIContext apicontext() throws PayPalRESTException{
		APIContext context  = new APIContext(getcredintials().getAccessToken());
		context.setConfigurationMap(getPaypalsdkConfigDetails());
		
		return context;
	}
}
