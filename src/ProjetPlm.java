/**
 * Ce programme permet d'afficher les avions, de les afficher par mot clé, d'ajouter ou supprimer des pièces,
 * et d'afficher les informations détaillées de chaque pièce.
 * 
 * @author Le-porcherS - 2023
 * 
 */
	import java.util.HashMap;
	import java.util.Map; 
	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.Arrays;
public class ProjetPlm {


	// Générer la javadoc => Project -> generate javadoc -> paramétrer pour générer sur le projet en cours

		@SuppressWarnings("unlikely-arg-type") // Pour prévenir en cas d'argument inattendu par la console
		
		/* 1/ Afficher tous les avions OK
		2/ Afficher tous les avions contenant un mot clé dans le programme
		3/ Ajouter ou supprimer une pièce pour un avion donné
		4/ Afficher un avion avec les infos détaillées de chaque pièces
		Quitter
		 */
		public static void main (String[] plm) { 
			HashMap<Integer, String[]> listPlanes = new HashMap<>(); // ID + tableau d'éléments qui vont être générés par le programme
			String[] plane1 = {"A300", "conception", "Fret"}; // Tableau
			String[] plane2 = {"A320", "faisabilite", "passager"};
			String[] plane3 = {"A350", "cloture", "affaires"};
			String[] plane4 ={"A380", "cloture", "transport"};
			String[] plane5 = {"A400M", "definition", "militaire"};
			listPlanes.put(1, plane1); // Les éléments du tableau sont stockés dans chaque clé, 1 clé = 1 tableau
			listPlanes.put(2, plane2);
			listPlanes.put(3, plane3);
			listPlanes.put(4, plane4);
			listPlanes.put(5, plane5);
			// Affichage du contenu des tableaux
		for(int i:listPlanes.keySet()) {
		System.out.println(i+"= "+Arrays.toString(listPlanes.get(i)));
		}
		
		Scanner scan = new Scanner(System.in);
		String programSelect = "";
		System.out.println("");
		
		// Scan pour permettre à l'utilisateur de saisir une recherche dans la catégorie "programme"	
		System.out.println("Rechercher un programme : ");
		programSelect=scan.next();
		listPlanes.toString();
		for(int query : listPlanes.keySet()) { // Effectue la recherche dans le tableau
			if (listPlanes.get(query) != null) { // A faire : adapter la variable de recherche
				// pour qu'elle parcoure la hashmap (int/string) et qu'elle retourne le mot clé cherché
		System.out.println("Résultats de la recherche : "+listPlanes.get(query));

			}	else {
			System.out.println("Aucun élément ne correspond à votre recherche.");	
			}
			
		}

		}
			
}

