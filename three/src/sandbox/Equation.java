//package sandbox;
//public class Equation {
//	private double a;
//	private double b;
//	private double c;
//		// Условия
//		// Решение Квадратного уровнения D = b'2 - 4ac
//
//	// Делаем конструктор который принимает 3 значения
//	// -- Указываем на а b c по одному и нажимаем Alt + Enter и выбираем короче
//	// второе чтобы вышло this круто
//
//	// Чтобы в конце присвоить значение создадим отрибут n;
//	private int n;
//	public Equation (double a, double b, double c){
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		// Это дискриминан
//		double d = b * b - 4 * a * c;
//
//		if (d > 0){
//			n = 2;
//		}else {
//			if (d == 0) {
//				n = 1;
//			}else {
//				n = 0;
//			}
//		}
//		// Давайте теперь напишем тест для него тесты нужно делать в отдельной вкладке
// НЕ хватает функции для получения значения отрибута
//		}
//		public int rootNumber(){
//			return n;
//	}
//}
// ---------------------------------


package sandbox;

// Теорема пифагора Practice
// a b - катеты с  = гипотенуза
public class Equation {
	private double a;
	private double b;

	private int n;

	public Equation(double a, double b){
		this.a = a;
		this.b = b;
		double c = 0;
		double с = a * a + b * b;

		if (c > 0 ){
			n = (int) c;
		} else{
			if (c == 0){
				n = 0;
			}else {
				n = (int) c;
			}
		}
	}
	public int rootNumber(){
		return n;
	}
}