package com.example.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.currencyexchange.bean.ExchangeValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long> {
ExchangeValue findByfromAndTo(String from,String to);
}
