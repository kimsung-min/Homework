package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("번호 : ");
            int number = sc.nextInt();

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("소속 : ");
            String dept = sc.next();


            System.out.print("직업 : ");
            String job = sc.next();

            System.out.print("나이 : ");
            int age = sc.nextInt();

            System.out.print("성별 : ");
            char genger = sc.next().charAt(0);

            System.out.println("월급 : ");
            int salary = sc.nextInt();

            System.out.println("보너스 : ");
            double bounsPoint = sc.nextDouble();

            System.out.println("전화번호 : ");
            String phone = sc.next();

            System.out.println("주소 : ");
            String address = sc.next();




        EmployeeDTO employee = new EmployeeDTO();


        employee.setNumber(number);
        System.out.println(employee.getNumber());

        employee.setName(name);
        System.out.println(employee.getName());

        employee.setDept(dept);
        System.out.println(employee.getDept());

        employee.setJob(job);
        System.out.println(employee.getJob());

        employee.setAge(age);
        System.out.println(employee.getGender());

        employee.setSalary(salary);
        System.out.println(employee.getSalary());

        employee.setBonusPoint(bounsPoint);
        System.out.println(employee.getBonusPoint());

        employee.setPhone(phone);
        System.out.println(employee.getPhone());

        employee.setAddress(address);
        System.out.println(employee.getAddress());







    }
}
