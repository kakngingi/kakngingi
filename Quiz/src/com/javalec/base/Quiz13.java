package com.javalec.base;

import java.util.Scanner;

public class Quiz13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 숫자의 갯수 : ");
        int num = sc.nextInt();
        int[] number = new int[num];

        System.out.println(num + "개의 숫자를 입력하세요!: ");

        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + "의 숫자 : ");
            number[i] = sc.nextInt();
        }

        System.out.print("몇 번째의 숫자를 삭제 하시겠습니까? : ");
        int position = sc.nextInt();

        // 배열 크기를 1 감소시키기 위해 새로운 배열의 크기를 num-1로 설정
        int[] arr = new int[num - 1];
        int index = 0;

        for (int i = 0; i < num; i++) {
            // 삭제할 위치에 있는 숫자는 건너뛰고 나머지 숫자를 새로운 배열에 복사
            if (position - 1 != i) {
                arr[index++] = number[i];
            }
        }

        System.out.println("삭제 후 배열: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}