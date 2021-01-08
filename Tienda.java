package actvidadT10;

import java.util.HashMap;

public class Tienda {

	public static void main(String[] args) {
		Producto televisorSony = new Producto("Televisor Sony 45", 499.99, "Nuevo televisor de Sony 45 pulgadas.");
		Producto televisorSamsung = new Producto("Televisor Samsung 45", 399.99, "Nuevo televisor de Samsung 45 pulgadas.");
		Producto televisorSonyAnt = new Producto("Televisor Sony 45", 499.99, "Versión antigua del televisor de Sony 45 pulgadas.");
		
		HashMap<Producto, Integer> productosStock = new HashMap<Producto, Integer>();
		productosStock.put(televisorSony, 20);
		productosStock.put(televisorSamsung, 10);
		productosStock.put(televisorSonyAnt, 2);
		
		System.out.println("##### Mostramos el hashMap de 2 elementos #####");
		productosStock.forEach((producto, stock)-> {
			System.out.println("Producto: " + producto.nombre + " \r ·Precio: " + producto.precio + "€ \r ·Descripción: " + producto.descripcion + " \r ·En Stock: " + stock);
		});
		
		Producto televisorPanasonic = new Producto("Televisor Panasonic 65", 1599.99, "Nueva versión del televisor de Panasonic 65 pulgadas.");
		productosStock.put(televisorPanasonic, 6);
		productosStock.remove(televisorSonyAnt, 2);
		
		System.out.println("\n##### Mostramos el hashMap de 2 elementos #####");
		productosStock.forEach((producto, stock)-> {
			System.out.println("Producto: " + producto.nombre + " \r ·Precio: " + producto.precio + "€ \r ·Descripción: " + producto.descripcion + " \r ·En Stock: " + stock);
		});
	}

}
