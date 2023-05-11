package br.jus.tst.esocialjt.xml.assinatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xml/acoes/assinar")
public class AssinaturaXmlResource {

	@Autowired
	private AssinaturaXmlServico servico;

	@PostMapping(consumes = "text/xml;charset=UTF-8", produces = "text/xml;charset=UTF-8")
	public Object assinar(@RequestBody String xml) {
		return servico.assinar(xml);
	}

}
