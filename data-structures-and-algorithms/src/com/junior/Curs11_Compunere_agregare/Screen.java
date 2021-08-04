package com.junior.Curs11_Compunere_agregare;

import java.util.ArrayList;

public class Screen {

	
	private ArrayList<Pixel> pixels;
	private Dimension dimensions;
	
	public Screen(int pixelsNo, int width, int length, int depth) {
		pixels = new ArrayList<>();
		Pixel pixel = new Pixel();
		dimensions = new Dimension(width, length, depth);
		
		for (int i = 0; i < pixelsNo; i++) {
			pixels.add(pixel);
		}
	}
	
	public void setPixel(int pixelIndex, String color) {
		this.pixels.get(pixelIndex).setPixel(color);
	}
	
	public void colorScreen(String color) {
		for (int i = 0; i < pixels.size(); i++) {
			pixels.get(i).setPixel(color);
		}
	}

}
