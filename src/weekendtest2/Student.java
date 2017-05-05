package weekendtest2;

public class Student {

	boolean talkative;
	int score;
	int attendence;

	public Student(boolean newTalkative, int newscore, int newattendance) {
		talkative = newTalkative;
		score = newscore;
		attendence = newattendance;
	}

	public boolean isAttendanceGood() {
		if (attendence > 80)
			return true;
		else
			return false;
	}

	public int getScore() {
		return score;
	}

	public boolean isTalkative() {
		return talkative;
	}

	public String printGrade(Student s) {
		String grade = "";
		if (score > 80) {
			grade = "A";
			System.out.println("A grade");
		} else if (score > 60 && score < 80) {
			grade = "B";
			System.out.println("B grade");

		} else if (score == 80) {
			if (isAttendanceGood()) {
				grade = "A";
				System.out.println("A grade");
			} else {
				grade = "B";
				System.out.println("B grade");
			}
		} else if (score == 60) {
			if (isTalkative()) {
				grade = "C";
				System.out.println("C grade");
			} else {
				grade = "B";
				System.out.println("B grade");
			}
		}
		return grade;
	}
}
