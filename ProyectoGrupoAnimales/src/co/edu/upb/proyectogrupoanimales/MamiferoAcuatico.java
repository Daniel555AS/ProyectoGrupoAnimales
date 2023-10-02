package co.edu.upb.proyectogrupoanimales;

public class MamiferoAcuatico extends Mamifero {
	
	private int minutosContieneRespiracion;
	
	public MamiferoAcuatico(String nombreEspecie) {
		super(nombreEspecie);
	}
	
	public int getMinutosContieneRespiracion() {
		return minutosContieneRespiracion;
	}
	
	public void setMinutosContieneRespiracion(int minutosContieneRespiracion) {
		this.minutosContieneRespiracion = minutosContieneRespiracion;
	}
	
	@Override
	public String getOnomatopeya() {
		return "Sonido de Mamifero Acuatico";
	}
	
} // public class MamiferoAcuatico extends Mamifero
