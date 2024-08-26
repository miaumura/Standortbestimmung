import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String[] alleAufgaben = new String[0];

    public static <x> x[] addElement(x[] alleAufgaben, x element) {
        x[] array = Arrays.copyOf(alleAufgaben, alleAufgaben.length + 1);
        array[alleAufgaben.length] = element;
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("************************************\n" +
                    "             To-Do-Liste            \n" +
                    "************************************\n" +
                    "      [1] Aufgabe hinzufügen        \n" +
                    "      [2] Alle Aufgaben anzeigen    \n" +
                    "      [3] Aufgabe bearbeiten        \n" +
                    "      [4] Aufgabe löschen           \n" +
                    "      [5] Programm beenden          \n" +
                    "************************************\n");
            int input = scanner.nextInt();

            if (input == 5) {
                run = false;
            } else if (input == 1) {
                System.out.println("Füge eine Aufgabe hinzu");
                String naechsteAufgabe = scanner.next();

                String aufg = aufgabeHinzufuegen(naechsteAufgabe);
            } else if (input == 2) {
                System.out.println("Alle Aufgaben:\n" + Arrays.toString(alleAufgaben));
            } else if (input == 3) {
                System.out.println("Welche Aufgabe willst du bearbeiten?");
                int i = scanner.nextInt();

                System.out.println("Bearbeite die Aufgabe");
                String bearbeiteteAufgabe = scanner.next();
                aufgabeBearbeiten(bearbeiteteAufgabe, i);
//                    List<String> liste = new ArrayList<>(Arrays.asList(alleAufgaben));
//                    liste.set(aufgabeLoeschen(i)-1, bearbeiteteAufgabe);
//                    alleAufgaben = liste.toArray(new String[0]);


            } else if (input == 4) {
                System.out.println("Welche Aufgabe willst du löschen?");
                int i = scanner.nextInt();

                int aufg = aufgabeLoeschen(i);
            }
        }
    }

    public static String aufgabeHinzufuegen(String naechsteAufgabe) {

        alleAufgaben = addElement(alleAufgaben, naechsteAufgabe);

        return naechsteAufgabe;
    }

    public static void aufgabeBearbeiten(String bearbeiteteAufgabe, int i) {
        List<String> liste = new ArrayList<>(Arrays.asList(alleAufgaben));
        liste.set(aufgabeLoeschen(i) - 1, bearbeiteteAufgabe);
        alleAufgaben = liste.toArray(new String[0]);


    }

    public static int aufgabeLoeschen(int i) {

        List<String> liste = new ArrayList<>(Arrays.asList(alleAufgaben));
        liste.remove((i - 1));
        alleAufgaben = liste.toArray(new String[0]);
        return i;
    }


}
