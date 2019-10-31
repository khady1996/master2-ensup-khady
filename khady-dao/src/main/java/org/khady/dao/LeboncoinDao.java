package org.khady.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.khady.domaine.Annonce;
import org.khady.domaine.Personne;

public class LeboncoinDao implements Idao {

	public AccesBd bd = new AccesBd();

	@Override
	public int creerAnnonce(Personne personne, Annonce a) {
		// TODO Auto-generated method stub

		this.bd.seConnecter();

		try {

			String requete = "INSERT INTO `annonce` (`idAnnonce`,`intitule`,`detail`,`prix`,`idPersonne`) VALUES ('"
					+ a.getIdAnnonce() + "','" + a.getIntitule() + "','" + a.getDetail() + "'" + ",'" + a.getPrix()
					+ "','" + personne.getPersonneId() + "');";

			this.bd.st.executeUpdate(requete);

		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}

		this.bd.seDeconnecter();

		return 1;
	}

	@Override
	public int creerPersonne(Personne personne) {
		// TODO Auto-generated method stub
		this.bd.seConnecter();

		try {

			String requete = "INSERT INTO `personne` (`personneId`,`nom`,`prenom`,`login`,`motDePasse`,`dateNaissance`) VALUES ('"
					+ personne.getPersonneId() + "','" + personne.getNom() + "','" + personne.getPrenom() + "'" + ",'"
					+ personne.getLogin() + "','" + personne.getMotDePasse() + "','" + personne.getDateNaissance()
					+ "');";

			this.bd.st.executeUpdate(requete);

		} catch (SQLException e) {

			e.printStackTrace();
			return 0;
		}

		this.bd.seDeconnecter();

		return 1;
	}

	@Override
	public void deleteAnnonce(int idAnnonce, Annonce a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonne(int idPersonne) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Annonce> findAllAnnonce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Annonce getAnnonce(int idAnnonce) {
		// TODO Auto-generated method stub
		Annonce annonce = null;

		this.bd.seConnecter();
		try {

			String requete = "SELECT * FROM `Annonce` WHERE `idAnnonce` = '" + idAnnonce + "';";
			ResultSet rs = this.bd.st.executeQuery(requete);

			while (rs.next()) {
				annonce = new Annonce(rs.getInt("idAnnonce"), rs.getString("intitule"), rs.getString("detail"),
						rs.getDouble("prix"));

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		this.bd.seDeconnecter();

		return annonce;
	}

	@Override
	public int getAnnonceId(Annonce a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		Personne personne = null;

		this.bd.seConnecter();
		try {

			String requete = "SELECT * FROM `Personne` WHERE `idPersonne` = '" + idPersonne + "';";
			ResultSet rs = this.bd.st.executeQuery(requete);

			while (rs.next()) {
				personne = new Personne(rs.getInt("personneId"), rs.getString("nom"), rs.getString("prenom"),
						rs.getString("login"), rs.getString("motDePasse"), rs.getString("dateNaissance"));

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		this.bd.seDeconnecter();

		return personne;
	}

	@Override
	public int getPersonneId(Personne p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateAnnonce(Personne p, Annonce a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub

	}

}
