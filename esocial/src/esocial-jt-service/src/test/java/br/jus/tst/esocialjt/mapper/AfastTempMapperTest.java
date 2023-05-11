package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp;
import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class AfastTempMapperTest {
	
	@Test
	public void deveMapearEvento() {
		AfastTemp afastTemp = CriadorObjetoAleatorio.criarEPreencher(AfastTemp.class);
		EvtAfastTemp evtAfastTemp =AfastTempMapper.INSTANCE.comoEvtAfastTemp(afastTemp);

		 MapperAssertion
		 	.assertThat(evtAfastTemp.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(afastTemp.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtAfastTemp.getIdeVinculo())
		 	.usingRecursiveComparison().isEqualTo(afastTemp.getIdeVinculo());
		
		 MapperAssertion
		 	.assertThat(evtAfastTemp.getInfoAfastamento())
		 	.usingRecursiveComparison().isEqualTo(afastTemp.getInfoAfastamento());
	}
}
