class Function {
	public static void main(String[] args) {
		// Show function
		hello();

		// SEcond Type Function
		secondHello("world");
		secondHello("AleXy");
		secondHello("user");


		double len = 5;
		System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

		// Нахождение площади прямоугольника

		double a = 4;
		double b = 5;
		System.out.println("Площадь прямоугольника cо сторонами " + a + " и " + b + " = " + area( a, b));
	}

	// Create Function
	public static void hello() {
		System.out.println("Hello Bekmyrza we created function");
	}

	// 2 SEcond type function

	public static void secondHello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

	//  void - function которая ничего не возрвощяет

	// retun - function котрая возврощяет
	public static double area(double l){
		return l * l;
	}

	// ! Две похожие переменные в двух разных функциях это две разные вещи

	// Делаем вычисление площади прямоугольника
	public static double area(double a, double b){
		return a * b;
	}
}