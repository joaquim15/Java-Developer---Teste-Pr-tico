package br.com.imposto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.imposto.domain.Item;
import br.com.imposto.domain.model.ModelItensTaxados;
import br.com.imposto.service.ImpostoService;

@RestController
@RequestMapping("/api")
public class ImpostoController {

	private ImpostoService service;

	public ImpostoController(ImpostoService service) {
		this.service = service;
	}

	@RequestMapping("/calcular-imposto")
	@ResponseBody
	public ResponseEntity<ModelItensTaxados> calculaImposto(@RequestBody List<Item> itens) {

		ModelItensTaxados itensTaxado = service.calculaImposto(itens);

		return ResponseEntity.ok(itensTaxado);
	}

}
