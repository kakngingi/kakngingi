
package com.javalec.base;

import java.util.Scanner;

public class Quiz12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 숫자의 갯수? : ");
        int num = scanner.nextInt();
        int[] agroup = new int[num];
        int[] bgroup = new int[num + 1];

        System.out.println(num + "개의 숫자를 입력하세요!");
        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + "의 숫자 : ");
            int num2 = scanner.nextInt();
            agroup[i] = num2;
        }
        System.out.print("숫자를 삽입하고자 하는 위치는 ? :");
        int ilct = scanner.nextInt();
        System.out.print("삽입하고자 하는 숫자는? :");
        int inum = scanner.nextInt();

        System.out.println("-------- 결과 --------");

        int cnt = 0;
        for (int i = 0; i < agroup.length + 1; i++) {
            if (ilct - 1 == i) {
                bgroup[i] = inum;
            } else {
                bgroup[i] = agroup[cnt];
                cnt++;
            }
        }

        for (int i = 0; i < bgroup.length; i++) {
            System.out.println(bgroup[i]);
        }

    }
}
/*
Scanner sc = new Scanner(System.in);
int cnt = 0;	// 입력갯수
int[] number;	// 입력 저장 배열
int position = 0;	// 삽입위치
int insNum = 0;	// 삽입 숫자

System.out.print("입력할 숫자의 갯수 :");
cnt = sc.nextInt();
number = new int[cnt+1];


System.out.println(cnt + "개의 숫자를 입력하세요!: ");

for(int i = 0; i<cnt;i++) {
	System.out.print((i+1) + "의 숫자 : ");
	number[i] = sc.nextInt();
	
}
System.out.print("숫자를 삽입하고자 하는 위치는 ?");
position = sc.nextInt();

System.out.print("삽입하고자 하는 수는 ?");
insNum = sc.nextInt();

for(int i = cnt-1; i >= position-1; i--) {
	number[i+1] = number[i];
}
number[position-1] = insNum;

System.out.println("-----결과-----");
for(int i=0; i <cnt+1;i++) {
System.out.println(String.format("%3d", number[i]));
}
}


}
*/
