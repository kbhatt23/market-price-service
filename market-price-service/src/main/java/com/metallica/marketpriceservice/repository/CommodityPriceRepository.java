package com.metallica.marketpriceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metallica.marketpriceservice.model.CommodityPrice;
@Repository
public interface CommodityPriceRepository extends JpaRepository<CommodityPrice, Long>{
	
	public CommodityPrice getCommodityPriceByCommodityName(String commodityName);

}
