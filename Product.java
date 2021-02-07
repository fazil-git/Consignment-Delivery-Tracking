package consignmentDeliveryTracking;

public abstract class Product{
	public abstract int duration();
}
class Saree extends Product{
	public int duration() {
		System.out.println();
		System.out.println("Saree order confirmed!");
		return 50;
	}
}
class Coffee extends Product{
	@Override
	public int duration() {
		System.out.println();
		System.out.println("Coffee order confirmed!");
		return 40;
	}
}
class Apple extends Product{
	@Override
	public int duration() {
		System.out.println();
		System.out.println("Apple order confirmed!");
		return 25;
	} 
}
class Chips extends Product{
	@Override
	public int duration() {
		System.out.println();
		System.out.println("Chips order confirmed!");
		return 12;
	}
}
class Rice extends Product{
	@Override
	public int duration() {
		System.out.println();
		System.out.println("Rice order confirmed!");
		return 6;
	}
}
class Exit extends Product{
	@Override
	public int duration() {
		System.exit(0);
		return 0;
	}	
}