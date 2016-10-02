package com.vitech.premioSeguro.service;

import com.vitech.premioSeguro.model.Cliente;
import com.vitech.premioSeguro.model.Sexo;

public class CalculadoraPremioSeguroParaCarro implements CalculadoraPremioSeguro{

	@Override
	public double calcucar(Cliente cliente, double valorVeiculo) {
		if(cliente.getSexo().equals(Sexo.MASCULINO))
			return valorVeiculo * 2.5;
		return valorVeiculo * 1.5;
	}

}
