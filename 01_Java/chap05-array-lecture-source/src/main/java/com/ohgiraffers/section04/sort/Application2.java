package com.ohgiraffers.section04.sort;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 순차정렬
        *
        * 순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘으로
        * 배열의 처음과 끝을 탐색하여 차순대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
        * */

        int[] iarr = {2, 5, 4, 6, 1, 3};

        /* 인덱스 한 개씩 증가시키는 반복문
        *  첫번쨰 인덱스는 비교할 필요가 없어서 1번 인덱스부터 비교시작
        * */
        for(int i = 1; i < iarr.length; i++) {

            for(int j = 0; j < i; j++) {

                /*
                * "<" : 오른차순 정렬을 위한 처리
                * ">" : 내림차순 정렬을 위한 처리
                * */
                if(iarr[i] < iarr[j]){
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }


        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }
}
