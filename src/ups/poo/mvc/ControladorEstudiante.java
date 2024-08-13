package ups.poo.mvc;

import java.util.ArrayList;

public class ControladorEstudiante {
	private ArrayList<Estudiante> estudiantes;
	private VistaEstudiante vista;

	public ControladorEstudiante(ArrayList<Estudiante> estudiantes, VistaEstudiante vista) {
		this.estudiantes = estudiantes;
		this.vista = vista;
	}

	public void agregarEstudiante(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}

	public void actualizarEstudiante() {
		// Solicitar al usuario que seleccione el estudiante a actualizar
		int indice = vista.seleccionarEstudiante(estudiantes);

		// Solicitar nuevas notas para el estudiante
		int parcial1 = vista.obtenerNotaParcial1();
		int parcial2 = vista.obtenerNotaParcial2();

		// Actualizar los datos del estudiante seleccionado
		Estudiante estudiante = estudiantes.get(indice);
		estudiante.setParcial1(parcial1);
		estudiante.setParcial2(parcial2);
	}

	public void actualizarVista() {
		vista.listar(estudiantes);
	}
}
