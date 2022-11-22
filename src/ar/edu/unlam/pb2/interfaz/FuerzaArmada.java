package ar.edu.unlam.pb2.interfaz;

import java.util.ArrayList;
import java.util.List;



public class FuerzaArmada {

	private List<Vehiculo> convoy;
	private List<Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy = new ArrayList<Vehiculo>();
		this.batallas = new ArrayList<Batalla>();
	}
	
	public Boolean agregarVehiculo(Vehiculo nuevo) {
		if(existe(nuevo)){
			return false;
		}
		else {
			this.convoy.add(nuevo);
			return true	;
		}
	}
	
	private Boolean existe(Vehiculo aBuscar) {
		for(Vehiculo actual : convoy) {
			if(actual.equals(aBuscar)) {
				return true;
			}
		}
		return false;
	}
	

	public Object getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		Batalla nueva = new Batalla(latitud, longitud, tipo, nombre);
		batallas.add(nueva);		
	}
	
	public void crearBatalla(Batalla nueva) {
		batallas.add(nueva);		
	}

	public Batalla getBatalla(String nombre) {
		for(Batalla actual: batallas) {
			if(actual.getNombre().equals(nombre)) {
				return actual;
			}
		}
		return null;
	}

	public Boolean enviarALaBatalla(String nombreBatalla, Integer codigoDelVehiculo) {
		Vehiculo aEnviar = getVehiculo(codigoDelVehiculo);
		Batalla aCombatir = getBatalla(nombreBatalla);
		
		if(aEnviar!=null && aCombatir != null) {
			return aCombatir.agregarVehiculo(aEnviar);
		}
		return false;
	} 
	
	private Vehiculo getVehiculo(Integer codigo) {
		for(Vehiculo actual: convoy) {
			if(actual.getCodigo().equals(codigo)) {
				return actual;
			}
		}
		return null;
	}
}
