package com.example.currencyexchange.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

@Id
private int id;
@Column(name="currency_from")
private String from;
@Column(name="currency_to")
private String to;
private BigDecimal conversionMultiple;

public ExchangeValue() {
	super();
}
private int port;


public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public ExchangeValue(int id, String from, String to, BigDecimal conversionMultiply) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.conversionMultiple = conversionMultiply;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}
public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}


}
