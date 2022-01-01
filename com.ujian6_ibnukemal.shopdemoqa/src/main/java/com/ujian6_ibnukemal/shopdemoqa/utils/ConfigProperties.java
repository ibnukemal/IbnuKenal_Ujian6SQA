package com.ujian6_ibnukemal.shopdemoqa.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String username;

	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value ("${firstname}")
	private String firstname;
	
	@Value ("${lastname}")
	private String lastname;
	
	@Value ("${address}")
	private String address;
	
	@Value ("${town}")
	private String town;
	
	@Value ("${postcode}")
	private String postcode;
	
	@Value ("${phone}")
	private String phone;

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public String getTown() {
		return town;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getPhone() {
		return phone;
	}

	public String getBrowser() {
		return browser;
	}

	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	
	
	
	
}
