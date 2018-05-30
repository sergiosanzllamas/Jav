
public class Profesor extends Persona {

String categoria;

public Profesor(String nombre, String apellidos, int edad, char sexo, String categoria) {
	super(nombre, apellidos, edad, sexo);
	this.categoria = categoria;
}

protected String getCategoria() {
	return categoria;
}

protected void setCategoria(String categoria) {
	this.categoria = categoria;
}

@Override
public String toString() {
	return "Profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo
			+ ", categoria=" + categoria + "]";
}
	

}
