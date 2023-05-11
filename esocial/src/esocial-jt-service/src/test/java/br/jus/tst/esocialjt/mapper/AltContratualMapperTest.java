package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class AltContratualMapperTest {
	
	@Test
	public void deveMapearEvento() {
		AltContratual altContratual = CriadorObjetoAleatorio.criarEPreencher(AltContratual.class);
		EvtAltContratual evtAltContratual = AltContratualMapper.INSTANCE.comoEvtAltContratual(altContratual);

		MapperAssertion
		 	.assertThat(evtAltContratual.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(altContratual.getIdeEmpregador());
		
		MapperAssertion
		 	.assertThat(evtAltContratual.getIdeVinculo())
		 	.usingRecursiveComparison().isEqualTo(altContratual.getIdeVinculo());
		
		MapperAssertion
		 	.assertThat(evtAltContratual.getAltContratual())
		 	.usingRecursiveComparison().isEqualTo(altContratual.getAltContratual());
	}
}
