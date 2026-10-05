package condominio;

public class Lavanderia {
	private int id;
	private int numeroMaquina;
	private Energia energia;
	
	public Energia getEnergia() {
		return energia;
	}


	public void setEnergia(Energia energia) {
		this.energia = energia;
	}


	public Lavanderia(int id, int numeroMaquina, Energia energia) {
		this.id = id;
		this.numeroMaquina = numeroMaquina;
		this.energia = energia;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroMaquina() {
		return numeroMaquina;
	}
	public void setNumeroMaquina(int numeroMaquina) {
		this.numeroMaquina = numeroMaquina;
	}
	@Override
	public String toString() {
		return "Lavanderia [id=" + id + ", numeroMaquina=" + numeroMaquina + ", energia=" + energia + "]";
	}
	
	
}
