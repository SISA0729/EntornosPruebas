package zzz;

public class CalculadoraImpuestos {

    private double tasaIVA;

    public CalculadoraImpuestos(double tasaIVA) {
        this.tasaIVA = tasaIVA;
    }

    public double calcularIVA(double monto) {
        return monto * tasaIVA;
    }
}