package umg.ejercicios.pkg3;

public class clsGrupo3 {
    private double radio;
    private double altura;

    // Constructor
    public clsGrupo3(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    // Método para calcular el volumen
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
