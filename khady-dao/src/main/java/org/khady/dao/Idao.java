package org.khady.dao;

import java.util.List;

import org.khady.domaine.Annonce;
import org.khady.domaine.Personne;

public interface Idao {

	// Crud Annonce && Crud Personne

	public int creerAnnonce(Personne personne, Annonce a);

	public int creerPersonne(Personne personne);

	public void deleteAnnonce(int idAnnonce, Annonce a);

	public void deletePersonne(int idPersonne);

	public List<Annonce> findAllAnnonce();

	public List<Personne> findAllPersonnes();

	public Annonce getAnnonce(int idAnnonce);

	public int getAnnonceId(Annonce a);

	public Personne getPersonne(int idPersonne);

	public int getPersonneId(Personne p);

	public void updateAnnonce(Personne p, Annonce a);

	public void updatePersonne(Personne p);
}
