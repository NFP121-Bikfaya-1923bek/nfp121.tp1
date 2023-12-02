package question3;
import java.lang.String ;
import java.lang.Math ;

public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }
      /**
     * le login au Cnam : 6 premières lettres du nom suivies de la première
     * lettre du prénom séparées de '_' . le login retourné est en minuscules,
     * le trait d'union, ou spéciaux <i>(pour unix)</i> sont remplacés par des
     * '_' pas de caractères accentués pour le login voir les classes
     * prédéfines, java.lang.String : les méthodes replaceAll, toLowerCase et
     * substring java.lang.Math : la méthode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifié, sans les adaptations dues aux
     *         homonymes...
     */
 public String login() {
    String login = "";

    for (int i = 0; i < Math.min(6, nom.length()); i++) {
        char currentChar = nom.charAt(i);
        login += Character.toLowerCase(currentChar);
        
    }

    login += "_";

    login += Character.toUpperCase(prenom.charAt(0));
    
    for (int i = 0; i < login.length(); i++) {
        char currentChar = login.charAt(i);
        if (!Character.isLetterOrDigit(currentChar)) {
            login = login.replace(currentChar, '_');
        }
        if (Character.isUpperCase(currentChar)) {
            login = login.replace(currentChar, Character.toLowerCase(currentChar) );
           }
        }
    
    return login;
}

  
      public String nom() {
        return this.nom;
    }  
    
    
    /**
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
     */
    public String prenom() {
        return this.prenom;
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule;
    }
   /**
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }
}

