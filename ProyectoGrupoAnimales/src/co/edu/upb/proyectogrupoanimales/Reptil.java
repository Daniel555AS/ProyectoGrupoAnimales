package co.edu.upb.proyectogrupoanimales;

public class Reptil extends Animal {
	
	TipoReptil tipoReptil;
	
	public Reptil(String nombreEspecie) {
		super(nombreEspecie);
	}
	
	public Reptil(String nombreEspecie, TipoReptil tipoReptil) {
		super(nombreEspecie);
		setTipoReptil(tipoReptil);
	}
	
	public TipoReptil getTipoReptil() {
		return tipoReptil;
	}
	
	public void setTipoReptil(TipoReptil tipoReptil) {
		this.tipoReptil = tipoReptil;
	}
	
	@Override
	public String getOnomatopeya() {
		return "Sonido de Reptil";
	}

} // public class Reptil extends Animals
