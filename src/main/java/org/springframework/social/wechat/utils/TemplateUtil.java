package org.springframework.social.wechat.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.social.support.FormMapHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * spring-social-wechat
 * 
 * @author Larry
 */
public class TemplateUtil {

	public static RestTemplate addHttpMessageConverter(RestTemplate restTemplate,
			HttpMessageConverter<?> httpMessageConverter) {
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>(3);
		converters.add(new FormHttpMessageConverter());
		converters.add(new FormMapHttpMessageConverter());
		converters.add(httpMessageConverter);
		restTemplate.setMessageConverters(converters);
		return restTemplate;
	}

}
