package lesson06part1;

public class Hourly implements Salary{
	
	double h;
	double s;

	public Hourly(double h, double s) {
		this.h = h;
		this.s = s;
	}

	@Override
	public void salary() {
		System.out.println("��������� �������� ���������� " + this.h * this.s + " ���/��");
	}

	
}
