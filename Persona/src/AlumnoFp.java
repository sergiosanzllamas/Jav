
public class AlumnoFp extends Alumno {

	String ciclo;

	public AlumnoFp(String nombre, String apellidos, int edad, char sexo, boolean becado, String ciclo) {
		super(nombre, apellidos, edad, sexo, becado);
		this.ciclo = ciclo;
	}

	protected String getCiclo() {
		return ciclo;
	}

	protected void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	@Override
	public String toString() {
		return "AlumnoFp [becado=" + becado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", sexo=" + sexo + ", ciclo=" + ciclo + "]";
	}
	
}
