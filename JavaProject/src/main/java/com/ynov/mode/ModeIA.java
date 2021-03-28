package com.ynov.mode;

import java.util.Random;
import java.util.Scanner;

public class ModeIA {

	//Attributs
	private static int numberIA;//Le nombre qu'aura choisi le IA
	
	
	//Constructeurs
	public ModeIA(int numberIA) {
		this.numberIA = numberIA;
		
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
	
}
