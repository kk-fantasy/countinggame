package countinggame;
import java.util.Random;

public class Counting {
	
	Random random = new Random();
	int targetNumber = random.nextInt(30) + 1;
	
	public void checkNumber(int inputNumber) {
	if (targetNumber < inputNumber) {
		System.out.println("高いです");
	}else if(targetNumber > inputNumber) {
		System.out.println("低いです");
	}else {
		System.out.println("正解です！");
	}
	}

}
