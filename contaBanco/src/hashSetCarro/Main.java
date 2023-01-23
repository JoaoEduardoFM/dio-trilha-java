package hashSetCarro;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Carro> carros = new TreeSet<>();
		
		carros.add(new Carro("fiat"));
		carros.add(new Carro("chevrolet"));
		carros.add(new Carro("chevrolet"));
		carros.add(new Carro("ford"));
		carros.add(new Carro("jeep"));
		
		System.out.println(carros);
		
	}
}
