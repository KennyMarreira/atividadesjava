package application;

import java.util.Locale;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		AbstractShape s1 = new Circle(Color.WHITE, 2.0);
		AbstractShape s2 = new Rectangle(Color.BLACK, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor() + "; Area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor() + "; Area: " + String.format("%.3f", s2.area()));
		
	}

}
