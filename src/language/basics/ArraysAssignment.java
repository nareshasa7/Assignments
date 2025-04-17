package language.basics;

public class ArraysAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Student names and original marks
        String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
        int[] marks = {75, 80, 82};

        // Step 2: Create a new array for updated marks
        int[] updatedMarks = new int[marks.length];
        int total = 0;

        // Step 3: Add 10 marks and store in updatedMarks
        for (int i = 0; i < marks.length; i++) {
            updatedMarks[i] = marks[i] + 10;
            total += updatedMarks[i];  // For calculating average
        }

        // Step 4: Calculate average
        double average = (double) total / updatedMarks.length;

        // Step 5: Print updated marks
        System.out.println("Updated Marks:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + ": " + updatedMarks[i]);
        }

        // Print average
        System.out.println("Average Marks: " + average);

	}

}
