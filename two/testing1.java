package two;

public class testing1 {

	// Создаем тестинг
	// есть библиотеки с репозиториями для тестинга с .jar maven_repository
	// ищем search.maven.org -> ищем testng -> gradle -> копируем и вствляем в файл build.gradle
	public static void main(String[] args) {
		square s = new square(23);
		rectangle r = new rectangle(232,23);
		System.out.println("Площадь квадрата  " + s.len + " равна " + s.area());
		System.out.println("Площадь прямоугольника " + r.a + " и " + r.b + " равна " + r.area());
	}
}
