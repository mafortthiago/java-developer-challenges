import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Banco {

	private @Getter String nome;
	private @Setter List<IConta> contas;

}
