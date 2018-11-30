package image;

import java.awt.*;

public class BruteRasterImage implements Image {
    private Color[][] colors;
    private int width;
    private int height;





    public BruteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        this.colors[this.width][this.height] = color;
    }
    public BruteRasterImage(Color[][] colors){
        this.colors=colors;
        this.width=colors.length;
        this.height=colors[0].length;

    }

    //alloue la matrice représentant l’image.
    public void createRepresentation(){
        colors=new colors(getWidth(),getHeight());


        }
    }

    //fixe la couleur d’un pixel.
    public void setPixelColor(Color color, int x, int y){
        this.colors[x][y] = color;
    }

    //retourne la couleur d’un pixel.
    public Color getPixelColor(int x, int y){
        return colors[x][y];
    }

    //met à jour les valeurs de couleurs de l’image en utilisant les valeurs de la matrice donnée en paramètre.
    private void setPixelsColor(Color[][] pixels){
        for(int i=1; i<this.width; i++){
            for(int j=1; j<this.height; j++){

            }

    //change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.
    private void setPixelsColor(Color color){
        this.colors[this.width][this.height] = color;
    }

    // retourne la largeur de l’image.
    public int getWidth(){
        return this.width;
    }

    // retourne la hauteur de l’image.
    public int getHeight(){
        return this.height;
    }
    // fixe la largeur de l’image.
    protected void setWidth(int width){
        this.width = width;
    }

    //fixe la hauteur de l’image.
    protected void setHeight(int height){
        this.height = height;
    }






}
