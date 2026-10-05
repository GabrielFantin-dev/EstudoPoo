package condominio;

public class Energia {
	private String tipoEnergia;

	public Energia(String tipoEnergia) {
		this.tipoEnergia = tipoEnergia;
	}
	@Override
	public String toString() {
		return "Energia [tipoEnergia=" + tipoEnergia + "]";
	}

	public String getTipoEnergia() {
		return tipoEnergia;
	}

	public void setTipoEnergia(String tipoEnergia) {
		this.tipoEnergia = tipoEnergia;
	}
	
	
}
