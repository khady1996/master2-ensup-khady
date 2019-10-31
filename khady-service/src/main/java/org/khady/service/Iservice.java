package org.khady.service;

import java.util.List;

import org.khady.domaine.Annonce;
import org.khady.domaine.Personne;

public interface Iservice {

	// Crud Personne && Crud Annonce

	public int creerAnnonce(Personne personne, Annonce a);

	public int creerPersonne(Personne personne);

	public void deleteAnnonce(int idAnnonce);

	public void deletePersonne(int idPersonne);

	public List<Annonce> findAllAnnonce();

	public List<Personne> findAllPersonnes();

	public Annonce getAnnonce(int idAnnonce);

	public int getAnnonceId(Annonce a);

	public Personne getPersonne(int idPersonne);

	public int getPersonneId(Personne p);

	public void updateAnnonce(Annonce a);

	public void updatePersonne(Personne p);
}
