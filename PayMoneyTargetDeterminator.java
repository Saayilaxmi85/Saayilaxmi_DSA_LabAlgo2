package dsa.paymoneytgt.determinator;

import java.util.Scanner;

public class PayMoneyTargetDeterminator {
	
	// transaction list
	
	// scanner for input
	
	// constructor - initialize the scanner, declare variables TL, daily Target etc
	
	Integer[] transactionsList;
	Integer dailyTarget;
	
	
	Scanner input;
	
	public PayMoneyTargetDeterminator() {
		
		input = new Scanner(System.in)
				;
	}
	
	// add a method - collect transaction values from user
	// size of the transaction list - input
	// get each inputs (transaction value)- repeated basis the size - input

	private void collectTransactionList() {
		
		System.out.println("Transactions list : ");
		
		System.out.println("Enter the size of the transactions list: ");
		
		Integer transactionListSize = input.nextInt();
		
		transactionsList = new Integer[transactionListSize];
		
		for (int index = 0; index < transactionListSize; index++) {
			
			// value / total size
			System.out.printf("Enter the transaction value: %d / %d ",
					(index + 1), transactionListSize);
			System.out.println();
			
			transactionsList[index] = input.nextInt();
			
		}
	}
	
	// method for collecting daily target - input
	
	private void collectDailyTarget() {
		
		System.out.println("Daily target..");
		
		System.out.println("Enter the value for daily target : ");
		dailyTarget = input.nextInt();
		input.close();
	
	}
	
	// method to find the TL and Target
	
	public void determine() {
		
		collectTransactionList();
		
		collectDailyTarget();
		
		determineTarget();
	
	}
	
	// method or computation to check the target achievement
	
	public void determineTarget() {
		
		int currentSumofTransactionValues = 0;
		
		boolean dailyTargetAchieved = false;
		
		int transactionCounter = 0;
		
		//counter for transaction
		
		// iterate through the transactions, get the value of each transactions
		
		// compute the sum in each iteration - compare 
		
		for (int index = 0; index < transactionsList.length; index++) {
			
			//inc counter
			transactionCounter++;
			
			// get the value of each transaction
			int transactionValue = transactionsList[index];
			
			//compute the sum in each iteration
			currentSumofTransactionValues = currentSumofTransactionValues + transactionValue;
			
			System.out.printf("Current sum of transaction values : %d", 
					currentSumofTransactionValues);
			System.out.println();
			
			if (currentSumofTransactionValues >= dailyTarget) {
			// set the daily target achieved or not
				
				dailyTargetAchieved = true;
				break;
			
			}
		}
		// display result
			// target achieved after N transactions
			// target not achieved
		if(dailyTargetAchieved) {
			
			System.out.printf("Daily target of %d achieved after %d transactions",
					dailyTarget, transactionCounter);
		} else {
			
			System.out.printf("Daily target of %d not achieved", dailyTarget);
			System.out.println();
		}
	}

}
