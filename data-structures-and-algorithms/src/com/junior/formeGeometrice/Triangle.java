package com.junior.formeGeometrice;

import java.util.Objects;

public class Triangle extends Shape {
	
	private double base;
	private double height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public Triangle(String text, String material, double base, double height) {
		super(text, material);
		this.base = base;
		this.height = height;
		
	}
	
	public void displayTriangleHeight() {
		System.out.println("Triangle height is: " + this.height);
	}
	
	@Override
	public double getSize() {
		return ( base * height ) / 2;
	}
	
	@Override
	public String toString() {
		return "Triangle: height is "+ height + ", base is: " + base + ", made of " + material +", contains the text: " + super.text;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(base, height);
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
	if (this == obj) { 
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (this.getClass() != obj.getClass()) {
		return false;
	}
	Triangle triangle = (Triangle) obj;
	if (super.equals(triangle) && this.base == triangle.base && this.height == triangle.height) {
		return true;
	}
	return false;
	}

}
