import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la lunghezza del primo lato del rettangolo:");
        double lato1 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo:");
        double lato2 = scanner.nextDouble();

        double perimetroRettangolo = calcolaPerimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo);

        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt();

        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Il numero è: " + (risultatoPariDispari == 0 ? "pari" : "dispari"));


        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double latoA = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double latoB = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double latoC = scanner.nextDouble();

        double perimetroTriangolo = calcolaPerimetroTriangolo(latoA, latoB, latoC);
        System.out.println("Il perimetro del triangolo è: " + perimetroTriangolo);

        scanner.close();
    }

    // Metodo per calcolare il perimetro di un rettangolo
    public static double calcolaPerimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Metodo per verificare se un numero è pari o dispari
    public static int pariDispari(int numero) {
        return numero % 2;
    }

    // Metodo per calcolare il perimetro di un triangolo
    public static double calcolaPerimetroTriangolo(double latoA, double latoB, double latoC) {
        return latoA + latoB + latoC;
    }
}
