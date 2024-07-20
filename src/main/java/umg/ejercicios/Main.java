//package umg.ejercicios;
//
//import java.util.Scanner;
//
//import umg.ejercicios.pkg1.clsGrupo1;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingresa la longitud del lado del cubo: ");
//        double lado = scanner.nextDouble();
//
//        clsGrupo1 cubo = new clsGrupo1(lado);
//        double volumen = cubo.calcularVolumen();
//
//        System.out.println("El volumen del cubo es: " + volumen);
//    }
//}

//----------------------------------------------------------------------------------

//package umg.ejercicios;
//
//import java.util.Scanner;
//
//import umg.ejercicios.pkg2.clsGrupo2;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingresa la longitud de la base del triángulo: ");
//        double base = scanner.nextDouble();
//
//        System.out.print("Ingresa la longitud de la altura del triángulo: ");
//        double altura = scanner.nextDouble();
//
//        clsGrupo2 triangulo = new clsGrupo2(base, altura);
//        double area = triangulo.calcularArea();
//
//        System.out.println("El área del triángulo es: " + area);
//    }
//}

//------------------------------------------------------------------------------------------

//package umg.ejercicios;
//
//import java.util.Scanner;
//
//import umg.ejercicios.pkg3.clsGrupo3;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingresa el radio de la base del cilindro: ");
//        double radio = scanner.nextDouble();
//
//        System.out.print("Ingresa la altura del cilindro: ");
//        double altura = scanner.nextDouble();
//
//        clsGrupo3 cilindro = new clsGrupo3(radio, altura);
//        double volumen = cilindro.calcularVolumen();
//
//        System.out.println("El volumen del cilindro es: " + volumen);
//    }
//}

//--------------------------------------------------------------------------------------------
//Progrma completo con un menuu para seleccionar cosas seleccionables :)
package umg.ejercicios;

import java.util.Scanner;

import umg.ejercicios.pkg1.clsGrupo1;
import umg.ejercicios.pkg2.clsGrupo2;
import umg.ejercicios.pkg3.clsGrupo3;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el volumen de un cubo");
            System.out.println("2. Calcular el área de un triángulo");
            System.out.println("3. Calcular el volumen de un cilindro");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularVolumenCubo(scanner);
                    break;
                case 2:
                    calcularAreaTriangulo(scanner);
                    break;
                case 3:
                    calcularVolumenCilindro(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void calcularVolumenCubo(Scanner scanner) {
        System.out.print("Ingresa la longitud del lado del cubo: ");
        double lado = scanner.nextDouble();

        clsGrupo1 cubo = new clsGrupo1(lado);
        double volumen = cubo.calcularVolumen();

        System.out.println("El volumen del cubo es: " + volumen);
    }

    private static void calcularAreaTriangulo(Scanner scanner) {
        System.out.print("Ingresa la longitud de la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la longitud de la altura del triángulo: ");
        double altura = scanner.nextDouble();

        clsGrupo2 triangulo = new clsGrupo2(base, altura);
        double area = triangulo.calcularArea();

        System.out.println("El área del triángulo es: " + area);
    }

    private static void calcularVolumenCilindro(Scanner scanner) {
        System.out.print("Ingresa el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();

        clsGrupo3 cilindro = new clsGrupo3(radio, altura);
        double volumen = cilindro.calcularVolumen();

        System.out.println("El volumen del cilindro es: " + volumen);
    }
}

