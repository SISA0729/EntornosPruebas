package ejerciciosCajaNegra.ejercicio1;

public class ExcursionMetodosEstaticos {
    Excursion e;

    public static double calcularPrecioAlumno(int numeroAlumnos) {
        if (numeroAlumnos >= 100) {
            return 65;
        } else if (numeroAlumnos >= 50 && numeroAlumnos < 100) {
            return 70;
        } else if (numeroAlumnos >= 30 && numeroAlumnos < 50) {
            return 95;
        } else {
            return 4000/numeroAlumnos;
        }
    }

    public static double calcularCosteExcursion(int numeroAlumnos) {
        if (numeroAlumnos >= 100) {
            return 65 * numeroAlumnos;
        } else if (numeroAlumnos >= 50 && numeroAlumnos < 100) {
            return 70 * numeroAlumnos;
        } else if (numeroAlumnos >= 30 && numeroAlumnos < 50) {
            return 95 * numeroAlumnos;
        } else {
            return 4000;
        }
    }

}
