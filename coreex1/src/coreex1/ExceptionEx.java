package coreex1;

public class ExceptionEx {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int totalMarks = 520;
		int totalSubjects = 6;
		
		float averageMarks = 0;
		String errorMsg = "";
		try {
			averageMarks = totalMarks / totalSubjects;
		} catch(ArithmeticException ae) {
			errorMsg = "Program had issue at this moment. Please try again later...";
		} finally {
		}
		
		if(errorMsg != "") {
			System.out.println(errorMsg);
		} else {
			System.out.println("Average Marks: "+averageMarks);
		}
		
		System.out.println("End");
	}

}
