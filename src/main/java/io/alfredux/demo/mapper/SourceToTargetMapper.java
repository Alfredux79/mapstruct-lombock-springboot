package io.alfredux.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import io.alfredux.demo.domain.Source;
import io.alfredux.demo.domain.Target;

@Mapper(componentModel = "spring")
public interface SourceToTargetMapper {

	SourceToTargetMapper MAPPER = Mappers.getMapper( SourceToTargetMapper.class );
	
	@Mappings({ 
		@Mapping(source = "characteristics", target = "description"),
		@Mapping(source = "identifier", target = "id") 
	})
	public Target toTarget(Source source);
}
