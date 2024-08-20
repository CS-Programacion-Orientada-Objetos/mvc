package ups.poo.mvc;

import java.util.ArrayList;

public class Main {
	
	private static ArrayList<Estudiante> cargarBDD(){
		// Crear el ArrayList de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        // Agregar dos estudiantes al ArrayList
        estudiantes.add(new Estudiante("Juan Pérez", 25, 40));
		estudiantes.add(new Estudiante("María López", 35, 47));
		// Retornar la lista
		return estudiantes;
	}

	public static void main(String[] args) {
        // Crear la vista
        VistaEstudiante vista = new VistaEstudiante();

        // Crear el controlador
        ControladorEstudiante controlador = new ControladorEstudiante(cargarBDD(), vista);

        // Agregar otro estudiantes al ArrayList
        controlador.agregarEstudiante(new Estudiante("Carlos Gómez", 47, 44));
        
        // Mostrar los detalles de los estudiantes
        controlador.actualizarVista();

        // Modificar los datos de uno de los estudiantes solicitando datos desde la vista
        controlador.actualizarEstudiante();

        // Mostrar los detalles de los estudiantes después de la actualización
        controlador.actualizarVista();

	}

}
