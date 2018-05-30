
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoFp al1 = new AlumnoFp("sergio", "sanz", 19, 'h', true, "dam");
		AlumnoEso alu1 = new AlumnoEso("serf", "sagnz", 12, 'm', false, 4);
		
		Profesor profe1 = new Profesor("Txema", "Gonzalex", 40, 'h', "tutor 1");
		Alumno alo1 = new Alumno("diego", "mopmpo", 19, 'h', false);
		pass pas1 = new pass("señora", "matriculas", 25, 'm', 7);

		Persona per1 = new Persona("aaa", "hshs", 29, 'h');
	
	System.out.println(al1.toString());
	
	}

}
