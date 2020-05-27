package br.com.imposto.domain.model;

import java.util.List;

import br.com.imposto.domain.ItemTaxado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ModelItensTaxados {

	private String taxas;
	private String total;
	private List<ItemTaxado> itemTaxados;

}
