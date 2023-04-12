package com.qualifierannnotation;


import org.springframework.stereotype.Component;

@Component("vendor")
//@Qualifier("vendor")
public class ShowMessageToVendor implements ShowMessage{

	@Override
	public String getMessage() {
		String message="This message is for Vendor";
		return message;
	}

}
