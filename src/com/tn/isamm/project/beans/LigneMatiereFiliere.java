package com.tn.isamm.project.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="filierematiere")
public class LigneMatiereFiliere implements Serializable {
	
	private int massehoraire;
	@Id
    @ManyToOne
    @JoinColumn(name = "id")
	private Matiere matiere;
	@Id
    @ManyToOne
    @JoinColumn(name = "id")
	private Filiere filiere;
	
	
	public LigneMatiereFiliere(int massehoraire, Matiere matiere,
			Filiere filiere) {
		super();
		this.massehoraire = massehoraire;
		this.matiere = matiere;
		this.filiere = filiere;
	}
	public int getMassehoraire() {
		return massehoraire;
	}
	public void setMassehoraire(int massehoraire) {
		this.massehoraire = massehoraire;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	
	
}
