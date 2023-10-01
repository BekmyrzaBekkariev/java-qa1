package one;
public class Method2 {

	// Функция  - это именовонный фрагмент кода
	// А метод это Функция связанная и асоциированная с какимто обьектом
	//
	//Любой метод является функцией
	//Не любая Функция НЕ является методом
	//
	// Сейчас превратим Функции в МЕТОДЫ
	public static void main(String[] args) {
		Square2 si = new Square2(3);
		System.out.println("Площадь квадрата " + si.lila + " равна " + si.area());

		Rectangle2 rad = new Rectangle2(3,3);
		System.out.println("Площадь квадрата " + rad.bir + " и " + rad.eki + " равна " + rad.area());
	}
}