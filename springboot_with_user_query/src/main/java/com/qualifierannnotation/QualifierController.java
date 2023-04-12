package com.qualifierannnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qa")
public class QualifierController {

	@Autowired
	@Qualifier("client")
	ShowMessage showMessage;
	
   @GetMapping("/msg")
   public String getMessage() {
	   String message=showMessage.getMessage();
	   return message;
   }
	
}
