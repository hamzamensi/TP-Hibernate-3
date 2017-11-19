package com.tn.isamm.project.beans;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="etudiant")
public class Etudiant extends Personne {
		private String cne;
		@ManyToOne
		private Filiere filiere ;

		public Etudiant(String nom, String prenom, String telephone,
				String email, String sexe, String cne) {
			super(nom, prenom, telephone, email, sexe);
			this.cne = cne;
		}
		
		

		public Etudiant(String nom, String prenom, String telephone,
				String email, String sexe, String cne, Filiere filiere) {
			super(nom, prenom, telephone, email, sexe);
			this.cne = cne;
			this.filiere = filiere;
		}



		public String getCne() {
			return cne;
		}

		public void setCne(String cne) {
			this.cne = cne;
		}



		@Override
		public String toString() {
			return "Etudiant [cne=" + cne + ", getId()=" + getId()
					+ ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
					+ ", getTelephone()=" + getTelephone() + ", getEmail()="
					+ getEmail() + ", getSexe()=" + getSexe() + "]";
		}
		
		
		
}
