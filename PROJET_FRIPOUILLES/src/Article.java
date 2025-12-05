
public class Article {

    //Attributs
    private int idArticle; 
    private String description;
    private float prix;
    private String photo;
    private String statut;
    private Categorie uneCategorie;
    private Taille uneTaille;
    private Couleur uneCouleur;
    private Genre unGenre;
    private Etat unEtat;

    //Constructeurs
    public Article() {

    }

    public Article(int unIdArticle, String uneDescription, float unPrix, String unePhoto, String unStatut, Categorie uneCategorie, Taille uneTaille, Couleur uneCouleur, Genre unGenre, Etat unEtat) {
        this.idArticle = unIdArticle;
        this.description = uneDescription;
        this.prix = unPrix;
        this.photo = unePhoto;
        this.statut = unStatut;
        this.uneCategorie = uneCategorie;
        this.uneTaille = uneTaille;
        this.uneCouleur = uneCouleur;
        this.unGenre = unGenre;
        this.unEtat = unEtat;
    }

    //Getters et Setters
    public int getIdArticle(){
        return idArticle;
    }
    public void setIdArticle(int unIdArticle){
        this.idArticle = unIdArticle;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String uneDescription){
        this.description = uneDescription;
    }

    public float getPrix(){
        return prix;
    }
    public void setPrix(float unPrix){
        this.prix = unPrix;
    }

    public String getPhoto(){
        return photo;
    }
    public void setPhoto(String unePhoto){
        this.photo = unePhoto;
    }

    public String getStatut(){
        return statut;
    }
    public void setStatut(String unStatut){
        this.statut = unStatut;
    }

    public String getIdCategorie(){
        return uneCategorie.getIdCategorie();
    }

    public void setIdCategorie(Categorie uneCategorie){
        this.uneCategorie = uneCategorie;
    }
    
    public String getTaille(){
        return uneTaille.getLibelle();
    }

    public void setTaille(Taille uneTaille){
        this.uneTaille = uneTaille;
    }

    public String getIdCouleur(){
        return uneCouleur.getIdCouleur();
    }

    public void setIdCouleur(Couleur uneCouleur){
        this.uneCouleur = uneCouleur;
    }

    public String getGenre(){
        return unGenre.getLibelle();
    }

    public void setGenre(Genre unGenre){
        this.unGenre = unGenre;
    }

    public String getEtat(){
        return unEtat.getLibelle();
    }

    public void setEtat(Etat unEtat){
        this.unEtat = unEtat;
    }

    //Méthodes
    public String afficherUnArticle(){
        return "Article [idArticle=" + this.idArticle + 
        ", description=" + this.description + ", prix=" + this.prix + ", photo=" + this.photo + 
        ", statut=" + this.statut + ", idCategorie=" + this.uneCategorie.getIdCategorie() +
        ", taille=" + this.uneTaille.getLibelle() + ", idCouleur=" + this.uneCouleur.getIdCouleur() +
        ", genre=" + this.unGenre.getLibelle() + ", etat=" + this.unEtat.getLibelle() + "]";
    }
    
  


}
