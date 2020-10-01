
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		RegistroAspirantes ra = new RegistroAspirantes();
		Scanner entrada = new Scanner(System.in);
		boolean candado = true;
		
		System.out.println("---------------------\nRegistro de aspirantes a universidad\n---------------------");
		
		while(candado) {
			try {
			    System.out.println("1.- Registrar aspirante");
			    System.out.println("2.- Mostrar aspirantes");
			    System.out.println("3.- Buscar aspirante");
			    System.out.println("4.- Eliminar aspirantes");
			    System.out.println("5.- Salir");
			    System.out.print("Introduce opcion: ");
			    int opcion = entrada.nextInt();
			
			    switch(opcion) {
			    case 1:
			    	ra.registroAspirante();
				    break;
			    case 2:
			    	ra.mostrarAspirantes();
				    break;
			    case 3:
			    	System.out.println("\n-------------------------------");
			    	System.out.println(ra.buscarAspirante());
			    	System.out.println("-------------------------------\n");
				    break;
			    case 4:
			    	System.out.println("\n-------------------------------");
			    	System.out.println(ra.eliminarAspirante());
			    	System.out.println("-------------------------------\n");
				    break;
			    case 5:
				    candado = false;
				    break;
			    default:
				    System.out.println("Opcion invalida, por favor vuelve intentarlo");
				    break;
			    }
			}catch(InputMismatchException error) {
				System.out.println("\nError de entrada<" + error + "> por favor vuelve a intentarlo\n");
				entrada.nextLine();
				ra.liberarMemoria();
			}
			
		}
		System.out.println("X.X");
		
	}

}
