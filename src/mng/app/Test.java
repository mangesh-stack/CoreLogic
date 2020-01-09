package mng.app;

import java.util.Scanner;

public class Test {
	static Scanner s = null;
	static Test test = null;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		test = new Test();
		System.out.println("Enter the digit wants to enter ");
		String result = test.findLeaderNo(test.userInput(Integer.parseInt(s.nextLine())));
		System.out.println(result);
	}

	public String findLeaderNo(int[] leaderNo) {
		int temp = 0;
		// bubble sort
		for (int i = 0; i < leaderNo.length; i++) {
			boolean flag = false;
			for (int j = 0; j < leaderNo.length - 1 - i; j++) {
				if (leaderNo[j] > leaderNo[j + 1]) {
					temp = leaderNo[j];
					leaderNo[j] = leaderNo[j + 1];
					leaderNo[j + 1] = temp;
					flag = true;
				} // if
			} // for
			if (flag == false) {
				break;
			} // if
		} // for

		return test.findNumOfOccurencs(leaderNo);

	}// findLeaderNo(-)

	public String findNumOfOccurencs(int[] leaderNo) {
		int count = 0;
		String msg = null;
		int result = 0;
		for (int occurs : leaderNo) {
			boolean flag = false;
			for (int i = 0; i < leaderNo.length; i++) {
				if (occurs == leaderNo[i]) {
					count++;
					flag = true;
				} // if
				result = leaderNo[i];

			} // for
			if (count >= leaderNo.length / 2) {
				msg = "The Leader No Is : " + result;
				flag = false;
			} // if

			if (flag == false) {
				break;
			} // if

			count = 0;

		} // for
		
		return msg;
	}// findNumOfOccurencs(-)

	public int[] userInput(int userInput) {
		int[] inputData = new int[userInput];
		for (int i = 0; i < userInput; i++) {
			System.out.println("Enter value : " + i);
			inputData[i] = Integer.parseInt(s.nextLine());
		} // for
		return inputData;
	}// userInput(-)
}