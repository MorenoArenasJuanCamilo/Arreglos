import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner leer = new Scanner (System.in); 

		Alumno a[]= new Alumno[10];

		String nombre="";
		String apellido="";
		int semestre=0;
		String jornada="";
		int identificacion=0; 
		float nota = 0;
		float notaMayor = 0;



		for (int i=0;i<a.length;i++) {

			System.out.println("ingresa el nombre");
			nombre = leer.nextLine();

			System.out.println("ingrese el apellido");
			apellido = leer.nextLine();

			System.out.println("ingresa el semestre actual");
			semestre = leer.nextInt();

			System.out.println("ingresa la jornada Diurna, Mixta o nocturna");
			jornada = leer.next();

			System.out.println("digite la identificacion");
			identificacion = leer.nextInt();

			System.out.println("digite la nota del alumno");
			nota = leer.nextFloat();

			if (notaMayor<nota) {

				notaMayor = nota;
			}

			leer.nextLine();
			a[i] = new Alumno(nombre, apellido, semestre, jornada, identificacion, nota, notaMayor);
		}

		for(int i=0;i<a.length;i++) {
			System.out.println ( "Nombre del Alumno" + a[i].getnombre()+"  Apellido del alumno:"+a[i].getApellido()+" Semestre del alumno :"+a[i].getSemestre()+"  Jornada del alumno:"+a[i].getJornada()+"  Identificacion del alumno:"+a[i].getIdentificacion()+"  Nota del alumno:"+a[i].getNota());

		}
		System.out.println("La nota mayor es : "+ notaMayor);

	}
}
