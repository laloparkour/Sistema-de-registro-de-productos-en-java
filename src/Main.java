import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Crear el sistema de una tienda que maneje varios productos, cada producto se caracteriza por un código y un precio. 
		Además, al llegar desde la fábrica a la tienda el producto queda inventariado, 
		en este mismo proceso se le asigna un beneficio por producto con lo que su precio al público aumenta. 
		Creé una clase Producto inventariado que herede de Producto junto a un programa que pueda manejar esta clase. */
		
		Scanner teclado =  new Scanner(System.in);
		boolean on = true;
		int opc = 0;
		
		ArrayList<ProductoInventariado> mercancia = new ArrayList<ProductoInventariado>();
		
		while(on) {
			System.out.println("Capturar producto(1), salir (2)");
			opc = teclado.nextInt();
			
			switch (opc) {
			case 1:
				ProductoInventariado merca = new ProductoInventariado();

				System.out.println("1.-Codigo: ");
				merca.setCodigo(teclado.next());
				
				System.out.println("2.-Precio: ");
				merca.setPrecio(teclado.nextDouble());
				
				System.out.println("3.-Beneficio: ");
				merca.setBeneficio(teclado.nextDouble());
				
				merca.setAumento(merca.getPrecio(), merca.getBeneficio());
				
				mercancia.add(merca);
				System.out.println(merca.toString());
				
				break;
			default:
				on = false;
				break;
			}
		}
		
	}

}
