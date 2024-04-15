package ejerciciosCajaNegra.ejercicio1;

public class Excursion {
    private int numeroAlumnos;

    public Excursion(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public double calcularPrecioAlumno(){
        return 0;
    }
    public double calcularCosteExcursion(){
        return 0;
    }

    @Override
    public String toString() {
        return "Numero de alumnos\n=================\n" +
                numeroAlumnos;

    }

}
