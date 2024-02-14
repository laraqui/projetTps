public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
	private int notes;


    public Etudiant(String nom, String prenom, int age, int notes) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
		this.notes = notes
    }

    public void afficherInformations() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Age: " + age);
		System.out.println("Notes: " + notes);
    }
}
