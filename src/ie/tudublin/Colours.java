package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Colours extends PApplet {

    public int r, g, b;
    public int value;
    private String colour;

    public Colours(int _r, int _g, int _b, int _value, String _colour){
        this.r = _r;
        this.g = _g;
        this.b = _b;
        this.value = _value;
        this.colour = _colour;
    }

    public Colours(ArrayList<Colours> a){
        a = new ArrayList<>();
    }
    
    public void loadColours(Table t){

    }
    
    public void printColours(){


    }

}