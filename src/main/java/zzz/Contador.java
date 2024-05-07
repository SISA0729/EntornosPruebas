package zzz;

public class Contador {

    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public int obtenerValor() {
        return this.valor;
    }

    public void incrementar() {
        this.valor++;
    }

    public void decrementar() {
        if (this.valor > 0) {
            this.valor--;
        }
    }
}
