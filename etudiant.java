public class Etudiant {
    private String nom;
    private String prenom;
    private int age;

    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void afficherInformations() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Age: " + age);
    }
}
