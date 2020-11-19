package composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class ShrimpBurger extends Burger {
	
	public ShrimpBurger() {
this(2000,"새우버거");
	}
	public ShrimpBurger(int price, String desc) {
		super(price, desc);

	}

}
