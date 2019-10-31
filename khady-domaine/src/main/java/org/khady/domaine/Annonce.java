package org.khady.domaine;

public class Annonce {

	private int idAnnonce;
	private String intitule;
	private String detail;
	private double prix;

	public Annonce() {
		super();
	}

	public Annonce(int idAnnonce, String intitule, String detail, double prix) {
		super();
		this.idAnnonce = idAnnonce;
		this.intitule = intitule;
		this.detail = detail;
		this.prix = prix;
	}

	public String getDetail() {
		return detail;
	}

	public int getIdAnnonce() {
		return idAnnonce;
	}

	public String getIntitule() {
		return intitule;
	}

	public double getPrix() {
		return prix;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", intitule=" + intitule + ", detail=" + detail + ", prix=" + prix
				+ "]";
	}

}
