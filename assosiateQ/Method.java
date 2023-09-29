// Методы Функции ассоциированные обьекты

package assosiateQ;

import classandobj.RectangleQ;
import classandobj.SquareQ;

public class Method {

	public static void main(String[] args) {
		SquraeTwo s = new SquraeTwo(3);
		System.out.println("Площадь квадрата " +  s.l + " равен " +area(s));


		RectangleTwo r = new RectangleTwo(3, 3);
		System.out.println("Плащадь прямоугольника " + " равен " + r.a +" и "+ r.b + "  " + area(r));

		}

		public static double area (SquraeTwo s){
			return s.l * s.l;
		}

		public static double area (RectangleTwo r) {
			return r.a * r.b;
		}

	}