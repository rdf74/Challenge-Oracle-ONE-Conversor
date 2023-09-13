/*
 * Author: defeudis@yahoo.com
 * date: 13/09/2023
 * ConversorDeMedidas Class
 */
package conversores;

import java.text.DecimalFormat;

import pantallas.Pantallas;



public class ConversorDeMedidas {
	
	//metodo para el conversor de medidas
	public static void Medida() {
		
		String[] opcionesConversiones = {"Centimetros a Pulgadas", "Pulgadas a Centimetros"};
		DecimalFormat df = new DecimalFormat("#.####");
		
		try {
			//llamada a la pantalla para que el usuario ingrese la cantidad
			String cantidad = Pantallas.Entrada("Ingrese la cantidad que desea convertir");
			
			//llamada  a la pantalla para que el usuario seleccione la conversion
			Object opcionSeleccionada = Pantallas.Selector("Seleccione una opcion", "Conversor Medidas", opcionesConversiones);
			
			//conversion respectiva dependiendo la opcion 
			//y llamada a la pantalla que muestra el resultado
			if(opcionSeleccionada == opcionesConversiones[0]) {
				double total = Double.parseDouble(cantidad)/2.54;
				Pantallas.Dialogo(cantidad + " cm centimetros son " + df.format(total) + " in pulgadas");
			} else if(opcionSeleccionada == opcionesConversiones[1]){
				double total = Double.parseDouble(cantidad)*2.54;
				Pantallas.Dialogo(cantidad + " in pulgadas son " + df.format(total) + " cm centimetros");
			
			} else {
				Pantallas.Dialogo("La opcion seleccionada no es valida");
			}
			
		} catch (NumberFormatException e) {
			Pantallas.Dialogo("El valor ingresado no es valido");
		} catch (Exception e) {
			Pantallas.Dialogo("Ha ocurrido el error: " + e);
		}		
	}
}

