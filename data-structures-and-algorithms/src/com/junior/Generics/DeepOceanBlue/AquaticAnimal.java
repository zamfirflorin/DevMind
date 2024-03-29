package com.junior.Generics.DeepOceanBlue;

public class AquaticAnimal {
	  private String name;
	  
	  public AquaticAnimal(String name) {
	    this.name = name;
	  }
	 
	  public String getName() {
	    return name;
	  }
	 
	  @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	    if (!(obj instanceof AquaticAnimal)) {
	      return false;
	    }
	    AquaticAnimal other = (AquaticAnimal) obj;
	    if (name == null) {
	      if (other.name != null) {
	        return false;
	      }
	    } else if (!name.equals(other.name)) {
	      return false;
	    }
	    return true;
	  }
}
