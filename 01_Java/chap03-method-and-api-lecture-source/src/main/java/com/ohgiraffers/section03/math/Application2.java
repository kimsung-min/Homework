package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 난수의 활용
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우들이 존재한다.
        * */
        
        /*
        *  원하는 범위의 난수를 구하는 공식
        * (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        * */

        /* 1. 0 ~ 9까지의 난수 발생 */
        int random1 = (int) (Math.random() * 10);
        System.out.println("0부터 9사이의 난수 : " + random1);

        /* 2. 1 ~ 10까지의 난수 발생 */
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("1부터 10사이의 난수 : " + random2);

        /* 3. 10 ~ 15까지의 난수 발생 */
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("10부터 15사이의 난수 : " + random3);

        /* 4. -128 ~ 127까지의 난수 발생 */
//        int random4 = (int) (Math.random() * 256) + (-128);
        int random4 = (int) (Math.random() * 256) - 128;
        System.out.println("-128부터 127까지의 난수 발생 : " + random4);
    }
}
