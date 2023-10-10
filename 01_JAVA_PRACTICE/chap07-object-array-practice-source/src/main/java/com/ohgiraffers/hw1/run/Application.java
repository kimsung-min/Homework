package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO[] employeeDTO = new EmployeeDTO[3];
        employeeDTO[0] = new EmployeeDTO(0, null, null, null, 0, '0', 0, 0.0, null, null);
        employeeDTO[1] = new EmployeeDTO( 1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울 잠실");
        employeeDTO[2] = new EmployeeDTO( 2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");



        for (int i = 0; i < employeeDTO.length; i++){
            //employeeDTO[i] = new EmployeeDTO();
            System.out.println(employeeDTO[i].information());
        }

        System.out.println("=========================================================================");

        employeeDTO[0] = new EmployeeDTO( 0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        employeeDTO[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");

        for (int i = 0; i < employeeDTO.length; i++) {
            //employeeDTO[i] = new EmployeeDTO();
            System.out.println(employeeDTO[i].information());


            System.out.println("김말똥의 연봄 : " + employeeDTO[0].yearSalary() + "원");
            System.out.println("홍길동의 연봄 : " + employeeDTO[1].yearSalary() + "원");
            System.out.println("강말순의 연봉 : " + employeeDTO[2].yearSalary() + "원");

            System.out.println(employeeDTO[0].argyearSalary() + employeeDTO[1].argyearSalary() + employeeDTO[2].argyearSalary() / 3);

            System.out.println(employeeDTO[0].sum());
        }
    }

}
