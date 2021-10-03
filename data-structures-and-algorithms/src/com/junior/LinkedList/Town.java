package com.junior.LinkedList;

import java.util.Objects;

public class Town implements Comparable<Town>{
	
	private String name;
	private int kilometers;
	
	
	public Town(String name, int kilometers) {
		super();
		this.name = name;
		this.kilometers = kilometers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	@Override
	public String toString() {
		return name + " - kilometeri = " + kilometers + ", ";
	}
	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + kilometers;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		return kilometers == other.kilometers && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Town o) {
		if (name.equals(name)) {
			if ( this.kilometers - o.kilometers > 0 ) {
				return 1;
			} else {
				return (this.kilometers - o.kilometers) < 0 ? - 1 : 0;
			}
		}
		return name.compareTo(o.name);
	}
	

	
	

}
