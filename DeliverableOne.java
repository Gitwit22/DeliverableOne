import java.util.Scanner;

public class DeliverableOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sodasInStock = 100;
		int sodasSold = 0;
		
		int sodasInStock - sodasSold = sodasRemainig;
		
		
		System.out.println("How many sodas have been sold today? " +  sodasInStock + " in stock.");
		sodasSold = input.nextInt();
		

		
		if (sodasSold > 100) {
			System.out.println("Too High");
			System.out.println("There are " + sodasInStock + " sodas remaining");
		} else if (sodasSold < 100) {
			System.out.println("You have " + (sodasRemaining) + " sodas remaining");
					}
	
		int chipsInStock = 40;
		int chipsSold = 0;
		int chipsInStock - chipsSold = chipsRemainig;
		
		System.out.println("How many chips have been sold today? " +  chipsInStock + " in stock.");
		chipsSold = input.nextInt();
		
		if (chipsSold > 100) {
			System.out.println("Too High");
			System.out.println("There are " + chipsInStock + " chips remaining");
		} else if (chipsSold < 100) {
			System.out.println("You have " + (chipsRemaining) + " chips remaining");
					}
		

		int candyInStock = 60;
		int candySold = 0;
		int candyRemaining = candyInStock - candySold;
		
		System.out.println("How many candies have been sold today? " +  candyInStock + " in stock.");
		candySold = input.nextInt();
		
		if (candySold > 100) {
			System.out.println("Too High");
			System.out.println("There are " + candyInStock + " candies remaining");
		} else if (candySold < 100) {
			System.out.println("You have " + (candyRemaining) + " candies remaining");
			}

		int sodaRestockLimit = 40;
		int chipRestockLimit = 20;
		int candyRestockLimit = 40;
		
		if (sodasRemaining <= sodaRestockLimit) {
			System.out.println("You need to restock the sodas");
		}
		}
	}
}

