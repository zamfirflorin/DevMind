package com.junior.formeGeometrice;

import java.util.Objects;

public class Rectangle extends Shape {
	
	private double width; 
	private double height;
	
	public Rectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}



	public Rectangle(String text, String material, double width, double height) {
		super(text, material);
		this.height = height;
		this.width = width;
	}
	
	
	public void displayRectangleHeight()
	{
		System.out.println("Rectangle height is: " + this.height);
	}
	
	@Override
	public double getSize() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Rectangle: height is "+ height + ", width is: " + width + ", made of steel, contains the text: " + super.text;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(height, width);
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
	if (this == obj) { // for performance reasons
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (this.getClass() != obj.getClass()) {
		return false;
	}
	Rectangle rectangle = (Rectangle) obj;
	if (super.equals(rectangle) && this.width == rectangle.width && this.height == rectangle.height) {
		return true;
	}
	return false;
	}

	
	
	
}
