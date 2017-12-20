package com.tma.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tma.exception.ConstraintViolationException;
import com.tma.exception.CustomException;
import com.tma.exception.NoHandlerFoundException;

@RestControllerAdvice
public class ExceptionHandlerController {
	@ExceptionHandler(value = { ConstraintViolationException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public CustomException constraintViolationException(ConstraintViolationException ex) {
		return new CustomException(400, ex.getMessage());
	}

	@ExceptionHandler(value = { NoHandlerFoundException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public CustomException noHandlerFoundException(Exception ex) {
		return new CustomException(404, ex.getMessage());
	}

}
