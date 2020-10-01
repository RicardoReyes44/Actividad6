import java.util.ArrayList;
import java.util.Scanner;

public class RegistroAspirantes {
	
    ArrayList<Aspirante> listaAspirantes;
    Scanner entrada = new Scanner(System.in);
	
	public RegistroAspirantes() {listaAspirantes = new ArrayList<Aspirante>();}
	
	public void ingresarAspirante() {
		
		String[] redes;
		byte edad;
		
		System.out.println("Introduce nombre: ");
		String nombre = entrada.nextLine();

		System.out.println("Introduce redes sociales, ej: Facebook, Twitter, instagram");
		redes = entrada.nextLine().replace(" ", "").split(",");

		while(true) {
			System.out.println("Introduce edad: ");
			edad = entrada.nextByte();
			
			if(edad>17) {
				break;
			}else {
				System.out.println("No puedes ingresar esa edades menores\nde 18,por favor prueba de nuevo");
			}
		}
		
		listaAspirantes.add(new Aspirante(nombre, (byte)edad, redes));
		
	}
	
	public void eliminarAspirante() {
		
	}
	
	public void mostrarAspirantes() {
		
	}
	
}
