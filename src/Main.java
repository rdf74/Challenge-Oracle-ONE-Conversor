/*
 * Author: defeudis@yahoo.com
 * date: 13/09/2023
 * Main Class
 */

import conversores.ConversorDeMonedas;
import conversores.ConversorDeMedidas;
import conversores.ConversorDeTemperatura;

import pantallas.Pantallas;




public class Main {
	public static void main(String[] args) {
		//Opciones de conversores
		Object[] opcionesValores= {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Medidas"};
		
		//Captura de errores
		try {
			//llamada al selector de opciones para seleccionar el tipo de conversor, 
			//se envian titulo, mensaje y opciones
			Object opcionSeleccionada = Pantallas.Selector("Conversor", "Seleccione una opcion", opcionesValores);
			
			//dependiendo de la opcion seleccionada se llama al conversor que corresponde
			if(opcionSeleccionada==opcionesValores[0]) {
				ConversorDeMonedas.Monedas();
			}else if(opcionSeleccionada==opcionesValores[1]) {
				ConversorDeTemperatura.Temperatura();
			}else if(opcionSeleccionada==opcionesValores[2]) {
				ConversorDeMedidas.Medida();
			}else {
				Pantallas.Dialogo("La opcion no es valida");
			}
			
			//ventana de desea continuar
			int continuar = Pantallas.Confirmacion("Conversor", "Desea Continuar");
			
			//si desea continuar se vuelve a llamar a la funcion
			// de lo contrariose envia el mensaje de finalizacion
			if(continuar==0) {
				Main.main(args);
			}else {
				Pantallas.Dialogo("Programa Finalizado");
			}
		}catch(Exception e) {
			Pantallas.Dialogo("Ha ocurrido un error:" + e);
		}
		
	}

}
