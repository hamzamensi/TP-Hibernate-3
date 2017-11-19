package com.tn.isamm.App;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tn.isamm.project.beans.Etudiant;
import com.tn.isamm.project.beans.Filiere;
import com.tn.isamm.project.beans.Formateur;
import com.tn.isamm.project.beans.LigneMatiereFiliere;
import com.tn.isamm.project.beans.Matiere;
import com.tn.isamm.project.service.EtudiantService;
import com.tn.isamm.project.service.FiliereService;
import com.tn.isamm.project.service.FormateurService;
import com.tn.isamm.project.service.LigneMatiereFiliereService;
import com.tn.isamm.project.service.MatiereService;

public class App {
public static void main(String[] args) {
		FiliereService filiereService = new FiliereService();
		MatiereService matiereService = new MatiereService();
		FormateurService formateurService = new FormateurService();
		EtudiantService etudiantService = new EtudiantService();
		LigneMatiereFiliereService ligneMatiereFiliereService = new LigneMatiereFiliereService();
		Filiere filiere1 = new Filiere("IAII", "Ingénierie des automatismes et informatique industrielle");
		Filiere filiere2 = new Filiere("IRT", "Ingénierie des réseaux et télécommunications");
		Filiere filiere3 = new Filiere("IIR", "Ingénierie informatique et réseaux ");
		filiereService.create(filiere1);
		filiereService.create(filiere2);
		filiereService.create(filiere3);
		Matiere matiere1 = new Matiere("TPC","Techniques de programmation structurée");
		Matiere matiere2 = new Matiere("JB","Java de Base");
		Matiere matiere3 = new Matiere("Au","Administration Unix");
		Matiere matiere4 = new Matiere("Hibernate","Framework de persistance");
		Matiere matiere5 = new Matiere("POO","Programmation orientée objet");
		matiereService.create(matiere1);
		matiereService.create(matiere2);
		matiereService.create(matiere3);
		matiereService.create(matiere4);
		matiereService.create(matiere5);
		Formateur formateur1 = new Formateur("Slimani","Yahia","","", "M","F1");
		Set<Matiere> matieres = new HashSet<Matiere>();
		matieres.add(matiere1);
		matieres.add(matiere2);
		formateur1.setMatieres(matieres);
		formateurService.create(formateur1);
		Formateur formateur2 = new Formateur("Safii","Ilhem","","", "F","F2");
		Set<Matiere> matieres2 = new HashSet<Matiere>();
		matieres2.add(matiere3);
		matieres2.add(matiere5);
		formateur1.setMatieres(matieres2);
		formateurService.create(formateur2);
		Etudiant e1 = new Etudiant("SAFI","Amal", "","", "", "22845676",filiere3);
		etudiantService.create(e1);
		filiere3.getEtudiant().add(e1);
		Etudiant e2 = new Etudiant("ALAMI","Samir", "","", "", "23845976 ",filiere3);
		etudiantService.create(e2);
		filiere3.getEtudiant().add(e2);
		Etudiant e3 = new Etudiant("ALAOUI","Safa","","","","22345476",filiere1);
		filiere1.getEtudiant().add(e3);
		etudiantService.create(e3);
		
		
		
		LigneMatiereFiliere ligneMatiereFiliere = new LigneMatiereFiliere(30, matiere1, filiere1) ;
		matiere1.getFilieres().add(ligneMatiereFiliere);
		
		System.out.println("matiere1");
		filiere1.getMatieres().add(ligneMatiereFiliere);
		//ligneMatiereFiliereService.create(ligneMatiereFiliere);
		System.out.println("lignematiereservice created");
		//filiereService.update(filiere1.getId(),filiere1);
		matiereService.create( matiere1);
		//filiereService.update(filiere1.getId(),filiere1);
		
		
		
		/*LigneMatiereFiliere ligneMatiereFiliere1 = new LigneMatiereFiliere(40, matiere2, filiere1) ;
		matiere2.getFilieres().add(ligneMatiereFiliere1);
		System.out.println("matiere 2");
		filiere1.getMatieres().add(ligneMatiereFiliere1);
		matiereService.update(matiere2.getId(), matiere2);
		filiereService.update(filiere1.getId(),filiere1);
		System.out.println("lignem.....2 created");
		
		System.out.println("matiere 2 updated");
		
		LigneMatiereFiliere ligneMatiereFiliere2 = new LigneMatiereFiliere(40, matiere3, filiere2) ;
		matiere3.getFilieres().add(ligneMatiereFiliere2);
		filiere2.getMatieres().add(ligneMatiereFiliere2);
		System.out.println("matiere 2");
		matiereService.update(matiere3.getId(), matiere3);
		filiereService.update(filiere2.getId(),filiere2);
		System.out.println("lignem.....2 created");
		
		System.out.println("matiere 2 updated");
		//filiere1.setMatieres(matieres);
		//filiereService.update(filiere1.getId(), filiere1);
		//filiere2.setMatieres( matieres2);
		//filiereService.update(filiere2.getId(), filiere2);
		//filiereService.update(filiere3.getId(), filiere3);
		*/
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		System.out.println(filiereService.getEtudiantsByFiliere(filiere1).size());
		filiereService.getEtudiantsByFiliere(filiere3).forEach(etudiants::add);
		for(int c=0;c<etudiants.size();c++){
			System.out.println(etudiants.get(c).toString());
		}
		
		List<LigneMatiereFiliere> matiere = new ArrayList<LigneMatiereFiliere>();
		filiereService.getMatieresByFiliere(filiere1).forEach(matiere::add);
		for(int c=0;c<matiere.size();c++){
			System.out.println(matiere.get(c).getFiliere().toString()+" masse horiaire = "+matiere.get(c).getMassehoraire());
		}
		
		
		
		
		
		

}
}
