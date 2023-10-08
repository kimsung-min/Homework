package com.ohgiraffers.section06.statickeyword;

import com.ohgiraffers.section06.finalkeyword.FinalFieldTest;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest() {
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }


    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }
}
