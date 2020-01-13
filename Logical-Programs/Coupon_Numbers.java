package logical;

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.*;

/**
 * @author Premsai Manthani
 * @purpose :this program generated coupoun no randomly.
 * 
 */
public class CouponNumbers {
	static Scanner s1 = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coupon_Numbers o1 = new Coupon_Numbers();

		System.out.println("enter thr no of distinct coupons to be printed");
		int num = s1.nextInt();
		String a1[] = new String[num];
		for (int i = 0; i < num; i++) {
			String str = o1.createRandomCode(num);

			int re = o1.check(re, str, a1);
			a1[i] = str;

		}
		o1.display(a1, num);

	}

	public int check(int i, String str, String[] a1) {
		for (int j = 0; j < i; j++) {
			if (str == a1[j]) {
				createRandomCode(i);
			}
		}
	}

	public void display(String[] a1, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("the " + (i + 1) + "th coupoun are" + a1[i]);
		}
	}

	public String createRandomCode(int num) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new SecureRandom();
		for (int i = 0; i < num; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();

		return output;
	}

}
