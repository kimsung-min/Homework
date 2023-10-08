package com.ohgiraffers.section06.statickeyword;

public class STest01 {
    // 백화점 : 한정판 신발판매점 상품
    public static int i = 30; // 기준값 (사고 팔고...총갯수)

    public void method1() {
        System.out.println(">>>>>>> 현재 " + i + "개 남았습니다. ");
    }

    public void method2(int num) {
        System.out.println(">>>>>>>>> 상품을 " + num + "개 구매합니다.");
        i -= num;
    }
}
