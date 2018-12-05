package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image{
    private Color[][] pixels;
    private int width;
    private int height;

    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        pixels = new Color[width][height];
        for(int i=0;i<width;i++)
            for(int j=0; j<height;j++)
                pixels[i][j]= color;
    }

    public PaletteRasterImage(Color[][] pixels){
        this.pixels = pixels;
        this.width = pixels.length;
        this.height = pixels[0].length;
    }

    public void createRepresentation(){}

    public void setPixelColor(Color color, int x, int y){}

    public Color getPixelColor(int x, int y){}

    public void setPixelsColor(Color[][] pixels){}

    private void setPixelsColor(Color color){}

    public int getWidth(){}

    public int getHeight(){}

    protected void setWidth(int width){}

    protected void setHeight(int height){}

}
