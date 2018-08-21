package com.ecorp.rest.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecorp.beans.FakeCardNumber;
import com.ecorp.processor.ComputeNumberOfFake;
import java.math.BigInteger;

@Controller
public class FakeCardNumberController {

	private String dayToProcessMsg = "";
	private String numberOfCardsMsg = "";
	
	@GetMapping("/fake-card-number/day")
	@ResponseBody
	public FakeCardNumber fakeCardNumberByDay(
			@RequestParam(name = "day", required = false, defaultValue = "Five") String day,
			@RequestParam(name = "number", required = false, defaultValue = "Java Fan") String number) {
		return new FakeCardNumber(String.format(dayToProcessMsg, day), String.format(numberOfCardsMsg, number));
	}
	@GetMapping("/fake-card-number/day/{dayId}/number")
	@ResponseBody
	public FakeCardNumber retrieveFakeCardNumberByDay(@PathVariable String dayId) {
		dayToProcessMsg = dayId;
		ComputeNumberOfFake creditCardService = new ComputeNumberOfFake(); 
		BigInteger tmp = new BigInteger(dayId);
		String dias = creditCardService.getNumberOfFakeByDay(tmp).toString();
		numberOfCardsMsg = dias; 
		return new FakeCardNumber(String.format(dayToProcessMsg, dayId), String.format(numberOfCardsMsg, dias));
	}
}
