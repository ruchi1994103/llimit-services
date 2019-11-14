package com.example.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.currencyexchange.bean.ExchangeValue;
import com.example.currencyexchange.repository.CurrencyExchangeRepository;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeRepository currencyExchangeRepository;
	@Autowired
	Environment env;
	@GetMapping("/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue ev=currencyExchangeRepository.findByfromAndTo(from, to);
		ev.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return ev;
	}
	
	
}
