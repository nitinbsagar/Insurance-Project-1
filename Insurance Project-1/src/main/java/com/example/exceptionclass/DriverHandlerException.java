package com.example.exceptionclass;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DriverHandlerException {
@ExceptionHandler(value= {DriverIdNotFoundException.class})

public ResponseEntity<Object>handleDriver(DriverIdNotFoundException driverNotFoundException){
	DriverException de = new DriverException(driverNotFoundException.getMessage(),driverNotFoundException.getCause(),HttpStatus.NOT_FOUND);
	return new ResponseEntity<>(de,HttpStatus.NOT_FOUND);
	
}
}
