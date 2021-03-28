package com.ynov.mode;



public class ModePerso {

	//Attributs
	private static int nombrePerso; 
	//Constructeurs
	public ModePerso(int nombrePerso) {
		this.nombrePerso = nombrePerso;
	}
	
	//Methodes
	public static void nombreMystere() {

		int nombreMaxordi = 9999; // l'ordinateur considère qu'il s'agit d'un nombre entre 1000 et 9999.
        int nombreMinIA = 1000; //il basera ses choix de nombres sur les 2 bornes upper et lower qui seront modifiées dynamiquement
        int counter = 0; // compteur des essais de l'ordinateur qui a pour max 10
        int counterMax = 10; //Compteur max pour arreter le jeu
        int nombreUser; // nombre designé par l'utilisateur
        
        //On determine le nombre mystere que propose l'utilisateur qui doit etre compris entre 1000 et 9999
        System.out.println("Vous devez choisir un nombre mystere entre [1000...9999] que l'ordinateur va devoir chercher en 10 essais");
        
        
        
	}
}

