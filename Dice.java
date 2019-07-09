

public class Dice {
	int count1s = 0,count2s=0,count3s=0,count4s=0,count5s=0,count6s=0;
	double totalPercent;
	
		void rollDie(int rolls){
		
		for (int i = 0; i < rolls; i++) {
 			
					
			double randomInt = java.lang.Math.random();
			
			if (randomInt >= 0 && randomInt < 1/6.0) {				
				count1s++;
			}
			if (randomInt >= 1/6.0 && randomInt < 2/6.0) {				
				count2s++;
			}
			if (randomInt >=2/6.0 && randomInt < 3/6.0) {				
				count3s++;
			}
			if (randomInt >= 3/6.0 && randomInt < 4/6.0) {				
				count4s++;
			}
			if (randomInt >=4/6.0 && randomInt < 5/6.0) {				
				count5s++;
			}
			if (randomInt >=5/6.0 && randomInt <1) {				
				count6s++;
			} 			
			
		}	
		
	
	}
		
		
		int getCount1s(){
			return count1s;
		}
		int getCount2s(){
			return count2s;
		}
		int getCount3s(){
			return count3s;
		}
		int getCount4s(){
			return count4s;
		}
		int getCount5s(){
			return count5s;
		}
		int getCount6s(){
			return count6s;
		}
		int getTotal(){
			return count1s+count2s+count3s+count4s+count5s+count6s;
		}
		
		double getPercent(double counter){
			double Percent=counter/getTotal()*100;
			return Percent;
		}
		double totalPercent(){
			double total= getPercent(count1s)+getPercent(count2s)+getPercent(count3s)+getPercent(count4s)+getPercent(count5s)+getPercent(count6s);
			return java.lang.Math.round(total);
		}
}
