package com.ohgiraffers.section06.singleton;

public class Application {

    /*
    * singleton pattern이란
    * 애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
    * 하나의 인스턴스를 공유해서 사용하면 메모리 낭비를 방지할 수 있게 한다.(매번 인스턴스를 생성하지 않는다.)
    * 장점.
    * 1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지않지만
    *    두 번째 이용 시에는 인스턴스 생성 시간 없이 사용할 수 있다.
    * 2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.
    *
    * 단점
    * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
    * (유지보수와 테스트에 문제점이 있다)
    * 2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
    *
    * 싱글톤 구현 방법
    * 1. 이른 초기화 (Eager Initialization)
    * 2. 게으른 초기화(Lazy Initialization)
    * */
    public static void main(String[] args) {

//        EagerSingleton eager = new EagerSingleton(); // 생성자의 접근제한자가 private라서 접근 불가

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1의 hashCode : " + eager1.hashCode());
        System.out.println("eager2의 hashCode : " + eager2.hashCode());

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1의 hashCode : " + lazy1.hashCode());
        System.out.println("lazy2의 hashCode : " + lazy2.hashCode());

    }

}
