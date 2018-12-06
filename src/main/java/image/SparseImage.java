package image;

import java.awt.*;
import java.util.Map;

public class SparseRasterImage extends RasterImage{
    Map<Point,Color> Color;

    public SparseRasterImage(Color color, int width, int height){
        super(width,height);

    }

}
