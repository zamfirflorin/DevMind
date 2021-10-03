package com.junior.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
 
public class OrderedList<T extends Comparable<T>> {
 
  private List<Town> elements = new LinkedList<>();
 
  public boolean addInOrderedList(Town newElement) {
    ListIterator<Town> li = elements.listIterator();
 
    while (li.hasNext()) {
      int comparison = li.next().compareTo(newElement);
 
      if (comparison < 0) { // this element is smaller
        // will go to the next() element
      } else if (comparison > 0) { // found a bigger element
        // insertion should happen before it
        li.previous();
        li.add(newElement); // insert the element after the iterator
        return true;
      } else { // elements are equal => ignore the element
        return false;
      }
    }
    // if reach here => no greater element was found in the list 
    //                  NOR the element is duplicated
    //   => should be inserted now, at the end list
    li.add(newElement);
    return true;
  }
  
	public  int countOccurrences(List<Town> list, String key) {
		int counter = 0;
		for (Town el : list) {
			if (el.getName().equals(key)) {
				counter++;
			}
		}
		return counter;
	}

	public  int countOccurrencesIter(List<Town> list, String key) {
		int counter = 0;
		for (Iterator<Town> it = list.iterator(); it.hasNext();) {
			if (it.next().getName().equals(key)) {
				counter++;
			}
		}
		return counter;
	}

	
  
  
 
  public List<Town> getElements() {
		return elements;
	}

	public void setElements(List<Town> elements) {
		this.elements = elements;
	}

@Override
  public String toString() {
    String ret = "";
    for(Town el : elements) {
      ret += el + " ";
    }
    return ret;
  }
}
