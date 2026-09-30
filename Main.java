package conta;

public class Main {
	
	public static void main(String[]args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.settitular("Gabriel");
		System.out.println(conta.gettitular("Gabriel"));
		conta.setsaldo();
		System.out.print(conta.getsaldo());
	}
	
}
