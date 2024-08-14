package ups.poo.mvc;

import java.util.ArrayList;
import java.util.Scanner;

public class VistaEstudiante {
	private Scanner scanner = new Scanner(System.in);

	public void listar(ArrayList<Estudiante> estudiantes) {
		System.out.println();
		for (Estudiante est : estudiantes) {
			System.out.println(est.toString());
		}
	}

	public int seleccionarEstudiante(ArrayList<Estudiante> estudiantes) {
		System.out.println("\nSelecciona el número del estudiante que deseas actualizar:");
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(i + ": " + estudiantes.get(i).getNombre());
		}
		int indice = -1;
		do {
			System.out.print("\nNúmero del estudiante: ");
			indice = scanner.nextInt();
		} while (indice < 0 || indice >= estudiantes.size());

		return indice;
	}

	public int obtenerNotaParcial1() {
		System.out.print("\nIngresa la nueva nota del parcial 1: ");
		return validarNota(scanner.nextInt());
	}

	public int obtenerNotaParcial2() {
		System.out.print("\nIngresa la nueva nota del parcial 2: ");
		return validarNota(scanner.nextInt());
	}

	private int validarNota(int nota) {
		while (nota < 0 || nota > 50) {
			System.out.println("\nError: La nota debe ser entre 0 y 50.");
			System.out.print("Vuelva a ingresar la nota: ");
			nota = scanner.nextInt();
		}
		return nota;
	}
}
