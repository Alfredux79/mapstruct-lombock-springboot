package io.alfredux.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import io.alfredux.demo.domain.Source;
import io.alfredux.demo.domain.Target;

@Mapper(componentModel = "spring")
public interface SourceToTargetMapper {

	@Mappings({ 
		@Mapping(source = "characteristics", target = "description"),
		@Mapping(source = "identifier", target = "id") 
	})
	Target toTarget(Source source);
}
