package es.upv.grycap.tracer.model.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class ReqCreateDatasetDTO extends ReqDatasetDTO {

	@JsonIgnore
	private static final long serialVersionUID = 276930127687010771L;
	

	@NotNull(message="The list of resources to be added to the trace can't be null. An empty list is allowed.")
	protected List<ReqResDTO> resources;

}
