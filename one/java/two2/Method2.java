package two2;

public class Method2 {

	// Функция  - это именовонный фрагмент кода
	// А метод это Функция связанная и асоциированная с какимто обьектом
	//
	//Любой метод является функцией
	//Не любая Функция НЕ является методом
	//
	// Сейчас превратим Функции в МЕТОДЫ
	public static void main(String[] args) {
//		Square2 si = new Square2(3);
//		System.out.println("Площадь квадрата " + si.lila + " равна " + si.area());
//		Rectangle2 rad = new Rectangle2(3,3);
//		System.out.println("Площадь квадрата " + rad.bir + " и " + rad.eki + " равна " + rad.area());

		// repeat


		Square2 s = new Square2(2323);
		System.out.println("Площадь квадрата " + s.lila + " равна " + s.area());

		Rectangle2 r = new Rectangle2(234,234);
		System.out.println("Площадь прямоугольника " + r.a + " и " + r.b +" равна " + s.area());

		System.out.println("                        ");
		// 4 . 10 . 23  - я в польше нашел работу помощник повара думаю у меня получится сработатся и помочь родным

		// решил написать программу которая покажеть сколько дней ты уже живешь
		// будем использовать класс home

		// Укожите возраст
		home hm = new home(23);
		System.out.println(hm.age + " лет  " + hm.ageDay() + " дней"
						+ "\n или же \n" +
		hm.age + " лет  " + hm.ageMon() + " Месяцев "
						+ "\n или же \n" +
		hm.age + " лет  " + hm.ageH() + " часов "
 						+ "\n или же \n" +
		hm.age + " лет  " + hm.ageMin() + " минут "
						+ "\n или же \n" +
		hm.age + " лет  " + hm.ageSec() + " cекунд "
		);

		// Круто !!! =)










}
}