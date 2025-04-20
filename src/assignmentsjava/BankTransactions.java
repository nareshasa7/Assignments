package assignmentsjava;

public class BankTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] transactions = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};

	        // Variables to track results
	        int creditCount = 0;
	        int debitCount = 0;
	        int totalCredit = 0;
	        int totalDebit = 0;
	        int suspiciousCount = 0;

	        // Loop through each transaction
	        for (int i : transactions) {
	            if (i > 0) {
	                creditCount++;
	                totalCredit += i;
	                if (i > 10000) {
	                    System.out.println("Suspicious credit transaction with amount: " + i);
	                    suspiciousCount++;
	                }
	            } else {
	                debitCount++;
	                totalDebit += -i; // Convert to positive for total
	                if (i < -10000) {
	                    System.out.println("Suspicious debit transaction with amount: " + i);
	                    suspiciousCount++;
	                }
	            }
	        }

	        int balance = totalCredit - totalDebit;

	        // Print results
	        System.out.println("Total credit transactions: " + creditCount);
	        System.out.println("Total debit transactions: " + debitCount);
	        System.out.println("Total credited amount: " + totalCredit);
	        System.out.println("Total debited amount: " + totalDebit);
	        System.out.println("Remaining balance: " + balance);
	        System.out.println("Total suspicious transactions: " + suspiciousCount);

	}

}
