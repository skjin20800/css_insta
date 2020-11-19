package composite;

import lombok.Data;

// 컴퍼지션
@Data
public class ShrimpBurgerSet {
	private ShrimpBurger burger;
	private Potato potato;
	private Coke coke;
	
	public ShrimpBurgerSet() {
		this(
				new ShrimpBurger(),
				new Potato(),
				new Coke()		
				);	
	}
		
	public ShrimpBurgerSet(ShrimpBurger burger, Potato potato, Coke coke) {
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
	
}
