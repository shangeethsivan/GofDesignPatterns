package com.shrappz.gof_design_patterns.structural.adapter_pattern;

/**
 * Created by Shangeeth on 24/12/18.
 */


class Line{
    public void draw(int x1,int y1,int x2,int y2){
        System.out.println("Drawing line from point 1 "+x1+":"+y1+" to point 2 "+x2+":"+y2);
    }
}

class Rectangle{
    public void draw(int x1,int y1,int width,int height){
        System.out.println("Drawing Rectangle from point 1 "+x1+":"+y1+" with width and height "+width+":"+height);
    }
}

interface Shape{
    void draw(int x1,int y1,int x2,int y2);
}

class LineAdapter implements Shape{
    Line mLine;

    public LineAdapter(Line pLine){
        mLine = pLine;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        mLine.draw(x1,y1,x2,y2);
    }
}

class RectangleAapter implements Shape{

    Rectangle mRect;

    public RectangleAapter(Rectangle pRect){
        mRect = pRect;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        mRect.draw(x,y,width,height);
    }
}
public class Shapes {

    public static void main(String[] args){
        Shape[] lShapes = new Shape[]{new RectangleAapter(new Rectangle()),new LineAdapter(new Line())};

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (Shape lShape:lShapes){
            lShape.draw(x1,y1,x2,y2);
        }
    }
}
