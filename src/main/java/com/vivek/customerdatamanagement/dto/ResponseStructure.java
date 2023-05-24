package com.vivek.customerdatamanagement.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponseStructure<T> {

	private Integer statusCode;
	private T data;
	private String message;
	private LocalDateTime timeStamp;
	
}
