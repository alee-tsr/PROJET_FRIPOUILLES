import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public void afficherMsg(String msg) { System.out.println(">>> " + msg); }
    
    public String saisirTexte(String question) {
        System.out.print(question + " : ");
        return scanner.nextLine();
    }

    public double saisirDouble(String question) {
        System.out.print(question + " : ");
        double val = scanner.nextDouble();
        scanner.nextLine(); // Vider le buffer
        return val;
    }

    public void afficherListe(List<?> liste) {
        if(liste.isEmpty()) System.out.println("(Aucun élément)");
        for(Object o : liste) { System.out.println("- " + o.toString()); }
    }
}