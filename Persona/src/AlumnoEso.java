
public class AlumnoEso  extends Alumno{
int curso;

public AlumnoEso(String nombre, String apellidos, int edad, char sexo, boolean becado, int curso) {
	super(nombre, apellidos, edad, sexo, becado);
	this.curso = curso;
}

protected int getCurso() {
	return curso;
}

protected void setCurso(int curso) {
	this.curso = curso;
}

@Override
public String toString() {
	return "AlumnoEso [becado=" + becado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
			+ ", sexo=" + sexo + ", curso=" + curso + "]";
}
 
}
