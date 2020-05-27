package br.com.imposto.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import br.com.imposto.domain.Item;

public class Util {

	public static double arredondar(double valor) {
		return new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	public static double aplicarImpostoNaoIsento(final Item item) {
		double valorTaxa = addPorcertagem(item.getPreco() * 0.1);
		return arredondar(item.getPreco() + valorTaxa);
	}

	public static double aplicarImpostoItemImportado(final Item item) {

		double valorComImposto = addPorcertagem(item.getPreco() * 0.05);

		double novoValor = item.getPreco() + valorComImposto;

		return arredondar(novoValor);
	}

	static public double addPorcertagem(double valor) {
		return new BigDecimal(Math.ceil(valor * 20) / 20).setScale(2, RoundingMode.HALF_UP).doubleValue();

	}

	static public String formataValor(final double valor) {
		DecimalFormat df = new DecimalFormat("##0.00");
		return df.format(valor);
	}

}
