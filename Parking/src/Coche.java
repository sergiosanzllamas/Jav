
public class Coche extends Vehiculo {
int dni;
boolean electrico;
public Coche(String matricula, String marca, String modelo, int dni, boolean electrico) {
	super(matricula, marca, modelo);
	this.dni = dni;
	this.electrico = electrico;
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public boolean getElectrico() {
	return electrico;
}
public void setElectrico(boolean electrico) {
	this.electrico = electrico;
}
@Override
public String toString() {
	return "Coche [dni=" + dni + "]";
}

}
