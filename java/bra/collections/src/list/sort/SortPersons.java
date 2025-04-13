package src.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class SortPersons {
	private List<Person> personList;
	
	public SortPersons() {
		this.personList = new ArrayList<>();
	}
	
	public void addPerson(String name, int age, double height) {
	    personList.add(new Person(name, age, height));
	  }

	  public List<Person> sortByAge() {
	    List<Person> personsByAge = new ArrayList<>(personList);
	    if (!personList.isEmpty()) {
	      Collections.sort(personsByAge);
	    } else {
	    	JOptionPane.showMessageDialog(null,"The list is empty");
	    }
	    return personsByAge;
	  }

	  public List<Person> sortByHeight() {
	    List<Person> personsByHeight = new ArrayList<>(personList);
	    if (!personList.isEmpty()) {
	    	Collections.sort(personsByHeight, new ComparatorByHeight());
	    }
	    else
	    	JOptionPane.showMessageDialog(null,"The list is empty");
	    return personsByHeight;
	  }

	@Override
	public String toString() {
		return personList+"";
	}
	
	
}
