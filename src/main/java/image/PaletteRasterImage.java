package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image{
    private Color[][] pixels;
    private int width;
    private int height;

    public PaletteRasterImage(Color color, int width, int height){

    }

    public PaletteRasterImage(Color[][] pixels){}

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
