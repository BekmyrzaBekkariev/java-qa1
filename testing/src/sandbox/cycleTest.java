package sandbox;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class cycleTest {
	@Test
	public void testCycle(){
		// Тестируем код он прошелся по нему и проверил более 2 млрд цифр Ё
		Assert.assertTrue(cycle.isPrime(Integer.MAX_VALUE));
	}
	@Test
	public void testNONCycle1(){
		Assert.assertFalse(cycle.isPrime(Integer.MAX_VALUE - 2));
	}


	// Создали тест для long в тип значение long вставили n и это передали в assert
	// !!! Если хотим что бы тест не запускался, то можно так	@Disabled рядом с @Test

	@Test
	@Disabled
	public void isPrimeLong(){
		long n = Integer.MAX_VALUE;
		Assert.assertFalse(cycle.isPrimeLong(n));
	}


	@Test
	public void testFast(){
		Assert.assertTrue(cycle.isPrimeFast(Integer.MAX_VALUE));
	}



}


