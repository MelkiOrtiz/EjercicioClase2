package umg.ejercicios.pkg1;

public class clsGrupo1 {
    private double lado;

    // Constructor
    public clsGrupo1(double lado) {
        this.lado = lado;
    }

    // Método para calcular el volumen
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}