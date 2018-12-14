package com.kevin.myshop.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class MyErrorController implements ErrorController  {

	@GetMapping("/error")
	public String handleError() {
		return "<!DOCTYPE html>\r\n" +
				"<html>\r\n" +
				"<body>\r\n" +
				"<h1>Error 404: Server unavailable</h1>\r\n" +
				"<h2>Maybe this route doesn't exist or is unavailable now</h2>\r\n" +
				"</body>\r\n" +
				"</html>";
	}
	
	@Override
	public String getErrorPath() {
		return "/error";
	}
}
