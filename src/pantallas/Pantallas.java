/*
 * Author: defeudis@yahoo.com
 * date: 13/09/2023
 * Pantallas Class
 */
package pantallas;

import javax.swing.JOptionPane;

public class Pantallas {

	/*
	 * Metodo para mostrar un cuadro de dialogo
	 * Params: mensaje - mensaje a mostrar
	 * */
	public static void Dialogo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	/*
	 * Metodo para mostrar un cuadro de seleccion
	 * Params: titulo- titulo de la ventana, mensaje - mensaje a mostrar, opciones - posibles opciones a seleccionar
	 * Return: retorna la opcion seleccionada
	 * */	
	public static Object Selector(String titulo, String mensaje, Object[] opciones) {
		Object opcionSeleccionada = JOptionPane.showInputDialog(null,
					mensaje,
					titulo,
					JOptionPane.INFORMATION_MESSAGE, 
					null,
					opciones, 
					opciones[0]);
		return opcionSeleccionada;
	}
	
	/*
	 * Metodo para mostrar una entrada de texto o numero
	 * Params: mensaje - mensaje a mostrar
	 * Return: retorna la entrada ingresada por el usuario
	 * */
	public static String Entrada(String mensaje) {
		String datos = JOptionPane.showInputDialog(mensaje);
		return datos;
	}
	
	/*
	 * Metodo para mostrar un cuadro de confirmacion
	 * Params: titulo- titulo de la ventana, mensaje - mensaje a mostrar
	 * Return: retorna un entero que representa la opcion seleccionada 1 para no, 0 para si
	 * */
	public static int Confirmacion(String titulo, String mensaje) {
		int opcion = JOptionPane.showConfirmDialog(null,
	             mensaje, titulo, JOptionPane.YES_NO_OPTION);
		return opcion;
	}
}
