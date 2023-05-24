package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("cco")
public class ChineseCourse implements Course {

    @Override
    public void combineMenu() {
        System.out.println("--------중식 코스요 구성--------");
        System.out.println("1. 샥스핀 스프");
        System.out.println("2. 냉채");
        System.out.println("3. 계란볶음밥");
        System.out.println("4. 유린기");
        System.out.println("5. 탕수육");
        System.out.println("6. 전가복");
        System.out.println("7. 리치");
    }
}
