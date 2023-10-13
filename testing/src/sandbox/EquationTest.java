//package sandbox;
//
//import org.junit.jupiter.api.Test;
//
//// Добавьте эту строку для импорта класса Equation
//import org.testng.Assert;
//
//// ВООООТ В Чем проблема не подключения я просто не подключил аааааа
//import sandbox.Equation;
//public class EquationTest {
//	// Cдесь будем делать тесты для Equation
//
//	// это будет тест для ситуацию когда решении нет
//	@Test
//	public void test0() {
//		Equation e = new Equation(1,1,1);
//		Assert.assertEquals(e.rootNumber(), 0);
//	}
//	@Test
//	public void test1() {
//		Equation e = new Equation(1,2,1);
//		Assert.assertEquals(e.rootNumber(), 1);
//	}
//	@Test
//	public void test2() {
//		Equation e = new Equation(1,5,6);
//		Assert.assertEquals(e.rootNumber(), 2);
//	}
//}

// ---------------------------------

package sandbox;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class EquationTest {
	@Test
	public void test0(){
		Equation e = new Equation(1,4);
		Assert.assertEquals(e.rootNumber(),0);
	}
	@Test
	public void test1(){
		Equation e = new Equation(1,0);
		Assert.assertEquals(e.rootNumber(),0);
	}
	@Test
	public void test2(){
		Equation e = new Equation(1,1);
		Assert.assertEquals(e.rootNumber(),0);
	}
}

// null = когда в тесте ссылаются на null то
// if (text == null) вот здесь мы должны использовать == так как должны проверить физически
//  == ФИЗИЧЕСКИ
// .equals() внутренни

