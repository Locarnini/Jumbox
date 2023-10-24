package logica;

import javax.swing.JOptionPane;

public interface IngresoSesion {

	public default boolean Ingresar(String nombre, String contrasenia) {

		if (nombre.isEmpty() || contrasenia.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No se pudo ingresar");
			return false;
		} else {
			JOptionPane.showMessageDialog(null, "Bienvenido");
			return true;
		}

	}

}
