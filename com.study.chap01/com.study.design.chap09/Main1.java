
public class Main1 {
	public static void main(String[] args) {
		
		Display d1 = new Display(new StringDisplayImpl("æ”≥Á«œººø‰"));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, korea"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello , Seoul"));
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		
		
	}
}
