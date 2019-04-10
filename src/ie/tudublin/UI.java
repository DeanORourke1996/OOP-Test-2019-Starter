package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	ArrayList<Colours> aColours;
	Colours[] colours;
	Resistor[] resistors;
	Table tableColours;
	Table tableResistor;

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}


	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		// Colours Table
		int numColours = 10;
		int index = 0;
		int r, g, b, value;
		String colour;
		tableColours = loadTable("colours.csv", "header, csv");
		colours = new Colours[numColours];

		// populate colours
		for(TableRow row : tableColours.rows()) {
			r = row.getInt("r");
			g = row.getInt("g");
			b = row.getInt("b");
			value = row.getInt("value");
			colour = row.getString("colour");
			colours[index] = new Colours(r, g, b, value, colour); //
			colours[index] = new Colours(aColours); // method overloading
			index++;
		}

		// Resistor Table
		tableResistor = loadTable("resistors.csv", "header, csv");
		int resVal;
		index = 0;

		for(TableRow row : tableResistor.rows()) {
			resVal = row.getInt(index);
			resistors[index] = new Resistor(resVal);
			index++;
		}



	}
	
	public void draw()
	{			
		
	}
}
