
public abstract class Utilisateur {

    // Attributs
    private int idUser;
    private String login;
    private String mdp;
    private String nom;
    private String prenom;
    private String mail;
    private String role;

    //Constructeurs
    public Utilisateur() {

    }

    public Utilisateur(int unIdUser, String unLogin, String unMdp, String unNom, String unPrenom, String unMail, String unRole) {
        this.idUser = unIdUser;
        this.login = unLogin;
        this.mdp = unMdp;
        this.nom = unNom;
        this.prenom = unPrenom;
        this.mail = unMail;
        this.role = unRole;
    }

    //Getters et Setters
    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int unIdUser) {
        this.idUser = unIdUser;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String unLogin) {
        this.login = unLogin;
    }

    public String getMdp() {
        return mdp;
    }
    public void setMdp(String unMdp) {
        this.mdp = unMdp;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String unNom) {
        this.nom = unNom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String unPrenom) {
        this.prenom = unPrenom;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String unMail) {
        this.mail = unMail;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String unRole) {
        this.role = unRole;
    }

    //Méthodes

    public String toString(){
        return "Utilisateur [idUser=" + this.idUser + ", login=" + this.login + ", mdp=" + this.mdp + ", nom=" + this.nom + ", prenom=" + this.prenom + ", mail=" + this.mail + ", role=" + this.role + "]";
    }
    
    
    
}
