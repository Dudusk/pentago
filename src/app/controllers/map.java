package app.controllers;

public class map {

    float coordX, coordY; //X : A / Y : 1
    boolean Case = false; //Si une bille dedans ou pas

    /**
     * Création de la map (constructeur)
     * @param nbrJoueur
     */
    public map(int nbrJoueur){
        int coordonnees[][] = { {1,2,3,4,5,6},{} };
        System.out.println("Creation de la map avec " + nbrJoueur + " joueurs.");
        for (int i = 0; i < coordonnees.length; i++){
            for (int j = 0; j< coordonnees.length; j++){
                coordonnees[i][j] = 1;
                System.out.println("Coordonnées : " + coordonnees[i][j]);
            }
        }
    }

    /**
     * Cases libres dans la partie
     * @param Cases
     */
    public void casesLibres(boolean Cases){

    }

    /**
     * Poser la bille sur la map
     * @param coordonneeX
     * @param coordonneeY
     */
    public void poserBille(float coordonneeX, float coordonneeY){

    }

    /**
     * Vider la map
     */
    public void vider(){
        System.out.println("Vidée");
    }

    /**
     * Calcul des billes alignées
     */
    public void billeJoueurAligne(){

    }

    /**
     * Calcul à la rotation du carré
     */
    public void newPositionBille(){

    }
}
