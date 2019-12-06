package com.metallica.marketpriceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.metallica.marketpriceservice.repository.CommodityPriceRepository;
@RestController
public class CommodityController {
	@Autowired
	private CommodityPriceRepository priceRepo;
	
	@GetMapping("/market-price/{metal}")
	public Double fetchCommodityPrice(@PathVariable("metal") String commodityName) {
		return priceRepo.getCommodityPriceByCommodityName(commodityName).getPrice();
	}

}
