package condominio;

public class Main {

	public static void main(String[] args) {

		Apartamento apto2 = new Apartamento(1, 5, null);
		Apartamento apto3 = new Apartamento(2, 6, null);
		Apartamento apto4 = new Apartamento(3, 7, null);
		Apartamento apto5 = new Apartamento(4, 8, null);
		ArrayList<Apartamento> apartamentos = new ArrayList<>();
		apartamentos.add(apto2);
		apartamentos.add(apto3);
		apartamentos.add(apto4);
		apartamentos.add(apto5);
		 System.out.println(apartamentos.get(0).getNumeroApto());
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