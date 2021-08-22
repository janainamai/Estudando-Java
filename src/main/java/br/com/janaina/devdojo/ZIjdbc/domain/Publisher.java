package br.com.janaina.devdojo.ZIjdbc.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
/**
 * Company that coordinates the edition and publication of literary works.
 * 
 * @author Janaina
 *
 */
public class Publisher {
	Integer id;
	String name;

}
