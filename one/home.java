package one;

public class home {
	public static void main(String[] args) {
	}
	public int age;
	// Сразу же делаем метод this.
	public home(int age) {
		this.age = age;
	}

	public int ageDay(){
		return age * 365;
	}

	public int ageMon() {
		return age * 12;
	}

	public int ageH(){
		return age * (365 * 24);
	}

	public int ageMin(){
		return age * (365 * 24 * 60);
	}

	public int ageSec() {
		return age * (365 * 24 * 60 * 60 );
	}

	// я бы мог бы просто взять премножить и поставить я просто хочу покозать себе что так умножатся времена =)
}
