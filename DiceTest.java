import java.text.DecimalFormat;

import javax.swing.*;
public class DiceTest {
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Dice myDice=new Dice();
		myDice.rollDie(1000);
		DecimalFormat df=new DecimalFormat("#.#"); //to format the percentage to 1 decimal place
		
		
		
		String column[]={"FACE","FREQUENCY","PERCENTAGE"};
		Object [] [] data = new Object[] []{
			{"1",myDice.getCount1s(),df.format(myDice.getPercent(myDice.count1s))},
			{"2",myDice.getCount2s(),df.format(myDice.getPercent(myDice.count2s))},
			{"3",myDice.getCount3s(),df.format(myDice.getPercent(myDice.count3s))},
			{"4",myDice.getCount4s(),df.format(myDice.getPercent(myDice.count4s))},
			{"5",myDice.getCount5s(),df.format(myDice.getPercent(myDice.count5s))},
			{"6",myDice.getCount6s(),df.format(myDice.getPercent(myDice.count6s))},
			{"","",""},
			{"Total",myDice.getTotal()," "}
			
		};
		JTable table= new JTable(data,column);
		JFrame frame=new JFrame("Die Result Table");
		frame.add(new JScrollPane(table));
		
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(500, 200);
        frame.setVisible(true);
		
		

	}

}
