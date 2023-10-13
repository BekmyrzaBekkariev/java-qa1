package sandbox;

// У if есть 3 формы
public class ifForm {
	private double a;
	private double b;
	private double c;
	private int n;

	public ifForm(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;


		double d = b * b - 4 * a * c;
//  ! Есть такой метод оформления так понятнее и красивее
		if (b > 0) {
			n = 2;
		} else if (d == 0) {
			n = 1;
		} else {
			n = 0;
		}

		//1 если есть только одно действие то {} можно убрать НО так лучше не делать ПЛОХОЙ
		if (a == 0)
			System.out.println("Вырожденное уровнение");
		// Как могли заметить это не полное выроденное if так как нет else
		if (a == 0) {
			System.out.println("Вырожденное уорвнение");
		}

		// СЕрия отдельных проверок условия - C точки зрения производительности плохой вариант
		if (d > 0) {
			n = 2;
		}
		if (d == 0) {
			n = 1;
		}
		if (d < 0) {
			n = 0;
		}

		// Ещё условия !
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					n = -1;
				} else {
					n = 0;
				}
			} else {
				n = 1;
			}

		} else {
			if (b > 0) {
				n = 2;
			} else if (d == 0) {
				n = 1;
			} else {
				n = 0;
			}
		}
// Если хотите проветить сперва квадратное уровнение то можно
		// сделать так !=
		if (a != 0) {
			if (b > 0) {
				n = 2;
			} else if (d == 0) {
				n = 1;
			} else {
				n = 0;
			}
		} else if (b != 0) {
				n = 1;
			} else if (c == 0) {
				n = 0;
			} else {
				n = -1;
			}
		}
}

