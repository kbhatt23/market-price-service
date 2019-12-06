package com.metallica.marketpriceservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commodity_price")
public class CommodityPrice {
	
	@Id
	@GeneratedValue
	@Column(name="commodity_price_id")
	private Integer id;
	
	@Column(name = "commodity_name" , unique = true)
	private String commodityName;
	
	public Integer getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commodityName == null) ? 0 : commodityName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommodityPrice other = (CommodityPrice) obj;
		if(this.id == other.getId()) {
			return true;
		}
		return false;
	}

	public CommodityPrice(String commodityName, Double price) {
		this.commodityName = commodityName;
		this.price = price;
	}
	
	public CommodityPrice() {
		
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name="price")
	private Double price;
	
	
	
}
