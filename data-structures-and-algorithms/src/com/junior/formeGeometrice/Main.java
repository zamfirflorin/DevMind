package com.junior.formeGeometrice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Shape shape = new Shape("Math is easy", "plastic");
		Shape anotherShape = new Shape("Math is hard", "wood");
		Triangle triangle = new Triangle("I reflect light", "glass", 23, 11);
		Triangle anotherTriangle = new Triangle("I reflect darkness", "steel of steel", 80, 44);
		Rectangle rectangle = new Rectangle( "Yellow rectangle", "steel", 24, 33);
		Rectangle anotherRectangle = new Rectangle( "Blue rectangle", "iron", 10, 50);
		Rectangle thirdRectangle = new Rectangle( "Blue rectangle", "iron", 10, 50);
		
		System.out.println(shape.equals(anotherShape));
		System.out.println(shape.getSize());
		System.out.println(shape.hashCode());
		System.out.println(shape.toString());
		
		
		System.out.println(anotherShape.equals(anotherShape));
		System.out.println(anotherShape.getSize());
		System.out.println(anotherShape.hashCode());
		System.out.println(anotherShape.toString());
		
		System.out.println(triangle.equals(shape));
		System.out.println(triangle.getSize());
		System.out.println(triangle.hashCode());
		System.out.println(triangle.toString());
		triangle.displayTriangleHeight();

		
		System.out.println(anotherTriangle.equals(anotherShape));
		System.out.println(anotherTriangle.getSize());
		System.out.println(anotherTriangle.hashCode());
		System.out.println(anotherTriangle.toString());
		anotherTriangle.displayTriangleHeight();
		
		
		System.out.println("=============");
		System.out.println(rectangle.equals(anotherShape));
		System.out.println(rectangle.getSize());
		System.out.println(rectangle.hashCode());
		System.out.println(rectangle.toString());
		rectangle.displayRectangleHeight();
		
		System.out.println(anotherRectangle.equals(anotherShape));
		System.out.println(anotherRectangle.getSize());
		System.out.println(anotherRectangle.hashCode());
		System.out.println(anotherRectangle.toString());
		anotherRectangle.displayRectangleHeight();
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(shape);
		shapes.add(anotherShape);
		shapes.add(triangle);
		shapes.add(anotherTriangle);
		shapes.add(rectangle);
		shapes.add(anotherRectangle);
		
		System.out.println("Compare third cu another rectangle hashcodes " + ( anotherRectangle.hashCode() == thirdRectangle.hashCode() ) );
		
		System.out.println();
		
		for (Shape s : shapes) {
			System.out.println(s.toString());
		}
		
		for (Shape s : shapes) {
			System.out.println(s.getSize());
		}
		
		for (Shape s : shapes) {
			if (s instanceof Triangle) {
				((Triangle) s).displayTriangleHeight();
			} else if (s instanceof Rectangle) {
				((Rectangle) s).displayRectangleHeight();
			}
		}
		
		
	}

}
