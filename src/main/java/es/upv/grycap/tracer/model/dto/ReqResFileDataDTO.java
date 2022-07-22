package es.upv.grycap.tracer.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class ReqResFileDataDTO extends ReqResDTO {
	@JsonIgnore
	private static final long serialVersionUID = 8131165912167657628L;

	/**
	 * base 64 encoded data
	 */

	@NotNull(message="The Base64 encoded binary data can't be null.")
	@NotBlank(message="The Base64 encoded binary data must have a value.")
	protected String data;

}
