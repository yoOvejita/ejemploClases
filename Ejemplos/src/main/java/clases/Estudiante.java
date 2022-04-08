package clases;

public class Estudiante extends Persona implements SerHumano, Runnable{
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public void hablar() {
		System.out.println("Primero pienso, luego existo.");
		
	}

	@Override
	public String getGenero() {
		
		return "Genero: No responde";
	}

	@Override
	public void run() {
		System.out.printf("Soy %s en un hilo de ejecución", getNombre());
	}
	
}
