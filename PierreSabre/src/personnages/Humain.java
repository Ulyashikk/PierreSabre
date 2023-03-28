package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int capital;
	
	public Humain(String nom, String boisson, int capital) {
		this.nom = nom;
		this.boisson = boisson;
		this.capital = capital;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("("+ nom +") - " + texte);
	}
	
	public int getCapital() {
		return capital;
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire " + boisson);
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
