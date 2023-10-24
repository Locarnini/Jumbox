package logica;

import java.util.LinkedList;

public class Venta {

	private LinkedList<Producto> productos = new LinkedList<Producto>();

	/* borrar el linked list del constructor */

	public double calcularPrecio() {

		double total = 0;

		for (Producto producto : productos) {

			/* total = total + producto.getPrecio(); */
		}

		return total;
		/* en el constructor this.precio = calcularPrecio(); */
	}

}
