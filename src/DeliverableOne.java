import java.util.Scanner;

public class DeliverableOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sodasInStock = 100;
		int sodasSold = 0; 
			
		
		System.out.println("How many sodas have been sold today? " +  sodasInStock + " in stock.");
		sodasSold = input.nextInt();
		
		int sodasRemaining = sodasInStock - sodasSold;

		
		if (sodasSold > 100) {
			System.out.println("Too High");
			System.out.println("You have " + sodasInStock + " sodas remaining.");
		
		} else if (sodasSold < 100) {
			System.out.println("You have " + sodasRemaining + " sodas remaining");
					} 
	
		int chipsInStock = 40;
		int chipsSold = 0;
		
		
		System.out.println("How many chips have been sold today? " +  chipsInStock + " in stock.");
		chipsSold = input.nextInt();
		
		int chipsRemaining = chipsInStock - chipsSold;
		
		if (chipsSold > 40) {
			System.out.println("Too High");
			System.out.println("How many chips have been sold today? " +  chipsInStock + " in stock.");
			chipsSold = input.nextInt();
			
			System.out.println("There are " + chipsInStock + " chips remaining");
		} 
		if (chipsSold < 40) {
			System.out.println("You have " + chipsRemaining + " chips remaining");
					}
		

		int candyInStock = 60;
		int candySold = 0;
	
		
		System.out.println("How many candies have been sold today? " +  candyInStock + " in stock.");
		candySold = input.nextInt();
		
		int candyRemaining = candyInStock - candySold;
		
		if (candySold > 60) {
			System.out.println("Too High");
			System.out.println("There are " + candyInStock + " candies remaining");
		} else if (candySold < 60) {
			System.out.println("You have " + candyRemaining + " candies remaining");
		}
		
		int sodaRestockLimit = 40;
		int chipRestockLimit = 20;
		int candyRestockLimit = 40;
		
		System.out.println("Thanks you for entering the values!");
		
		System.out.println("These items need to be restocked");
		
		if (sodasRemaining <= sodaRestockLimit) {
			
			System.out.println("Sodas");
		
		}
		if (chipsRemaining <= chipRestockLimit) {
			
			System.out.println("Chips");
		
		if (candyRemaining <= candyRestockLimit) {
				
			System.out.println("Candy");
			}
		System.out.println("Thanks you for using the restocking calculator! Until next time!!");
		}
}
}

