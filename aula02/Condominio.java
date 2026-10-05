package condominio;

public class Apartamento {
	private int id;
	private  int numeroApto;
	private  Lavanderia lavanderia;
	
	
	
	public Apartamento(int id, int numeroApto, Lavanderia lavanderia ) {
		this.id = id;
		this.numeroApto = numeroApto;
		this.lavanderia = lavanderia;
	}
	
	
	

	public Lavanderia getLavanderia() {
		return lavanderia;
	}




	public  void setLavanderia(Lavanderia novaLavanderia) {
		lavanderia = novaLavanderia;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroApto() {
		return numeroApto;
	}

	public void setNumeroApto(int numeroApto) {
		this.numeroApto = numeroApto;
	}




	@Override
	public String toString() {
		return "Apartamento [id=" + id + ", numeroApto=" + numeroApto + ", lavanderia=" + lavanderia + "]";
	}
	
	
	
	
}
