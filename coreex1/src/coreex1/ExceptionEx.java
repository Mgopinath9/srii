package coreex1;

public class ExceptionEx {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int totalMarks = 520;
		int totalSubjects = 6;
		
		float averageMarks = 0;
		String errorMsg = "";
		//Abnormal state of program execution
		try {
			//System.out.println("To write doughtable code");
			averageMarks = totalMarks / totalSubjects;
		} catch(ArithmeticException ae) {
			//System.out.println("To catch and handle the exception");
			errorMsg = "Program had issue at this moment. Please try again later...";
		} finally {
			//System.out.println("To close the object references and can be called always");
		}
		
		if(errorMsg != "") {
			System.out.println(errorMsg);
		} else {
			System.out.println("Average Marks: "+averageMarks);
		}
		
		System.out.println("End");
	}

}
