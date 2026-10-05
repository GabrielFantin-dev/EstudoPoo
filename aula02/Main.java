package condominio;

public class Main {

	public static void main(String[] args) {
		
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
		
		System.out.println(Utils.retornaHora());
		Apartamento apto = new Apartamento(1, 5, new Lavanderia(1, 3, new Energia("110")));
		System.out.println(apto);
	}

}