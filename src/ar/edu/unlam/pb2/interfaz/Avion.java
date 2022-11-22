package ar.edu.unlam.pb2.interfaz;

public class Avion extends Vehiculo implements Volador{
	private Double altura;
	
	public Avion(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.altura = 0.0;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}
	
	

}
