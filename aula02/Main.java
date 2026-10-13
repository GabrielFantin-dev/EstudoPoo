package condominio;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		boolean encontrado = false;
		Scanner teclado = new Scanner(System.in);
		boolean rodando = true;
		
		
		ArrayList <Apartamento> apartamentos = new ArrayList<>();
		Apartamento apto2 = new Apartamento(1, 5, new Lavanderia(1, 3 , new Energia("220W")));
		Apartamento apto3 = new Apartamento(2, 6, new Lavanderia (2, 6 , new Energia("220W")));
		Apartamento apto4 = new Apartamento(3, 7, new Lavanderia (3, 10 , new Energia("220W")));
		Apartamento apto5 = new Apartamento(4, 8, new Lavanderia (4, 12 , new Energia("220W")));
		apartamentos.add(apto2);
		apartamentos.add(apto3);
		apartamentos.add(apto4);
		apartamentos.add(apto5);
		
		while(rodando) {
			
			System.out.println("Consulta de Apartamentos.");
			System.out.println("=========================");
			
			System.out.println("Qual opção deseja continuar?");
			System.out.println("1 - Apartamento individual?");
			System.out.println("2 - Todos os Apartamentos?");
			System.out.println("3 - Sair do App");
			int açao = teclado.nextInt();
		
			if (açao == 1) {
				System.out.println("Qual numero do apartamento?");
				int apto = teclado.nextInt();
				
			}
		
		
		teclado.close();
	}

}
}







		

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