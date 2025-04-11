package src;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> itemList;
	
	public ShoppingCart() {
		this.itemList = new ArrayList<>();
	}
	
	public void addItem(int quantity, String name, double price ) {
		Item item = new Item(quantity, name, price);
		this.itemList.add(item);
	}
	public void removeItem(String name) {
		List<Item> itemsToRemove = new ArrayList<>();
	    if (!itemList.isEmpty()) {
	      for (Item i : itemList) {
	        if (i.getName().equalsIgnoreCase(name)) {
	        	itemsToRemove.add(i);
	        }
	      }
	      itemList.removeAll(itemsToRemove);
	    } else {
	      System.out.println("The list is empty!");
	    }
	}
	
	public double calculateTotalValue() {
		double totalValue = 0d;
	    if (!itemList.isEmpty()) {
	      for (Item item : itemList) {
	        double itemValue= item.getPrice(); //* item.getQuantity();
	        totalValue += itemValue;
	      }
//	      return totalValue;
	    } 
	    return totalValue;
//	    else {
//	      throw new RuntimeException("The list is empty!");
//	    }
	}
	
	public void displayItems() {
		if (!itemList.isEmpty()) {
		      System.out.println(this.itemList);
		    } else {
		      System.out.println("The list is empty!");
		    }
	}
	
	@Override
	  public String toString() {
	    return itemList +"\n";
	  }
}
