package countinggame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Counting counting = new Counting();
		Scanner scanner = new Scanner(System.in);
		
		int attempts = 0;
		
		System.out.println("1~30の数字を入力してください");
		
		while(true) {
			System.out.println("数を入力してください");
			int userInput = scanner.nextInt();
			counting.checkNumber(userInput);
			
			attempts++;
			
			if(userInput == counting.targetNumber) {
				break;
			}
		}
		
		System.out.println("正解までにかかった回数:" + attempts + "回");
		
		scanner.close();
	}

}
