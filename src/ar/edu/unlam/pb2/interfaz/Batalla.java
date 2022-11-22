package ar.edu.unlam.pb2.interfaz;

import java.util.ArrayList;
import java.util.List;



public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private String nombre;
	private List<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla (Double latitud, Double longitud, TipoDeBatalla tipo, String nombre) {
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.nombre = nombre;
		this.vehiculosEnLaBatalla = new ArrayList<Vehiculo>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(List<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}
	
	public Boolean agregarVehiculo(Vehiculo nuevo) {
		Boolean resultado = false;
		switch(this.tipo) {
		case TERRESTRE:
			if(nuevo instanceof Terrestre) {
				vehiculosEnLaBatalla.add(nuevo);
				resultado = true;
			}
			break;
		case NAVAL:
			if(nuevo instanceof Acuatico) {
				vehiculosEnLaBatalla.add(nuevo);
				resultado = true;
			}
			break;
		case AEREA:
			if(nuevo instanceof Volador) {
				vehiculosEnLaBatalla.add(nuevo);
				resultado = true;
			}
			break;
		default:
			resultado = false;
		}
		return resultado;
	}
	
}
