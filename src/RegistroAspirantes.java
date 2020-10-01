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
		
		liberarMemoria();
		
		System.out.println("-------------------------------");
		
		if(listaAspirantes.size()==0) {
			folio = 1;
		}else {
			folio = listaAspirantes.get(listaAspirantes.size()-1).getFolio()+1;
			
		}
		
		listaAspirantes.add(new Aspirante(folio, nombre, (byte)edad, redes));
		
	}
	
	public String eliminarAspirante() {
		int folio;
		int cont=0;
		
		if(listaAspirantes.size()!=0) {
			while(true) {
				System.out.print("Introduce folio del aspirante a eliminar: ");
				folio = entrada.nextInt();
				
				if(folio<=0) {
					System.out.println("Folio invalido, por favor prueba de nuevo");
				}else {
					break;
				}
			}
			
			for (Aspirante aspirante : listaAspirantes) {
				if(folio==aspirante.getFolio()) {
					return "Se elimino: " + listaAspirantes.remove(cont);
				}
				cont++;
			}
			
			return "No se encontro al aspirante";
		}else {
			return "No hay aspirantes";
		}
	}
	
	public void mostrarAspirantes() {
		if(listaAspirantes.size()==0) {
			System.out.println("No hay aspirantes");
		}else {
			System.out.println("\n-------------------------------");
			for (Aspirante aspirante : listaAspirantes) {
				System.out.println(aspirante);
			}
			System.out.println("-------------------------------\n");
		}
	}
	
	public void liberarMemoria() {
		entrada.nextLine();
	}
	
	public String buscarAspirante() {
		
		if(listaAspirantes.size()!=0) {
		    int folio;
		
		    while(true) {
			    System.out.print("Introduce folio del aspirante a buscar: ");
			    folio = entrada.nextInt();
			
			    if(folio<=0) {
				    System.out.println("Folio invalido, por favor prueba de nuevo");
			    }else {
				    break;
			    }
		    }
		
		    for (Aspirante aspirante : listaAspirantes) {
			    if(folio==aspirante.getFolio()) {
				    return "Encontrado: " + aspirante;
			    }
		    }
		
		    return "No se encontro al aspirante";
	    }else {
		    return "No hay aspirantes";
	    }
	}
}
