package sandbox;

public class cycle {
	// Делаем ФУНКЦИЮ по имени isPrime тип значения int с именем n
	// С boolean значением true false

	// Делаем программу, которая распределяет на простое и сложное число
	public static boolean isPrime(int n){
		// Это цикл for
		// % это операция, которая получает остаток от деления к примеру 10 / 3 = 1 остаток 1

		// Можно писать i = i + 1
		// Но лучше i += 1 можно 2 3 4 5 итд
		// Если +1 то можно так i++ = Это ИНКРИМЕНТ
		// Если минус - то i-- = Декремент
		for (int i = 2;i < n;i++){
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}


	// Теперь Цикл While
public static boolean isPrimeWhile(int n){
	int i = 2;
		while (i < n && n % i != 0){
			i++;
		}
		return i == n;
	}

	// long - Что же это такое модификация
// Тип int = для 32 битных чисел
// Тип long = для 64 битных чисел

	public static boolean isPrimeLong(long n){
		for (long i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}



	// С помощью / 2 мы ускорили код в 2 раза, Математика Сила!
	// Было 4 секунд и одна 28 секунд
	// ВОТ ЭТО 2 МИЛИ СЕКУНДЫ !!!!
	// мы сперва здесь отсортировали потом только, начали проверять
	public static boolean isPrimeFast(int n){
		// (int) - вот так мы обозначили что это int
		int m = (int) Math.sqrt(n);
		for (int i = 2; i < m / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
