package ups.poo.mvc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 // Crear el ArrayList de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // Crear la vista
        VistaEstudiante vista = new VistaEstudiante();

        // Crear el controlador
        ControladorEstudiante controlador = new ControladorEstudiante(estudiantes, vista);

        // Agregar tres estudiantes al ArrayList
        controlador.agregarEstudiante(new Estudiante("Juan Pérez", 25, 40));
        controlador.agregarEstudiante(new Estudiante("María López", 35, 47));
        controlador.agregarEstudiante(new Estudiante("Carlos Gómez", 47, 44));
        
        // Mostrar los detalles de los estudiantes
        controlador.actualizarVista();

        // Modificar los datos de uno de los estudiantes solicitando datos desde la vista
        controlador.actualizarEstudiante();

        // Mostrar los detalles de los estudiantes después de la actualización
        controlador.actualizarVista();

	}

}
