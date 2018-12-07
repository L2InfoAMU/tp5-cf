package image;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage implements Image{
    private Map<Point,Color> pixelsMap;
    private Point[][] pixels;


    public SparseRasterImage(Color color, int width, int height){
        super(width, height);
        pixels = new Point[width][height];
        this.createRepresentation();
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                if (color!=Color.WHITE) {
                    pixelsMap.put(pixels[i][j], color);
                }
            }
        }
    }

    public SparseRasterImage(Color[][] pixels) {
        super(pixels.length, pixels[0].length);
        this.createRepresentation();
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                    pixelsMap.put(this.pixels[i][j], pixels[i][j]);
            }
        }
    }



    public void createRepresentation() {
        pixels = new Point[getWidth()][getHeight()];
        pixelsMap= new HashMap<Point, Color>();
        }


    public void setPixelColor(Color color, int x, int y) {
        pixelsMap.put(pixels[x][y], color);
        }


    public Color getPixelColor(int x, int y) {
        return pixelsMap.get(pixels[x][y]);
        }

    private void setPixelsColor(Color[][] pixels) {
        if( this.pixels.length != pixels.length || this.pixels[0].length != pixels[0].length ){
            throw new ArithmeticException("C'est pas la bonne taille t'es con ou quoi");
        }
        else{
            for (int i = 0; i < getWidth(); i++) {
                for (int j = 0; j < getHeight(); j++) {
                    setPixelColor(pixels[i][j], i, j);
                }
            }
        }
    }

//change les valeurs de tous les pixels pour qu’ils soient tous de la couleur donnée en paramètre.
    private void setPixelsColor(Color color) {
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                pixelsMap.put(pixels[i][j],color);
            }
        }
    }
}