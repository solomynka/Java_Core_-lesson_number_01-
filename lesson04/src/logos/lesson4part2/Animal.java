package logos.lesson4part2;

public class Animal {
	private String name;
	private int speed;
	private int age;
	
	
	public Animal() {
		this.age = 7;
		this.name = "�������";
		this.speed = 20;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void getAll() {
		System.out.println("����� �������= " + name + ",�������� �������= " + speed + "��/���,³� �������= " + age + " ����");
	}
	
	

}
