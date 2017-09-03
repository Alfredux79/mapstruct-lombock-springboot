package io.alfredux.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Source {
	private String identifier;
	private String characteristics;
}
