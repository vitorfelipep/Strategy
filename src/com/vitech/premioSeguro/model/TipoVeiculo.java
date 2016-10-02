package com.vitech.premioSeguro.model;

import com.vitech.premioSeguro.service.CalculadoraPremioSeguro;
import com.vitech.premioSeguro.service.CalculadoraPremioSeguroParaCarro;
import com.vitech.premioSeguro.service.CalculadoraPremioSeguroParaMoto;

public enum TipoVeiculo {
	
	CARRO {
		@Override
		public CalculadoraPremioSeguro getCalculadoraPremioSeguro() {
			return new CalculadoraPremioSeguroParaCarro();
		}
	},
	MOTO {
		@Override
		public CalculadoraPremioSeguro getCalculadoraPremioSeguro() {
			return new CalculadoraPremioSeguroParaMoto();
		}
	};
	
	public abstract CalculadoraPremioSeguro getCalculadoraPremioSeguro();
}
