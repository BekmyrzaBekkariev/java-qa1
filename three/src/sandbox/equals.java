package sandbox;

public class equals {
	public static void main(String[] args){
		// CРавнение == или метод .equals
		// Для сравнения чисел можно использовать ==
		// Для остальных лучше использовать Метод .equals
		// здесь s2 = s1 - здесь новый объект не создавался, а ссылался
		String s1 = "firefox";
		String s2 = s1;
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
		//---------
		// Тут s1 и 2 s1 это две разные вещи и хранятся в разных местах

		// МЕТОД .equals - сравнивает НЕ Ссылки, а Содержимое Объектов (внутрь)
		// .equals - Сравнение ЛОГИЧЕСКИ

		String v1 = "firefox";
		String v2 = new String(v1);
		System.out.println(v1 == v2); // false
		System.out.println(v1.equals(v2)); // true
		// Переменная - это ссылка на объект

		// 3 пример сравнение не зависимое
		// d1 и d2 = независимые друг от друга им плевать что было присвоено до d2

		// НО тут дела ККомпилятора Он догадается что они похожи
		String d1 = "firefox";
		String d2 = "firefox";
		System.out.println(d1 == d2); // false
		System.out.println(d1.equals(d2)); // true


		// Вот тут компилятор не сможет оптимизировать хотя они похожи
		String a1 = "firefox 2.0";
		String a2 = "firefox" + Math.sqrt(4.0);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));

	}
}
