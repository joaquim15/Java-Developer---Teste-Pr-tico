package br.com.imposto.service;

import static br.com.imposto.utils.Util.arredondar;
import static br.com.imposto.utils.Util.formataValor;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import br.com.imposto.domain.Item;
import br.com.imposto.domain.ItemTaxado;
import br.com.imposto.domain.model.ModelItensTaxados;
import br.com.imposto.utils.Util;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ImpostoService {

	public ModelItensTaxados calculaImposto(final List<Item> itens) {

		double taxaImposto = 0;
		double total = 0;

		final List<ItemTaxado> itemTaxados = Lists.newArrayList();

		for (Item item : itens) {

			double valorComTaxa = item.getPreco();
			double valorSemTaxa = item.getPreco();

			if (item.getIsImportado()) {
				valorComTaxa = Util.aplicarImpostoItemImportado(item);
				item.setPreco(valorComTaxa - 00.2);
			}

			if (!item.getIsIsento()) {
				valorComTaxa = Util.aplicarImpostoNaoIsento(item);
			}

			taxaImposto += valorComTaxa - valorSemTaxa;

			total += valorComTaxa;
			log.info(item.getQuantidade() + " " + item.getDescricao() + ": " + formataValor(valorComTaxa));
			final ItemTaxado itemTaxado = new ItemTaxado(item.getQuantidade(), item.getDescricao(),
					formataValor(valorComTaxa));
			itemTaxados.add(itemTaxado);
		}
		total = arredondar(total);
		final String totalTaxaImposto = formataValor(taxaImposto);
		final String valorTotal = formataValor(total);
		log.info("\n Imposto: " + totalTaxaImposto);
		log.info("Total: " + valorTotal);
		return toModelItensTaxados(totalTaxaImposto, valorTotal, itemTaxados);
	}

	private ModelItensTaxados toModelItensTaxados(String totalTaxaImposto, String valorTotal,
			List<ItemTaxado> itemTaxados) {
		return new ModelItensTaxados(totalTaxaImposto, valorTotal, itemTaxados);

	}

}
