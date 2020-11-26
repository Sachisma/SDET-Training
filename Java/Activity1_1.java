
public class Activity1_1 {

	public static void main(String[] args) {
		Car Mercedes = new Car();
		
		Mercedes.color = "Matte black";
		Mercedes.transmission = "Auto";
		Mercedes.make = 0;
		Mercedes.doors = 2;
		Mercedes.tyres = 4;
		
		Mercedes.displayCharacteristics();
		Mercedes.accelerate();
		Mercedes.brake();
	}

	
}
