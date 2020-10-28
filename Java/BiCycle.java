 interface BicycleParts {
		public int gears=0;
		public int speed=0;
		}
	interface BicycleOperations
	{
		public void applyBrake(int decrement);
		public void speedUp(int increment);
	}



public class BiCycle implements BicycleParts,BicycleOperations
{
	
	public int gears=0;
	public int currentSpeed=0;
	
	public BiCycle(int gears, int currentSpeed) {
	        this.gears = gears;
	        this.currentSpeed = currentSpeed;
	    }
	public void applyBrake(int d)
	{
		currentSpeed=currentSpeed-d;
	System.out.println("Current Speed reduces:"+currentSpeed);
	}
	
	public void speedUp(int increment)
	{
		currentSpeed = currentSpeed+increment;
	System.out.println("Current Speed Increses"+currentSpeed);
	}
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
}

class MountainBike extends BiCycle
{
	 public int seatHeight;
	 
	 public MountainBike(int gears,int currentSpeed,int stHeat)
	 {
		 super(gears,currentSpeed);
		 seatHeight = stHeat;
		 
	 }
	 
	 public void setHeight(int newValue) {
		    seatHeight = newValue;
		}
	}