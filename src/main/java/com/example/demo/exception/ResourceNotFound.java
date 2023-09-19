package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFound extends RuntimeException{
	String ResourceName;
	String FieldName;
	int FieldValue;
	
	public ResourceNotFound(String ResourceName,String FieldName,int FieldValue) {
		super(String.format("%s is not %s at %s",ResourceName,FieldName,FieldValue));
		this.ResourceName=ResourceName;
		this.FieldName=FieldName;
		this.FieldValue=FieldValue;
	}
}
