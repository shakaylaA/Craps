/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package craps;

/**
 *
 * @author shakaylaalston
 */
public class Craps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Initialized wins and losses	
		int wins = 0;
		 int losses = 0;
		 int i=1;
	 
//For loop for each round (print only 1-10)		 
		for ( i = 1; i <=100000; i++) {
			if(i<11) { //Only print the first 10 rolls
		
			 System.out.println("Round " + i + ":");
			
			
//For loop for each roll 			
			for (int x = 1; x < 100; x++) { 

				int die1 = (int)(Math.random()* 6 - 1 ) + 1;
				int  die2 = (int)(Math.random()* 6 - 1 ) + 1;
				int total = die1 + die2;
				
				
		//Roll is 1 and is regular number
			
			if((x==1 && total !=7) || (x==1 && total !=11) || (x==1 && total !=3) || (x==1 && total !=2) || (x==1 && total !=12)) {
				int point = storePoint(die1, die2, x);
				System.out.println("Roll " + x + " -- " + "Die 1: " + die1 + ", Die 2: " + die2 + " -- Total: " + total);
				System.out.print("The Point is: ");
				System.out.println(point);
			}//End
				
		
		//Roll = 1 & total = 7 or 11
				 if (x==1 && total == 7 || x==1 && total ==11) {
					firstRollWin(x,die1, die2);	
					wins++;
					System.out.println(wins + " win(s), " + losses + " loss(es)\n");
					
				break;
				} //End
				
		//Roll = 1 & total = 2, 3, or 12		
				 else if (x==1 && (total == 2 || total ==3 || total ==12)) {
					firstRollLoss(x,die1, die2);	
					losses++;
					System.out.println(wins + " win(s), " + losses + " loss(es)\n");
					
				break;
					} //End
//CANNOT FIGURE THIS OUT BELOW!!
				 
				 
		//Roll > 1 & rolls the point 
			/*	else if (rollsThePoint(x,die1, die2, total)) {
				System.out.println("Roll " + x + " -- " + "Die 1: " + die1 + ", Die 2: " + die2 + " -- Total: " + total);
				System.out.println("Win!");
					wins++;
					System.out.println(wins + " win(s), " + losses + " loss(es) \n");
					
				break;
					} //End*/
				
		//Roll > 1 & rolls 7 
			 else if (x > 1 && (total == 7)) {
					rollsSeven(x,die1, die2);	
					losses++;
					System.out.println(wins + " win(s), " + losses + " loss(es) \n");
				
				break;
					} //End	
				
		//Roll > 1 & rolls is regular number
				 else if (x > 1 && (total != 7)) {
					regularRoll(x,die1, die2);	
					System.out.println("Roll " + x + " -- " + "Die 1: " + die1 + ", Die 2: " + die2 + " -- Total: " + total);
					
				 } //End	
			}//ends second for loop
			
			}
		
	
		
		}
	}

	public static int storePoint(int die1, int die2, int x) {
		
		int total = die1+die2;
	int point;
		if((x==1 && total ==7) || (x==1 && total ==11) || (x==1 && total ==3) || (x==1 && total ==2) || (x==1 && total ==12)) {
			System.out.println();
		}
		point = total;
		return point;
	}//End method 
	

	
	
//Method for first roll and total is 7 or 11 .... WIN	
public static void firstRollWin(int x, int die1, int die2) {
	int total = die1+die2;

if(x == 1 && (total == 7 || total == 11)) 
	System.out.println("Roll " + x + " -- " + "Die 1: " + die1 + ", Die 2: " + die2 + " -- Total: " + total);
	System.out.println("WIN!");
	
}//End firstRollWin method 


//Method for first roll and total is 2, 12, 3 .... CRAPS	
public static void firstRollLoss(int x, int die1, int die2) {
	int total = die1+die2;

if(x == 1 && (total == 2 || total == 12|| total == 3)) 
	System.out.println("Roll " + x + " -- " + "Die 1: " + die1 + ", Die 2: " + die2 + " -- Total: " + total);
	System.out.println("Craps!");
	
}//End firstRollLoss method 


//Method for other rolls and total is the point.... WIN
public static boolean rollsThePoint(int x, int die1, int die2, int thePoint) {
	int total = die1+die2;

if(x > 1 && total == thePoint) {
	return true;
}
return false;
}//End rollsThePoint method 


//Method for other rolls and total is 7.... LOSS
public static void rollsSeven(int x, int die1, int die2) {
	int total = die1+die2;

if(x > 1 && (total == 7)) 
	System.out.println("Roll " + x + " -- " + "Die 1: " + die1 + ", Die 2: " + die2 + " -- Total: " + total);
	System.out.println("LOSS!");
	
}//End rollsSeven method 


public static void regularRoll(int x, int die1, int die2) {
	int total = die1+die2;

if(x > 1 && (total != 7)) 
	System.out.println("Roll " + x + " -- " + "Die 1: " + die1 + ", Die 2: " + die2 + " -- Total: " + total);
	
}//End regularRoll method 

    
}
