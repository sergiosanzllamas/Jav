
public class Persona {
protected String nombre;
protected String apellidos;
protected int edad;
protected char sexo;
public Persona(String nombre, String apellidos, int edad, char sexo) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	this.sexo = sexo;
}
protected String getNombre() {
	return nombre;
}
protected void setNombre(String nombre) {
	this.nombre = nombre;
}
protected String getApellidos() {
	return apellidos;
}
protected void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
protected int getEdad() {
	return edad;
}
protected void setEdad(int edad) {
	this.edad = edad;
}
protected char getSexo() {
	return sexo;
}
protected void setSexo(char sexo) {
	this.sexo = sexo;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + "]";
}




	


}
