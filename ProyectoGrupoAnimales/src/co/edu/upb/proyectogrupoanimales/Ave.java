package co.edu.upb.proyectogrupoanimales;

public class Ave extends Animal{
	
	private TipoAve tipoAve;
	private TipoPico tipoPico;
	
	public Ave(String nombreEspecie) {
		super(nombreEspecie);
	}
	
	public Ave(String nombreEspecie, TipoAve tipoAve ) {
		super(nombreEspecie);
		setTipoAve(tipoAve);
	}
	
	public TipoAve getTipoAve() {
		return tipoAve;
	}
	
	public void setTipoAve(TipoAve tipoAve) {
		this.tipoAve = tipoAve;
	}
	
	public TipoPico getTipoPico() {
		return tipoPico;
	}
	
	public void setTipoPico(TipoPico tipoPico) {
		this.tipoPico = tipoPico;
	}

	@Override
	public String getOnomatopeya() {
		return "Sonido de Ave";
	}
	
} // public class Ave extends Animal
