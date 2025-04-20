package POJo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmpRecords{

	@JsonProperty("city")
	private String city;

	@JsonProperty("name")
	private String name;

	@JsonProperty("age")
	private int age;
}