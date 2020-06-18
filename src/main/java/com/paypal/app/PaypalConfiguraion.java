package com.paypal.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

/**
 * @author Ravi
 *
 *This is Configuration class which will read details from application.properties.
 */
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
	/**
	 * @return
	 * This method is to check authentication details for Paypal merchant details. 
	 */
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
