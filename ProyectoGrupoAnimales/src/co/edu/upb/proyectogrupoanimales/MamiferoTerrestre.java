package co.edu.upb.proyectogrupoanimales;

public class MamiferoTerrestre extends Mamifero {

	public enum TipoExtremidad {
		PLANTIGRADO,
		DIGITIGRADO,
		UNGULADO
	} // public enum TipoExtremidad
	
	
	private TipoExtremidad tipoExtremidad;
	
	public MamiferoTerrestre(String nombreEspecie) {
		super(nombreEspecie);
	}
	
	public MamiferoTerrestre(String nombreEspecie, TipoExtremidad tipoExtremidad) {
		super(nombreEspecie);
		setTipoExtremidad(tipoExtremidad);
	}
	
	public TipoExtremidad getTipoExtremidad() {
		return tipoExtremidad;
	}
	
	public void setTipoExtremidad(TipoExtremidad tipoExtremidad) {
		this.tipoExtremidad = tipoExtremidad;
	}	
	
	@Override
	public String getOnomatopeya() {
		return "Sonido de Mamifero Terrestre";
	}
	
} // public class MamiferoTerrestre extends Mamifero
