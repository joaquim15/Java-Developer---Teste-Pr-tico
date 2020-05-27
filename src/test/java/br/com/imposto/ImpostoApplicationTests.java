package br.com.imposto;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.com.imposto.builders.ItemBuilder;
import br.com.imposto.builders.ItemTaxadoBuilder;
import br.com.imposto.domain.Item;
import br.com.imposto.domain.ItemTaxado;
import br.com.imposto.domain.model.ModelItensTaxados;
import br.com.imposto.service.ImpostoService;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ImpostoService.class })
class ImpostoApplicationTests {

	@Mock
	private ImpostoService service;

	@Rule
	public ErrorCollector error = new ErrorCollector();

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void deve_calcular_imposto() {

		// cenario
		List<Item> itens = Arrays.asList(ItemBuilder.umItem().agora());

		// acao
		ItemTaxado item1 = ItemTaxadoBuilder.ItemTaxado().comDescricao("book").comValor("12,49").agora();
		
		//ItemTaxado item2 = ItemTaxadoBuilder.ItemTaxado().comDescricao("music CD").comValor("16,49").agora();
		//ItemTaxado item3 = ItemTaxadoBuilder.ItemTaxado().comDescricao("chocolate bar").comValor("0,85").agora();

		List<ItemTaxado> itemTaxados = Arrays.asList(item1);

		ModelItensTaxados modelItensTaxados = new ModelItensTaxados("0,00", "12,49", itemTaxados);
		
		Mockito.when(service.calculaImposto(itens)).thenReturn(modelItensTaxados);
		ModelItensTaxados item = service.calculaImposto(itens);

		// verificacao
		error.checkThat(item.getTotal(), is(equalTo(29.83)));

	}

}
