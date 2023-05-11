package br.jus.tst.esocialjt.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.cdbenterm.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenterm.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.CdBenTerm;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class CdBenTermMapper {

	public static final CdBenTermMapper INSTANCE = Mappers.getMapper(CdBenTermMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtCdBenTerm comoEvtCdBenTerm(CdBenTerm cdBenTerm); 

}
