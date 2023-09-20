public class ClassandObject {
	public static void main(String[] args) {
		hello();
		helloQ("Bekmyrza");
		helloQ("user");
		helloQ("Alexy");

		SquareClass s = new SquareClass();
		s.l = 3;
		System.out.println("Площадь квадрата равен " + s.l + " = " + l(s));


		RectangleClass r = new RectangleClass();
		r.a = 4;
		r.b = 3;
		System.out.println("Площадь сторон прямоугольника " + r.a + " и " + r.b + " равен " + area(r));
	}

	public static void hello() {
		System.out.println("Hello");
	}

	public static void helloQ(String somebody) {
		System.out.println("Hello" + somebody + "!");
	}

	public static double l(SquareClass s) {
		return s.l * s.l;
	}

	public static double area(RectangleClass r) {
		return r.a * r.b;
	}

	// Мы создали классы SquareClass и RectangleClass
	// Теперь можно создовать ОБьекты - которые являются придстовителями этих класов
}