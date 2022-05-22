package entities;

public class Employe {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax; 
	}
	public void increaseSalary(double percentage) {
		percentage = (this.grossSalary * percentage) / 100; 
		this.grossSalary += percentage; 
	}
	
	public String toString() {
		return "Employe: " 
				+ name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}

}
