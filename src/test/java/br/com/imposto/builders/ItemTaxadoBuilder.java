package br.com.imposto.builders;

import br.com.imposto.domain.ItemTaxado;

public class ItemTaxadoBuilder {

	private ItemTaxado itemTaxado;

	public ItemTaxadoBuilder() {
	}

	public static ItemTaxadoBuilder ItemTaxado() {

		final ItemTaxadoBuilder builder = new ItemTaxadoBuilder();
		builder.itemTaxado = new ItemTaxado();
		builder.itemTaxado.setQuantidade(1);
		return builder;

	}

	public ItemTaxado agora() {
		return itemTaxado;
	}

	public ItemTaxadoBuilder comDescricao(final String descricao) {
		itemTaxado.setDescricao(descricao);
		return this;
	}

	public ItemTaxadoBuilder comValor(final String valor) {
		itemTaxado.setDescricao(valor);
		return this;
	}

}
