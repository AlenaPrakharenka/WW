package pages;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

	public static int nthSmallestNum(int num) {

		Random t = new Random();

		int[] numbers = new int[500];

		for (int c = 0; c < numbers.length; c++) {
			numbers[c] = (t.nextInt(700));
		}

		Arrays.sort(numbers);

		return numbers[num];

	}

	public static void main(String[] args) {
		System.out.println(nthSmallestNum(3));
	}

}
