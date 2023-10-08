package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가
         * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
         * 인덱스를 출력하세요.
         *
         * ex.
         *	문자열 : application
         *	문자 : i
         *	application에 i가 존재하는 위치(인덱스) : 4 8
         *	i 개수 : 2
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.println("문자 하나를 입력하세요 : ");
        char sum = sc.next().charAt(0);

        char[] ch1 = str.toCharArray();

        String result = "";
        String index = "";
        int count = 0;
        for (int i = 0; i<ch1.length; i++){
            if (ch1[i] == sum){
                count++;
                result += i + " ";
            }
        }
            System.out.println("문자열 : " + str);
            System.out.println("문자 : " + sum);
            System.out.println(str + " 에 i가 존재하는 위치(인덱스) : " + result );
            System.out.println("i의 개수 : " + count);


    }
}
