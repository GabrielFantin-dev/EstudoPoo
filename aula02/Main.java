package condominio;

public class Main {

	public static void main(String[] args) {
	ArrayList<Apartamento> apartamentos = new ArrayList<>();
		Apartamento apto2 = new Apartamento(1, 5, new Lavanderia(1, 3 , new Energia("220W")));
		Apartamento apto3 = new Apartamento(2, 6, new Lavanderia (2, 6 , new Energia("220W")));
		Apartamento apto4 = new Apartamento(3, 7, new Lavanderia (3, 10 , new Energia("220W")));
		Apartamento apto5 = new Apartamento(4, 8, new Lavanderia (4, 12 , new Energia("220W")));
		apartamentos.add(apto2);
		apartamentos.add(apto3);
		apartamentos.add(apto4);
		apartamentos.add(apto5);
		 System.out.println(apartamentos.get(0));
		 System.out.println(apartamentos.get(1));
		 System.out.println(apartamentos.get(2));
		 System.out.println(apartamentos.get(3));
		
		/*
		Lavanderia lavanderia = new Lavanderia(2, 120);
		Apartamento apto = new Apartamento(1, 5);
		apto.setLavanderia(lavanderia);
		Apartamento apto2 = new Apartamento(2, 6);
		apto2.setLavanderia(lavanderia);
		
	
		System.out.println(apto);
		System.out.println(apto2);
		
		
		
		
		*/
		
		
		//Apartamento apto = new Apartamento(1, 5);
		//Apartamento apto2 = new Apartamento(2, 6);
	
		//int verificado = Apartamento.verificarApto();
		
		//System.out.println(Utils.retornaHora());
		//Apartamento apto = new Apartamento(1, 5, new Lavanderia(1, 3, new Energia("110")));
		//System.out.println(apto);
	}

}