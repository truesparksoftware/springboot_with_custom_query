package com.qualifierannnotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("client")
//@Qualifier("client")
public class ShowMessageToClient implements ShowMessage{

	@Override
	public String getMessage() {
		String message="This message is for Client";
		return message;
	}

}
