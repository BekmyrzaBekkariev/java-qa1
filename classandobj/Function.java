// Классы и объекты

package classandobj;

public class Function {
	public static void main(String[] args) {
		hello();

		secondHello("Nika");
		secondHello("Who ?");

		SquareQ s = new SquareQ(5);
		System.out.println("Площадь квадрата " + s.l + " состовляет " + area(s));

		RectangleQ r = new RectangleQ(4, 3);
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

	public static double area (SquareQ s) {
		return s.l * s.l;
	}

	public static double area (RectangleQ r) {
		return r.a * r.b;
	}


}



