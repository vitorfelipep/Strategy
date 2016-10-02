package com.vitech.premioSeguro.service;

import com.vitech.premioSeguro.model.Cliente;

public class CalculadoraPremioSeguroParaMoto implements CalculadoraPremioSeguro{

	@Override
	public double calcucar(Cliente cliente, double valorVeiculo) {
		if(cliente.getIdade() > 33)
			return valorVeiculo * 1.2 + 5;
		return valorVeiculo * 2.0 + 10;
	}

}
