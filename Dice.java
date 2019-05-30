import java.util.Random;

public class Dice {
	int count1s = 0,count2s=0,count3s=0,count4s=0,count5s=0,count6s=0;
	
	
		void rollDie(int rolls){
		
		for (int i = 0; i < rolls; i++) {
			
			
			Random rand = new Random();
			int randomInt = rand.nextInt(24); //generates random numbers between 0-23
			if (randomInt >= 0 && randomInt <= 3) {				
				count1s++;
			}
			if (randomInt >= 4 && randomInt <= 7) {				
				count2s++;
			}
			if (randomInt >= 8 && randomInt <= 11) {				
				count3s++;
			}
			if (randomInt >= 12 && randomInt <= 15) {				
				count4s++;
			}
			if (randomInt >= 16 && randomInt <= 19) {				
				count5s++;
			}
			if (randomInt >= 20 && randomInt <= 23) {				
				count6s++;
			} 			
			
		}
		
		 
		
		
		
		System.out.println("Number of times 1 was achieved " +count1s);
		System.out.println("Number of times 2 was achieved " +count2s);
		System.out.println("Number of times 3 was achieved " +count3s);
		System.out.println("Number of times 4 was achieved " +count4s);
		System.out.println("Number of times 5 was achieved " +count5s);
		System.out.println("Number of times 6 was achieved " +count6s);
		
		
		
		
	
	}
		
		
		double getCount1s(){
			return count1s;
		}
		double getCount2s(){
			return count2s;
		}
		double getCount3s(){
			return count3s;
		}
		double getCount4s(){
			return count4s;
		}
		double getCount5s(){
			return count5s;
		}
		double getCount6s(){
			return count6s;
		}
		double getTotal(){
			return count1s+count2s+count3s+count4s+count5s+count6s;
		}
		
		double getPercent(int counter){
			return (counter/getTotal())*100;
		}
		
}
