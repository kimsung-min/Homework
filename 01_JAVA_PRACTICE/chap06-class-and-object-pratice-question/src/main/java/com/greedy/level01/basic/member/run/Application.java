package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {


        MemberDTO member = new MemberDTO();

        System.out.println(member.getId());
        System.out.println(member.getPwd());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getGender());
        System.out.println(member.getPhone());
        System.out.println(member.getEmail());

        member.setId("user01");
        member.setPwd("pass01");
        member.setName("홍길동");
        member.setAge(0);
        member.setGender('M');
        member.setPhone("010-1234-5678");
        member.setEmail("hong123@greedy.com");

        System.out.println();
        System.out.println("==========변경후=========");
        System.out.println();

        System.out.println(member.getId());
        System.out.println(member.getPwd());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getGender());
        System.out.println(member.getPhone());
        System.out.println(member.getEmail());




    }
}
