package com.assignment.smallcase.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Trade {
	@Id
	private String id;
	private String userId;
	private TradeType type;
	private int qty;
	private Stock stock;
	private Double price;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TradeType getType() {
		return type;
	}
	public void setType(TradeType type) {
		this.type = type;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Trade [id=" + id + ", userId=" + userId + ", type=" + type + ", qty=" + qty + ", stock=" + stock
				+ ", price=" + price + "]";
	}
	
}
