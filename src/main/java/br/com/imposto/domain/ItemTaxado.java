package br.com.imposto.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemTaxado {

	private Integer quantidade;
	private String descricao;
	private String valor;

}
