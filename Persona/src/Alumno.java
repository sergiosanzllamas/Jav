
public class Alumno extends Persona {
boolean becado;

public Alumno(String nombre, String apellidos, int edad, char sexo, boolean becado) {
	super(nombre, apellidos, edad, sexo);
	this.becado = becado;
}

protected boolean isBecado() {
	return becado;
}

protected void setBecado(boolean becado) {
	this.becado = becado;
}

@Override
public String toString() {
	return "Alumno [becado=" + becado + "]";
}


}
