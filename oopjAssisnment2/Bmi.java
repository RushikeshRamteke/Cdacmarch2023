import java.util.Scanner;
class BmiCalculator {
	 private double height;
	 private double weight;
	 private double BMI;

	  BmiCalculator() {
		this.height= 0;
		this.weight= 0;
	}
		
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void CalculateBmi() {
		BMI= weight/(height * height);
		System.out.println("Bmi value is "+BMI);
	}

}
	 class Ques2{
	public static void main(String[] args) {
		BmiCalculator b = new BmiCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter height");
		double h = sc.nextDouble();
		System.out.println("enter weight");
		double w = sc.nextDouble();
		b.setHeight(h);
		b.setWeight(w);
		b.CalculateBmi();
	}
	}

	


