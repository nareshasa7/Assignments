package assignmentsjava;

public class LoanEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		//loan check
		
		 if (creditScore > 750) {
	            System.out.println(customerName + " is eligible for the loan: Credit score is excellent.");
	        } else if (creditScore >= 650 && creditScore <= 750) {
	            if (income >= 50000) {
	                if (isEmployed) {
	                    if (debtToIncomeRatio < 40.0) {
	                        System.out.println(customerName + " is eligible for the loan.");
	                    } else {
	                        System.out.println(customerName + " is not eligible for the loan: High debt-to-income ratio.");
	                    }
	                } else {
	                    System.out.println(customerName + " is not eligible for the loan: Not employed.");
	                }
	            } else {
	                System.out.println(customerName + " is not eligible for the loan: Insufficient income.");
	            }
	        } else {
	            System.out.println(customerName + " is not eligible for the loan: Low credit score.");
	        }
	    }
	}


