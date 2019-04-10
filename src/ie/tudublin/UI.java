package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	Colours[] colours;
	Table tableColours;

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
		int numColours = 10;
		int index = 1;
		int r, g, b, value;
		String colour;
		tableColours = loadTable("colours.csv", "header, csv");
		colours = new Colours[numColours];

		for(TableRow row : tableColours.rows()) {
			r = row.getInt("r");
			g = row.getInt("g");
			b = row.getInt("b");
			value = row.getInt("value");
			colour = row.getString("colour");
			colours[index] = new Colours(r, g, b, value, colour);
			index++;
		}

	}
	
	public void draw()
	{			
	}
}
