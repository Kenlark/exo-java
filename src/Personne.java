public class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Bonjour " + nom + ", vous avez " + age + " ans.");
    }
}
