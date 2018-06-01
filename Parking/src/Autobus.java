
public class Autobus  extends Vehiculo{
int asientos;
String compañia;
public Autobus(String matricula, String marca, String modelo, int asientos, String compañia) {
	super(matricula, marca, modelo);
	this.asientos = asientos;
	this.compañia = compañia;
}
public int getAsientos() {
	return asientos;
}
public void setAsientos(int asientos) {
	this.asientos = asientos;
}
public String getCompañia() {
	return compañia;
}
public void setCompañia(String compañia) {
	this.compañia = compañia;
}
@Override
public String toString() {
	return "Autobus [asientos=" + asientos + ", compañia=" + compañia + "]";
}

}
