package co.edu.upb.proyectogrupoanimales;

public abstract class Animal {
	
	private String nombreEspecie;
	private int expectativaDeVida; // Expresada en años
	private double pesoLbs;
	private int altoCms;
	private int largoCms;
	private int anchoCms;
	
	public Animal(String nombreEspecie) {
		setNombreEspecie(nombreEspecie);
	}
	
	public String getNombreEspecie() {
		return nombreEspecie;
	}
	
	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}
	
	public int getExpectativaDeVida() {
		return expectativaDeVida;
	}
	
	public void setExpectativaDeVida(int expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}
	
	public double getPesoLbs() {
		return pesoLbs;
	}
	
	public void setPesoLbs(double pesoLbs) {
		this.pesoLbs = pesoLbs;
	}
	
	public int getAltoCms() {
		return altoCms;
	}
	
	public void setAltoCms(int altoCms) {
		this.altoCms = altoCms;
	}
	
	public int getLargoCms() {
		return largoCms;
	}
	
	public void setLargoCms(int largoCms) {
		this.largoCms = largoCms;
	}
	
	public int getAnchoCms() {
		return anchoCms;
	}
	
	public void setAnchoCms(int anchoCms) {
		this.anchoCms = anchoCms;
	}
	
	public abstract String getOnomatopeya();

} // public abstract class Animal
