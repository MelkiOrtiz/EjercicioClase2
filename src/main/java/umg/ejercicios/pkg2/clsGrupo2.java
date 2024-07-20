package umg.ejercicios.pkg2;

public class clsGrupo2 {
    private double base;
    private double altura;

    // Constructor
    public clsGrupo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

