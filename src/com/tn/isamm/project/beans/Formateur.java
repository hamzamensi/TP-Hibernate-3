package com.tn.isamm.project.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="formateur")
public class Formateur extends Personne {
	private String matricule;
	@OneToMany
	private Set<Matiere> matieres;

	public Formateur(String nom, String prenom, String telephone, String email,
			String sexe, String matricule) {
		super(nom, prenom, telephone, email, sexe);
		this.matricule = matricule;
		this.matieres = new HashSet<Matiere>();
	}
		
	

	



	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}







	public Set<Matiere> getMatieres() {
		return matieres;
	}







	public void setMatieres(Set<Matiere> matieres) {
		this.matieres = matieres;
	}



	
	
}
