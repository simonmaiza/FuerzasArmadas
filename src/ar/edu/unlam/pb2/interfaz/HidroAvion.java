package ar.edu.unlam.pb2.interfaz;

public class HidroAvion extends Vehiculo implements Volador, Acuatico {
	private Double altura;
	private Double profundidad;

	public HidroAvion(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.altura = 0.0;
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return this.altura;
	}

}
