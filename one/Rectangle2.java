package one;

public class Rectangle2 {
	public static void main(String[] args) {

	}

	public double bir;
	public double eki;

	public Rectangle2(double bir, double eki) {
		this.bir = bir;
		this.eki = eki;
	}
// Вот Метод убрали static и внутри скобки
	public double area() {
		return this.bir * this.eki;
	}

}
