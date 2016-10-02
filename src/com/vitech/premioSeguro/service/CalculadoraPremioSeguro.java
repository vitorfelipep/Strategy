package com.vitech.premioSeguro.service;

import com.vitech.premioSeguro.model.Cliente;

public interface CalculadoraPremioSeguro {
	
	public double calcucar(Cliente cliente, double valorVeiculo);
}	
