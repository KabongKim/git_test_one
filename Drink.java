package JJ;


import java.util.*;

public class Drink {

		private String name;
		private int price;
		private int value;
		private int cal;
		
		public Drink(){
			
		}
		public String getName() {
		    return name;
		}
		    public void setName(String name) {
		        this.name = name;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = price;
		}
		public int getCal() {
			return cal;
		}
		public void setCal(int cal) {
			this.cal = cal;
		}
		
		public Drink(String name,int price,int value,int cal) {
		this.name = name;
		this.price = price;
		this.value = value;
		this.cal=cal;
		}
	
}
