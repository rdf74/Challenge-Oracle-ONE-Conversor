/*
 * Author: defeudis@yahoo.com
 * date: 13/09/2023
 * ConversorDeMonedas Class
 */
package conversores;

import java.text.DecimalFormat;

import pantallas.Pantallas;

public class ConversorDeMonedas {
	
	//metodo para el conversor de monedas
	public static void Monedas() {
		
		/*opciones solicidtadas
		- Convertir de la moneda de tu país a Dólar
	    - Convertir de la moneda de tu país  a Euros
	    - Convertir de la moneda de tu país  a Libras Esterlinas
	    - Convertir de la moneda de tu país  a Yen Japonés
	    - Convertir de la moneda de tu país  a Won sul-coreano
		*/
		String[]opcionesConversiones = { "Dolares a Pesos", 
				"Pesos a Dolares", 
				"Euros a Pesos",
				"Pesos a Euros",
				"Libras Esterlinas a Pesos",
				"Pesos a Libras Esterlinas",
				"Yen Japones a Pesos",
				"Pesos a Yen Japones",
				"Won sul-coreano a Pesos",
				"Pesos a Won sul-coreano",};
		
		//formato para la salida
		DecimalFormat df = new DecimalFormat("#.##");
		
		//captura de errores
		try {
			//llamada a la pantallapara que el usuario ingrese la cantidad
			String cantidad = Pantallas.Entrada("Ingrese la cantidad que desea convertir");
			
			//llamada a la pantalla para que el usuario seleccione la opcion de moneda
			Object opcionSeleccionada = Pantallas.Selector("Seleccione una opcion", "Conversor Moneda", opcionesConversiones);
			
			//conversion respectiva dependiendo de la opcion 
			//y llamada a la pantalla que muestra el resultado
			if (opcionSeleccionada == opcionesConversiones[0]) {
				double total = Double.parseDouble(cantidad) * 730;
				Pantallas.Dialogo("$" + cantidad + " dolares son $ " + df.format(total) + " pesos");
			} else if (opcionSeleccionada == opcionesConversiones[1]) {
				double total = Double.parseDouble(cantidad) / 730;
				Pantallas.Dialogo("L" + cantidad + " pesos son $" + df.format(total) + " dolares");
			}else if (opcionSeleccionada == opcionesConversiones[2]) {
				double total = Double.parseDouble(cantidad) * 786;
				Pantallas.Dialogo("€" + cantidad + " euros son L" + df.format(total) + " pesos");
			}else if (opcionSeleccionada == opcionesConversiones[3]) {
				double total = Double.parseDouble(cantidad) / 786;
				Pantallas.Dialogo("L" + cantidad + " pesos son €" + df.format(total) + " euros");
			}else if (opcionSeleccionada == opcionesConversiones[4]) {
				double total = Double.parseDouble(cantidad) * 668.51;
				Pantallas.Dialogo("£" + cantidad + " libras esterlinas son L" + df.format(total) + " pesos");
			}else if (opcionSeleccionada == opcionesConversiones[5]) {
				double total = Double.parseDouble(cantidad) / 668.51;
				Pantallas.Dialogo("L" + cantidad + " pesos son £" + df.format(total) + " libras esterlinas");
			}else if (opcionSeleccionada == opcionesConversiones[6]) {
				double total = Double.parseDouble(cantidad) * 147.11;
				Pantallas.Dialogo("¥" + cantidad + " yen japones son L" + df.format(total) + " pesos");
			}else if (opcionSeleccionada == opcionesConversiones[7]) {
				double total = Double.parseDouble(cantidad) / 147.11;
				Pantallas.Dialogo("L" + cantidad + " pesos son ¥" + df.format(total) + " yen japones");
			}else if (opcionSeleccionada == opcionesConversiones[8]) {
				double total = Double.parseDouble(cantidad) * 1.83;
				Pantallas.Dialogo("₩" + cantidad + " won sul-corenao son L" + df.format(total) + " pesos");
			}else if (opcionSeleccionada == opcionesConversiones[9]) {
				double total = Double.parseDouble(cantidad) / 1.83;
				Pantallas.Dialogo("L" + cantidad + " pesos son ₩" + df.format(total) + " won sul-coreano");
			} else {
				Pantallas.Dialogo("La opcion seleccionada no es valida");
			}
			

		} catch (NumberFormatException e) {
			Pantallas.Dialogo("El valor ingresado no es valido");
		} catch (Exception e) {
			Pantallas.Dialogo("Ha ocurrido el error: \n" + e);
		}
	}
}
