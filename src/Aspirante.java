import java.util.Arrays;

class Aspirante{
	
	//folio
	private String nombre;
	private byte edad;
	private String redesSociales[];
	
	public Aspirante() {}
	public Aspirante(String nombre, byte edad, String[] redesSociales) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.redesSociales = redesSociales;
	}
	
	@Override
	public String toString() {
		return "Aspirante [nombre=" + nombre + ", edad=" + edad + ", redesSociales=" + Arrays.toString(redesSociales)
				+ "]";
	}

}//class Aspirante
