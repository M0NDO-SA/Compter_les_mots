import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            // Ouvrir le fichier texte
            File file = new File("text.txt");

            // Scanner pour lire le fichier
            Scanner fileScanner = new Scanner(file);

            // Variable pour compter tous les mots
            int totalWords = 0;

            // Lire chaque ligne du fichier
            while (fileScanner.hasNextLine()) {

                // Lire une ligne
                String line = fileScanner.nextLine();

                // Séparer les mots avec l'espace
                String[] words = line.split(" ");

                // Ajouter le nombre de mots
                totalWords = totalWords + words.length;
            }

            // Afficher le résultat final
            System.out.println("Nombre total de mots : " + totalWords);

            // Fermer le scanner
            fileScanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("Fichier introuvable !");
        }
    }
}
