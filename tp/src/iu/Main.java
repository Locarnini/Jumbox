package iu;

import javax.swing.JOptionPane;

import logica.*;

public class Main {

	public static void main(String[] args) {

		String[] Opciones = { "ventas", "prueba2", "salir" };

		int op = 0;

		do {

			op = JOptionPane.showOptionDialog(null, "Menu principal", null, op, op, null, Opciones, Opciones[0]);

			switch (op) {
			case 0:

				PantallaVenta interfazVenta = new PantallaVenta();
				Venta nuevaVta = new Venta();
				/*
				 * Producto producto = new Producto ("carne", 20);
				 * nuevaVta.getProductos().add(producto);
				 * nuevaVta.setPrecio(nuevaVta.calcularPrecio());
				 */
				interfazVenta.Menu(nuevaVta);

				break;

			case 1:

				JOptionPane.showMessageDialog(null, "elegiste prueba 2");

				break;

			case 2:

				JOptionPane.showMessageDialog(null, "elegiste salir");

				break;

			default:
				break;
			}

		} while (op != 2);

	}

}
