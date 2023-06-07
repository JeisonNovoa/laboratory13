/**

made by Jason Novoa
for Cristian Henao
Calculate area without methods
*/
public class Arrows {
	int length;
	String color;

	/**
	 * 
	 * Define the length and color
	 */

	public Arrows() {
		length = 18;
		color = "black";
	}


	/**
	 * 
	 * @param length
	 * @param color
	 */

	public Arrows(int length, String color) {
		this.length = length;
		this.color = color;
	}



	public void printSpace() {
		System.out.println();
	}

	/**
	 * Prints the arrow until it reaches the end of the defined length
	 */

	public void buildArrow() {
		for (int i = 0; i < length; i++) {
			print("-");
		}
		print(">");
	}

	/**
	 * 
	 *
	 * @param symbol
	 */

	private void print(String symbol) {
		if (color.equals("black")) {
			System.out.print(symbol);
		} else {
			System.out.print(symbol);
		}
			
	}
}

