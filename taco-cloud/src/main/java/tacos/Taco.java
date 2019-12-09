package tacos;

import lombok.Data;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {
	
	
	@NotNull
	@Size(min=5, message="Name must be alteast 5 character long")
	private String name;
	
	@Size(min=1, message="You must choose atleast 1 ingredient")
	private List<String> ingredients;
	
}