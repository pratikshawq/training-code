package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.StringCalculator;

public class MyFirstTest {
	@Test
	void add_emptyString_returnsZero()
	{
		assertEquals(0,StringCalculator.add(""));
		
	}
}
