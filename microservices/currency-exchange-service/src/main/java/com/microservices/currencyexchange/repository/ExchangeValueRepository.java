package com.microservices.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.currencyexchange.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);

}
