
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		RegistroAspirantes ra = new RegistroAspirantes();
		Scanner entrada = new Scanner(System.in);
		boolean candado = true;

		
		while(candado) {
			try {
			    System.out.println("1.- Registrar aspirante");
			    System.out.println("2.- Mostrar aspirantes");
			    System.out.println("3.- Salir");
			    System.out.print("Introduce opcion: ");
			    int opcion = entrada.nextInt();
			
			    switch(opcion) {
			    case 1:
				    break;
			    case 2:
				    break;
			    case 3:
				    candado = false;
				    break;
			    default:
				    System.out.println("Opcion invalida, por favor vuelve intentarlo");
				    break;
			    }
			}catch(InputMismatchException error) {
				System.out.println("Error de entrada<" + error + "> por favor vuelve a intentarlo");
				entrada.nextLine();
			}
			
		}
		System.out.println("X.X");
		
	}

}
