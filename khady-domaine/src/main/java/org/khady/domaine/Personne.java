package org.khady.domaine;

public class Personne {

	private int personneId;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private String dateNaissance;

	public Personne() {
		super();
	}

	public Personne(int personneId, String nom, String prenom, String login, String motDePasse, String dateNaissance) {
		super();
		this.personneId = personneId;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.dateNaissance = dateNaissance;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public String getLogin() {
		return login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public int getPersonneId() {
		return personneId;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPersonneId(int personneId) {
		this.personneId = personneId;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [personneId=" + personneId + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDePasse=" + motDePasse + ", dateNaissance=" + dateNaissance + "]";
	}

}
