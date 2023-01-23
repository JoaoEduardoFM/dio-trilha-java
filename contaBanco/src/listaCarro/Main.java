package listaCarro;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<>();
		
		carros.add(new Carro("fiat"));
		carros.add(new Carro("chevrolet"));
		carros.add(new Carro("ford"));
		carros.add(new Carro("jeep"));
		
		// verifica se o objeto existe na lista
		System.out.println(carros.contains(new Carro("fiat")));
		
		System.out.println(carros.get(0));
		
		System.out.println(carros.indexOf(new Carro("ford")));
		
		System.out.println(carros.remove(2));
		
		System.out.println(carros.toString());
		
	}
}
