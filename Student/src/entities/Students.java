package entities;

public class Students {

	public String nome;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public String result() {
		if (finalGrade() >= 60.00) {
			return "PASS";
		} else {
			return "FALIED";
		}
	}

	public double missing() {
		if (finalGrade() < 60.00) {
			return (60.00 - finalGrade());
		} else {
			return 0;
		}
	}
	public String toString() {
		return nome + "\n"
				+"FINAL GRADE = "
				+ finalGrade() + "\n"
				+"RESULT = " 
				+ result() + "\n"
				+"MISSING = "
				+ missing() + "POINTS";
	}

}
