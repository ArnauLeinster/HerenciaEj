package ejercicio5;

public class Aula {
	int id;
	int nEstu;
	String asignatura;

	public Aula(int id, int nEstu, String asignatura) {

		this.id = id;
		this.nEstu = nEstu;
		this.asignatura = asignatura;

	}

	public boolean checkAula(Estudiante[] clase, Profesor p) {
		boolean result = true;
		int pres = 0;

		if (!(p.getAsignatura().equalsIgnoreCase(this.getAsignatura()))) {
			result = false;
		}

		if (!(p.isPresente())) {
			result = false;
		}

		for (int i = 0; i < clase.length; i++) {
			if (clase[i].isPresente()) {
				pres++;
			}
		}

		if ((this.getnEstu() / 2) > pres) {
			result = false;
		}

		return result;
	}

	public void contarM(Estudiante[] clase) {
		// TODO Auto-generated method stub
		int h = 0;
		int m = 0;
		for (int i = 0; i < clase.length; i++) {
			if (clase[i].isPresente()) {
				if (clase[i].getNota() >= 5) {
					if (clase[i].getSexo().equalsIgnoreCase("Hombre")) {
						h++;
					} else {
						m++;
					}
				}
			}
		}
		System.out.println("la clase tiene " + h + "chicos aprobados");
		System.out.println("la clase tiene " + m + "chicas aprobados");

	}
	
	public static void generarClase(Estudiante[] clase) {
		Estudiante e0 = new Estudiante("Sandra", 9, "Mujer", 3);
		Estudiante e1 = new Estudiante("Juan", 10, "Hombre", 7);
		Estudiante e2 = new Estudiante("Sara", 10, "Mujer", 4);
		Estudiante e3 = new Estudiante("Eloi", 10, "Hombre", 5);
		Estudiante e4 = new Estudiante("Andrea", 10, "Mujer", 8);
		Estudiante e5 = new Estudiante("Javier", 9, "Hombre", 3);
		Estudiante e6 = new Estudiante("Marina", 9, "Mujer", 10);
		Estudiante e7 = new Estudiante("Raul", 9, "Hombre", 4);
		Estudiante e8 = new Estudiante("Marta", 9, "Mujer", 9);
		Estudiante e9 = new Estudiante("Filipo", 9, "Hombre", 6);
		
		clase[0] = e0;
		clase[1] = e1;
		clase[2] = e2;
		clase[3] = e3;
		clase[4] = e4;
		clase[5] = e5;
		clase[6] = e6;
		clase[7] = e7;
		clase[8] = e8;
		clase[9] = e9;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getnEstu() {
		return nEstu;
	}

	public void setnEstu(int nEstu) {
		this.nEstu = nEstu;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}
