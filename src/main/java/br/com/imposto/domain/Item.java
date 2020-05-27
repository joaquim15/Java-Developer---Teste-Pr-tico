package br.com.imposto.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {

	private String descricao;

	private double preco;
	
	private int quantidade;
	
	private Boolean isImportado;
	
	private Boolean isIsento;

	private double precoInial;
}
