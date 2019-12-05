package coreex1;

public class ExceptionEx2 {

	public static void main(String[] args) {

		System.out.println("Start");

		int totalMarks = 520;
		int totalSubjects = 6;

		float averageMarks = 0;
		String errorMsg = "";
		try {
			averageMarks = getAvgMarks(totalMarks, totalSubjects);
		} catch (ArithmeticException ae) {
			errorMsg = "Program had issue at this moment. Please try again later...";
		}  catch (Exception ae) {
			errorMsg = "Program had issue at this moment. Please try again later...";
		} finally {
		}

		if (errorMsg != "") {
			System.out.println(errorMsg);
		} else {
			System.out.println("Average Marks: " + averageMarks);
		}

		System.out.println("End");
	}

	// throw is used to throw the exception from called to calling method
	// can handle only one exception at a time
	// Used this in catch block
	static float getAverageMarks(int totalMarks, int totalSubjects) {
		float averageMarks = 0;

		try {
			averageMarks = totalMarks / totalSubjects;
		} catch (ArithmeticException ae) {
			throw ae;
		} catch (Exception ex) {
			throw ex;
		}
		return averageMarks;
	}

	// throws is used to throw the exception from called to calling method
	// can handle multiple exceptions at a time
	// Used as part of method declaration
	static float getAvgMarks(int totalMarks, int totalSubjects) throws ArithmeticException, Exception{
		return totalMarks / totalSubjects;
	}

}
