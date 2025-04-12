package src.list.cart;

public class Item {
	private String name;
	private double price;
	private int quantity;
	
	public Item(int quantity, String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return quantity +" "+name+" "+ price+"\n";
	}
}
