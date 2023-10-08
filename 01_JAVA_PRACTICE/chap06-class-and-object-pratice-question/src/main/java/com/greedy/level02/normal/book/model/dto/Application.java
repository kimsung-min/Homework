package com.greedy.level02.normal.book.model.dto;

public class Application {
    public static void main(String[] args) {



        BookDTO bookDTO = new BookDTO();


        System.out.println(bookDTO.getTitle());
        System.out.println(bookDTO.getPublisher());
        System.out.println(bookDTO.getAuthor());
        System.out.println(bookDTO.getPrice());
        System.out.println(bookDTO.getDiscountRate());
//
//        bookDTO.BookDTO("자);
        bookDTO.setTitle("자바의 정석" );
        bookDTO.setPublisher("자바의 정석" );
        bookDTO.setAuthor("자바의 정석" );
        bookDTO.setPrice(0);
        bookDTO.setDiscountRate(0.0 );

        System.out.println();
        System.out.println("=====================================================");
        System.out.println();
        System.out.println(bookDTO.getTitle());
        System.out.println(bookDTO.getPublisher());
        System.out.println(bookDTO.getAuthor());
        System.out.println(bookDTO.getPrice());
        System.out.println(bookDTO.getDiscountRate());


        BookDTO bookDTO2 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5 );

        System.out.println();
        System.out.println("=====================================================");
        System.out.println();
        System.out.println(bookDTO2.getTitle());
        System.out.println(bookDTO2.getPublisher());
        System.out.println(bookDTO2.getAuthor());
        System.out.println(bookDTO2.getPrice());
        System.out.println(bookDTO2.getDiscountRate());




    }
}
