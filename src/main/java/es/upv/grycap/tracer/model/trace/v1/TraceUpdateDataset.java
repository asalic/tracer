package es.upv.grycap.tracer.model.trace.v1;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class TraceUpdateDataset extends TraceDataset {
	
	@JsonCreator
	public TraceUpdateDataset(@JsonProperty("id") String id, @JsonProperty("timestamp") String timestamp) {
		super(id, timestamp);
	}
	
	/**
	 * The details about the updated dataset, such as the performed action 
	 * or the field that has been changed.
	 */
	protected TraceUpdateDetails details; 

}
