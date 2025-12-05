import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Vente {

    //Attributs
    private int idVente;
    private String titre;
    private LocalDate dateVente;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String lieu;
    private ArrayList<Article> lesArticles;

    //Constructeurs
    public Vente() {

    }

    public Vente(int unIdVente, String unTitre, LocalDate uneDateVente, LocalTime uneHeureDebut, LocalTime uneHeureFin, String unLieu) {
        this.idVente = unIdVente;
        this.titre = unTitre;
        this.dateVente = uneDateVente;
        this.heureDebut = uneHeureDebut;
        this.heureFin = uneHeureFin;
        this.lieu = unLieu;
        this.lesArticles = new ArrayList<Article>();
    }

    //Getters et Setters
    public int getIdVente(){
        return idVente;
    }
    public void setIdVente(int unIdVente){
        this.idVente = unIdVente;
    }

    public String getTitre(){
        return titre;
    }
    public void setTitre(String unTitre){
        this.titre = unTitre;
    }
    
    public LocalDate getDateVente(){
        return dateVente;
    }
    public void setDateVente(LocalDate uneDateVente){
        this.dateVente = uneDateVente;
    }
    
    public LocalTime getHeureDebut(){
        return heureDebut;
    }
    public void setHeureDebut(LocalTime uneHeureDebut){
        this.heureDebut = uneHeureDebut;
    }
    
    public LocalTime getHeureFin(){
        return heureFin;
    }
    public void setHeureFin(LocalTime uneHeureFin){
        this.heureFin = uneHeureFin;
    }
    
    public String getLieu(){
        return lieu;
    }
    public void setLieu(String unLieu){
        this.lieu = unLieu;
    }

    public void ajouterUnArticle(Article unArticle){
        if(!this.lesArticles.contains(unArticle)){
            this.lesArticles.add(unArticle);
        }
    }

    public void supprimerUnArticle(Article unArticle){
        if(this.lesArticles.contains(unArticle)){
            this.lesArticles.remove(unArticle);
        }
    }

    public void supprimerTousLesArticles(){
        this.lesArticles.clear();
    }

    //Méthodes
    public String afficherUneVente(){
        return "Vente [idVente=" + this.idVente + ", titre=" + this.titre + ", dateVente=" + this.dateVente + ", heureDebut=" + this.heureDebut + ", heureFin=" + this.heureFin + ", lieu=" + this.lieu + "]";
    }
    
    
}
