/*
 * Author: defeudis@yahoo.com
 * date: 13/09/2023
 * ConversorDeTemperatura Class
 */
package conversores;

import java.text.DecimalFormat;

import pantallas.Pantallas;

public class ConversorDeTemperatura {

	//metodo para el conversor de temperatura
	public static void Temperatura() {
		
		String[] opcionesConversiones = {"Farenheit a Celcius", "Celcius a Farenheit"};
		DecimalFormat df = new DecimalFormat("#.##");
		
		try {
			//llamada a la pantalla para que el usuario ingrese la cantidad
			String cantidad = Pantallas.Entrada("Ingrese la cantidad que desea convertir");
			
			//llamada  a la pantalla para que el usuario seleccione la conversion
			Object opcionSeleccionada = Pantallas.Selector("Seleccione una opcion", "Conversor Temperatura",opcionesConversiones);
			
			//conversion respectiva dependiendo la opcion 
			//y llamada a la pantalla que muestra el resultado
			if(opcionSeleccionada == opcionesConversiones[0]) {
				double total = (5*(Double.parseDouble(cantidad)- 32))/9;
				Pantallas.Dialogo(cantidad + "°F farenheit son " + df.format(total) + " °C celcius");
			} else if(opcionSeleccionada == opcionesConversiones[1]){
				double total = (Double.parseDouble(cantidad)*9/5)+32;
				Pantallas.Dialogo(cantidad + "°C celcius son " + df.format(total) + " °F farenheit");
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
