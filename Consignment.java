package consignmentDeliveryTracking;

public class Consignment {
	public static void main(Object[] args) {
		CalculateTime calculateTime=new CalculateTime();
		System.out.println("Your current location - Tamilnadu");
		
		ShowCurrentTime currentTime=calculateTime::getCurrentTime;
		currentTime.showCurrentTime();
	
		ProductList.showAvailableProducts();
		Product product=null;
		
		System.out.println("Your input : "+args[0]);
		
		try {
		 product= (Product) Class.forName("consignmentDeliveryTracking."+(String) args[0]).getDeclaredConstructor().newInstance();
		}
		catch(Exception e) {
			System.out.println("Invalid input! Please enter valid input");
		}
		
		ElapsedDate elapsedDate=calculateTime::getElapsedDate;
		elapsedDate.elapsedDate(product.duration());
	}
}

class ProductList{
	public static void showAvailableProducts() {
		System.out.println();
		System.out.println("Choose one of the product[Type the product name]: ");
		System.out.println();
		System.out.println("1. Saree (from Gujarat)");
		System.out.println("2. Coffee (from Assam)");
		System.out.println("3. Apple (from Shimla)");
		System.out.println("4. Chips (from Kerala)");
		System.out.println("5. Rice (from Tamilnadu)");
		System.out.println("\n");
	}
}