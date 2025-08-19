package com.like.core.jpa.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

	private static final String SEPARATOR = ",";
	 
	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		return String.join(SEPARATOR, attribute); 
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {
		return new ArrayList<>(Arrays.asList(dbData.split(SEPARATOR)));
	}
	
}
