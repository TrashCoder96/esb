package com.esb.converters;

import org.springframework.core.convert.converter.Converter;

/**
 * Created by itimofeev on 06.05.2017.
 */
public class StringToIntegerConverter implements Converter<String, Integer> {

	public Integer convert(String source) {
		return Integer.parseInt(source);
	}

}
