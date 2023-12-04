package com.javalec.base;

public class StringBuilder_01 {

	public static void main(String[] args) {
		// Stringbuilder /StringBuffer
		StringBuilder stringBuilder = new StringBuilder("abcdefg");

		stringBuilder.append("hijklmn");
		stringBuilder.insert(3, "zzz");
		stringBuilder.delete(3, 6);

		System.out.println(stringBuilder);

		StringBuffer stringBuffer = new StringBuffer("abcdefg");

		stringBuffer.append("hijklmn");
		stringBuffer.insert(3, "zzz");
		stringBuffer.delete(3, 6);

		System.out.print(stringBuilder);
	}
}