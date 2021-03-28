package com.ynov.game;

import java.util.Random;
import java.util.Scanner;

import com.ynov.mode.*;

public class Game {

	//Attributs
	public int choiceGame;
	private static int nombrePerso; 
	private static int numberIA;//Le nombre qu'aura choisi le IA
	//Constructeur
	public Game() {
		
	}
	
	//LES METHODES 
	
	//Methodes
		public static void nombreMystere() {

			int nombreMaxordi = 9999; // l'ordinateur considère qu'il s'agit d'un nombre entre 1000 et 9999.
	        int nombreMinIA = 1000; //il basera ses choix de nombres sur les 2 bornes upper et lower qui seront modifiées dynamiquement
	        int counter; // compteur des essais de l'ordinateur qui a pour max 10
	        int counterMax = 10; //Compteur max pour arreter le jeu
	        int nombreUserIA; // nombre IA
	        Scanner input = new Scanner(System.in);
			Random rnd = new Random();
	        
	        //On determine le nombre mystere que propose l'utilisateur qui doit etre compris entre 1000 et 9999
	        System.out.println("Vous devez choisir un nombre mystere entre [1000...9999] que l'ordinateur va devoir chercher en 10 essais");
	        nombrePerso = input.nextInt();
	        while (nombrePerso <1000 && nombrePerso >9999) {
	        	System.out.println("Vous devez choisir un nombre mystere entre [1000...9999] que l'ordinateur va devoir chercher en 10 essais");
	            nombrePerso = input.nextInt();
	        }
	        
	        //L'ordinateur va à son tour chercher le nombre perso jusqu'à ce que compteur = compteur max et on affiche le resultat
	        for (counter = 0; counter< counterMax; counter++) {
	        	//L'odinateur recherche
	        	//On donne resultat d'ordinateur et dis s'il est proche ou non
	        	//Quand compteur est arrivé à 10 et pas bonne reponse, on sort de la boucle affiche le resultat sinon on affiche reussite
	        	//Compteur incremente
	        	System.out.println("L'ordinateur se met à chercher . . . ");
	        	nombreUserIA = (int)(Math.random() * (nombreMaxordi - nombreMinIA + 1) + nombreMinIA);
	        	System.out.println(nombreUserIA);
	        	if (nombreUserIA < nombrePerso) {
	        		System.out.println("L'ordinateur se met à chercher . . . ");
	            	nombreUserIA = (int)(Math.random() * (nombreMaxordi - nombreMinIA + 1) + nombreMinIA);
	            	System.out.println(nombreUserIA);
	            	System.out.println("Le nombre que vous avez demandé est plus grand que celui de l'IA");
	        	} else if (nombreUserIA > nombrePerso) {
	        		System.out.println("L'ordinateur se met à chercher . . . ");
	            	nombreUserIA = (int)(Math.random() * (nombreMaxordi - nombreMinIA + 1) + nombreMinIA);
	            	System.out.println(nombreUserIA);
	            	System.out.println("Le nombre que vous avez demandé est plus petit que celui de l'IA");
				}else if (nombreUserIA == nombrePerso) {
					System.out.println("L'ordinateur se met à chercher . . . ");
	            	System.out.println(nombreUserIA);
	            	System.out.println("Nombre mystere trouvé");
				}else {
					System.out.println("Essais ecoulés");
					System.out.println(nombrePerso);
					break;
				}
	        	
	        	
	        	
	        }
	        
		}
		
		//Methodes
		public static void mystereIA() {
			Scanner input = new Scanner(System.in);
			Random rnd = new Random();
			//Utiliser un nombre max et minimum pour accomplir l'objectif que le nombre mystere contient 4 chiffres pour l'IA
			int nombreMystereMin = 1000 ;
			int nombreMystereMax = 10000;
			numberIA = (int)(Math.random() * (nombreMystereMax - nombreMystereMin + 1) + nombreMystereMin);
			//int mystere = rnd.nextInt(1000) + 1;// l'ordinateur se trouve son nombre mystere de maniere random
			int nessais = 0;
			int nombreJoueur;
			
			//L'utilisateur devine nombre IA
			System.out.print("Vous devez deviner le nombre mystere de l'ordinateur qui est entre [1000..9999]? ");
			//Le joueur Reponds
			nombreJoueur = input.nextInt(); 
			//Si nombre joueur different de nombre Ia, recommencer et s'il ne contient pas 4 chiffre, mentionner
			
			
			while (nombreJoueur != numberIA )
			  {
				//Soit son nombre doit etre compris entre 1000 et 9999 pour valider les 4 chiffres
			    //Soit parcourir la valeur de la variable pour voir si on a 4 caractere à l'interieur.
				if (nombreJoueur < 1000 && nombreJoueur >9999)
			    {
			      System.out.println("==> L'entier doit comporter 4 chiffres");
			      
			    }
				//nombre joueur trop petit
				else if (nombreJoueur < numberIA)
			    {
			      System.out.println("==> Trop petit");
			    }
				//nombre joueur trop grand
				else if (nombreJoueur > numberIA)
			    {
			      System.out.println("==> Trop grand");
			    }
				//nombre joueur pas egale et essai depassé
				else if (nessais == 10) {
					System.out.println("Vous n'avez pas trouvé la reponse en 10 essais max !!! PERDU");
					System.out.println("La reponse etait le nombre " + numberIA );
					break;
				}

			    System.out.print("Votre entier [1000..9999]? ");
			    nombreJoueur = input.nextInt();
			    ++nessais;
			  }
			  System.out.println("Trouve en " + nessais + " essai(s)");
		}
		
		//Choix
		public void choice() {
			Scanner input = new Scanner(System.in);
			Random rnd = new Random();
			//Choix de jeu 
			System.out.println("Vous avez la possibilité de choisir entre jouer contre l'IA ou l'IA contre vous");
			System.out.println("1- Joueur contre IA");
			System.out.println("2- IA contre contre");
			
			int chooseGame = input.nextInt(); 
			
			if (chooseGame != 1 || chooseGame !=2) {
				System.out.println("Vous avez la possibilité de choisir entre jouer contre l'IA ou l'IA contre vous");
				System.out.println("1- Joueur contre IA");
				System.out.println("2- IA contre contre");
				
				chooseGame = input.nextInt(); 
			}
			
			if (chooseGame == 1 ) {
				nombreMystere();
			} else if (chooseGame == 2) {
				mystereIA();
			}
			
			
			
		}
	
	
}
