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

			System.out.println("la clase tiene " + h + "chicos aprobados");
			System.out.println("la clase tiene " + m + "chicas aprobados");
		}

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
