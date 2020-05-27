package br.com.imposto.builders;

import br.com.imposto.domain.Item;

public class ItemBuilder {

	private Item item;

	private ItemBuilder() {
	}

	public static ItemBuilder umItem() {
		
		ItemBuilder builder = new ItemBuilder();
		
		builder.item = new Item();
		builder.item.setDescricao("book");
		builder.item.setPreco(12.49);
		builder.item.setQuantidade(1);
		builder.item.setIsIsento(Boolean.TRUE);
		builder.item.setIsImportado(Boolean.FALSE);
		
		return builder;
	}

	public Item agora() {
		return item;
	}
}
