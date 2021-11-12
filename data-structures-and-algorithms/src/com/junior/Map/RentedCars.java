package com.junior.Map;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RentedCars implements Serializable{
	
	
	 private static final long serialVersionUID = 1L;
	
	private List<String> carList;


	public RentedCars() {
		carList = new ArrayList<>();
	}

	public void addCar(String car) {
		carList.add(car);
	}

	public void returnCar(String car) {
		carList.remove(car);
	}
	

	public int size() {
		return carList.size();
	}
	
	public void showCars() {
		carList.forEach(car -> System.out.println(car));
	}

	public List<String> getCarList() {
		return carList;
	}

	
	
	
}
