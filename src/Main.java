public class Main {
	Arrows arrow1, arrow2, arrow3;
	 public static void main(String [] args) {
		 
		 new Main();
	 }
	 
	 /**
	  * Creates multiple instances in the main constructor
	  * which calls the methods already implemented in the Arrow class and prints them
	  */
	 public Main() {
		 arrow1 = new Arrows();
		 arrow1.buildArrow();
		 arrow1.printSpace();
		 
		 arrow2 = new Arrows();
		 arrow2.length = 34;
		 arrow2.color = "red";
		 arrow2.buildArrow();
		 
		 arrow3 = new Arrows(12, "black");
		 arrow3.printSpace();
		 arrow3.buildArrow();
		
		 
	 }
}