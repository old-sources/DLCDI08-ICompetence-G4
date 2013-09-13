package org.imie.servlet.filters;

import java.util.List;

import fr.imie.dto.Competence;
import fr.imie.dto.Keyword;
import fr.imie.factory.Factory;
import fr.imie.service.interfaces.IUserService;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IUserService svc = Factory.getInstance().createUserService(null);
		System.out.println("Liste Keyword");
		try {
			Keyword keyword = new Keyword();
			keyword.setLibelle("toto");
			List<Competence> competences = svc.findCompetenceByKeyword(keyword);
			
			for (Competence competence : competences) {
				System.out.println("le mot clé est " + competence.getLibelle() + "\n");
			}
			

		} catch (Exception e) {
			System.out.println("erreur");
			e.printStackTrace();
		}
	}

}