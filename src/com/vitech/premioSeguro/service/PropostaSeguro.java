package com.vitech.premioSeguro.service;

import com.vitech.premioSeguro.model.Cliente;

public class PropostaSeguro {
	
	private Cliente cliente;
	
	private CalculadoraPremioSeguro calculadora;
		
	public PropostaSeguro(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String gerar(Double valorVeiculo) {
		return "Nome do cliente: " + cliente.getNome() + "\n" +
			   "Valor do calculo do prêmio para este cliente: " + calculadora.calcucar(cliente, valorVeiculo);
	}
	
	public void setCalculadora(CalculadoraPremioSeguro calculadora) {
		this.calculadora = calculadora;
	}
}
