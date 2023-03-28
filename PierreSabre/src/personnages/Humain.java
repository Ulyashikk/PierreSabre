package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int capital;
	
	public Humain(String nom, String boisson) {
		this.nom = nom;
		this.boisson = boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("("+ nom +") - " + texte);
	}
	
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime bien boire " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (capital>prix) {
			parler("J'ai " + capital + " en poche, je vais pouvoir m'offrir un " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else parler("Je n'ai plus que " + capital + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
	}
	
	public void gagnerArgent(int gain) {
		capital+=gain;
	}
	
	public void perdreArgent(int perte) {
		capital-=perte;
	}
}
