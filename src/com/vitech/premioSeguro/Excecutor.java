package com.vitech.premioSeguro;

import java.util.Scanner;

import com.vitech.premioSeguro.model.Cliente;
import com.vitech.premioSeguro.model.Sexo;
import com.vitech.premioSeguro.model.TipoVeiculo;
import com.vitech.premioSeguro.service.PropostaSeguro;

public class Excecutor {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe o nome do cliente: ");
			cliente.setNome(entrada.nextLine());  
			System.out.print("Informe a idade do cliente:");
			cliente.setIdade(entrada.nextInt());
			
			System.out.print("Informe o sexo do cliente: (1) Masculino, (2) feminino");
			int intSexo = entrada.nextInt();
			cliente.setSexo(Sexo.values()[intSexo - 1]);
			
			PropostaSeguro propostaSeguro = new PropostaSeguro(cliente);
			
			boolean finalizar = true;
			while(finalizar) {
				System.out.print("Informe o tipo do veiculo do cliente: (1) Carro, (2) Moto");
				TipoVeiculo tipoVeiculo = TipoVeiculo.values()[entrada.nextInt() -1 ];
				
				System.out.print("Informe o valor do veiculo: ");
				Double valor = entrada.nextDouble();
				
				propostaSeguro.setCalculadora(tipoVeiculo.getCalculadoraPremioSeguro());
				System.out.println(propostaSeguro.gerar(valor));
				
				System.out.println("Finalizar proposta?: (1- Sim) | (2- Não)");
				int opcao = entrada.nextInt();
				
				
				if(opcao == 1)
					finalizar = false;
			}
			
		}
	}
}
