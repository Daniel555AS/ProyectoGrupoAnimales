package co.edu.upb.proyectogrupoanimales;

public class MamiferoVolador extends Mamifero {

	private boolean alas;
	
	public MamiferoVolador(String nombreEspecie) {
		super(nombreEspecie);
	}
	
	public boolean getAlas() {
		return alas;
	}
	
	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	
	@Override
	public String getOnomatopeya() {
		return "Sonido de Mamifero Volador";
	}
	
} // public class MamiferoVolador extends Mamifero
