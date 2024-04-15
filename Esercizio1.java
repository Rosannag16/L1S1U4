public class Esercizio1 {
    public static void main(String[] args) {

        int risultatoMoltiplica = moltiplica(4, 5);

        System.out.println("Risultato della moltiplicazione: " + risultatoMoltiplica);

        String risultatoConcatena = concatena("Hello ", 123);

        System.out.println("Risultato della concatenazione: " + risultatoConcatena);

        String[] arrayIniziale = {"uno", "due", "tre", "quattro", "cinque"};

        String[] nuovoArray = inserisciInArray(arrayIniziale, "nuovo elemento");

        System.out.println("Nuovo array:");

        for (String elemento : nuovoArray) {
            System.out.println(elemento);
        }
    }


    public static int moltiplica(int a, int b) {
        return a * b;
    }


    public static String concatena(String str, int num) {
        return str + num;
    }


    public static String[] inserisciInArray(String[] array, String nuovaStringa) {
        if (array.length != 5) {
            System.out.println("L'array deve avere esattamente 5 elementi.");
            return null;
        }

        String[] nuovoArray = new String[6];

        System.arraycopy(array, 0, nuovoArray, 0, 2);

        nuovoArray[2] = nuovaStringa;

        System.arraycopy(array, 2, nuovoArray, 4, 2);

        return nuovoArray;
    }
}
