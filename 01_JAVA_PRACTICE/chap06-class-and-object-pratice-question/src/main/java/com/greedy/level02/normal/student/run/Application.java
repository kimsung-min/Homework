package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

public class Application {
    public static void main(String[] args) {

        StudentVO student = new StudentVO(1, 2, "홀길동", 175.5, '남');

        System.out.println("학년 : " + student.getGrade());
        System.out.println(student.getClassroom());
        System.out.println(student.getName());
        System.out.println(student.getHeight());
        System.out.println(student.getGender());


    }
}
