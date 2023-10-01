package one;
// Классы и объекты

public class Function1 {

	public static void main(String[] args) {
		secondHello("Nika");
		secondHello("Who ?");

		Square1 s = new Square1(5);
		System.out.println("Площадь квадрата " + s.l + " состовляет " + area(s));

		Rectangle1 r = new Rectangle1(4, 3);
// Мы писали так до конструктора так после мы можем просто написать значение в RectangleQ
//		r.a = 4;
//		r.b = 5;

		System.out.println("Площадь прямоугольника " + r.a + " и " + r.b + " равно " + area(r));
	}


	public static void hello() {
		System.out.println("Hello Bekmyrza Never Give Up");
	}

	public static void secondHello(String somebody) {
		System.out.println("Love of My Life " + somebody + "!");
	}

	public static double area(Square1 s) {
		return s.l * s.l;
	}

	public static double area(Rectangle1 r) {
		return r.a * r.b;
	}


}







