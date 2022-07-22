package es.upv.grycap.tracer.model.trace.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum UserAction {
	@JsonProperty("CREATE_DATASET")
	CREATE_DATASET(1, "Create a new dataset"),
	@JsonProperty("UPDATE_DATASET")
	UPDATE_DATASET(2, "Update existing dataset properties"),
	@JsonProperty("USE_DATASETS")
	USE_DATASETS(4, "Use one or more datasets in a Kubernetes App"),
	@JsonProperty("CREATE_MODEL_POD")
	CREATE_MODEL(5, "Create a new model in a Kubernetes App"),
	@JsonProperty("USE_MODEL_POD")
	USE_MODELS(6, "Use one or more existing models in a Kubernetes App");

	@JsonIgnore
	public final int id;
	@JsonIgnore
	public final String description;

	private UserAction(int id, String description) {
        this.id = id;
        this.description = description;
    }

	@Override
	public String toString() {
		return name();
	}

}
