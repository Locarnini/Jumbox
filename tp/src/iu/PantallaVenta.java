package iu;

import javax.swing.JOptionPane;

import logica.*;

public class PantallaVenta implements IngresoSesion {

	public void Menu(Venta venta) {

		String nombre;
		String contrasenia;
		do {

			nombre = JOptionPane.showInputDialog("ingrese nombre");
			contrasenia = JOptionPane.showInputDialog("ingrese contrasenia");

		} while (Ingresar(nombre, contrasenia) == false);

		String[] Opciones = { "vta1", "vta2", "salir" };

		int op = 0;

		do {

			op = JOptionPane.showOptionDialog(null, "ventas", null, op, op, null, Opciones, Opciones[0]);

			switch (op) {
			case 0:

				JOptionPane.showMessageDialog(null, "vta 1");

				break;

			case 1:

				JOptionPane.showMessageDialog(null, "vta 2");

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
