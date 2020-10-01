import java.util.ArrayList;
import java.util.Scanner;

public class RegistroAspirantes {
	
    ArrayList<Aspirante> listaAspirantes;
    Scanner entrada = new Scanner(System.in);
	
	public RegistroAspirantes() {listaAspirantes = new ArrayList<Aspirante>();}
	
	public void registroAspirante() {
		
		String[] redes;
		byte edad;
		int folio;
		
		System.out.println("-------------------------------");
		
		System.out.println("\nIntroduce nombre: ");
		String nombre = entrada.nextLine();

		System.out.println("\nIntroduce redes sociales.\nej.(Facebook, Twitter, instagram):");
		redes = entrada.nextLine().replace(" ", "").split(",");

		while(true) {
			System.out.println("\nIntroduce edad: ");
			edad = entrada.nextByte();
			
			if(edad>17) {
				break;
			}else {
				System.out.println("No puedes ingresar esa edades menores\nde 17, por favor prueba de nuevo");
			}
		}
		
		entrada.nextLine();
		
		System.out.println("-------------------------------");
		
		if(listaAspirantes.size()==0) {
			folio=0;
			listaAspirantes.add(new Aspirante(folio, nombre, (byte)edad, redes));
		}else {
			folio = listaAspirantes.get(listaAspirantes.size()-1).getFolio()+1;
			listaAspirantes.add(new Aspirante(folio, nombre, (byte)edad, redes));
		}
		
		
	}
	
}
