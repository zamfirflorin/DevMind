package com.junior.formeGeometrice;

import java.util.Objects;

public  class Shape {

	public String text;
	public String material;

	public Shape() {

	}

	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}

	public double getSize() {
		return -1;
	}

	@Override
	public String toString() {
		return "made of " + material + ", contains the text " + text;
	}

	@Override
	public int hashCode() {
		return Objects.hash(material, text);
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
		Shape shape = (Shape) obj;
		if (this.text != null && this.text.equals(shape.text) && this.material != null
				&& this.material.equals(shape.material)) {
			return true;
		}
		return false;
	}
	
	

}
