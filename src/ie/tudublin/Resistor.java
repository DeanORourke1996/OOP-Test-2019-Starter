package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Resistor extends PApplet {
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public PVector size = new PVector(50, 50);
    public PVector pos = new PVector(100, 50);

    PApplet ui;

    // Constructor
    public Resistor(int _value) {
        this.value = _value;
        this.hundreds = (_value / 100); //              CONVERT VALUES
        this.tens = (_value - (hundreds * 100)) / 10;
        this.ones = _value - ((hundreds * 100) + (tens * 10));

        // print(hundreds + ",");
        // print(tens + ",");
        // println(ones);

    }



    public void render() {
        ui.noStroke();
        ui.noFill();
        ui.rect(pos.x, pos.y, size.x, size.y);
    }
}