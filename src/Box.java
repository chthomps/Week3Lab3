//Creates a Box Class for printing box of stars based on "size" (row and column) input. 
//The Box Class invokes a custom printBox method. 

public class Box {
	private static int size = 0;

//Constructor method
	public Box(int size) {
	}
//Main method
	public static void main(String[] args) {

		Box Box1 = new Box(size);
		Box.size = 5;

		Box1.printBox();
	}
//Establishes the printBox method
	public void printBox() {

		for (int l = 0; l < size; l++) {
			for (int w = 0; w < size; w++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
