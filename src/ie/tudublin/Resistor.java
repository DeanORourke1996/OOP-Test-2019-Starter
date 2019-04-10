package ie.tudublin;


public class Resistor {
    public int value;
    public int ones;
    public int tens;
    public int hundreds;


    public Resistor(int _value, int _ones, int _tens, int _hundreds) {
        this.value = _value;
        this.ones = _ones;
        this.tens = _tens;
        this.hundreds = _hundreds;
    }
}