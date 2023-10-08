package com.ohgiraffers.section06.statickeyword;

public class STest02 {
    
    // 해외 직구
    public void method2(int num){

        System.out.println(">>>>>>>>>>>>  해외 상품을 " + num + "개 구매합니다. ");
        STest01.i -= num;
    }
}
