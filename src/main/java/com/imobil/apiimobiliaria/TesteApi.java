package com.imobil.apiimobiliaria;

import org.springframework.web.client.RestTemplate;

import com.imobil.apiimobiliaria.entity.Taxa;

public class TesteApi {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		System.out.println(template.getForObject("https://brasilapi.com.br/api/taxas/v1/cdi", Taxa.class));
	}
}
