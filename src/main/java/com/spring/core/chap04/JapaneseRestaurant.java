package com.spring.core.chap04;

import org.springframework.stereotype.Component;


public class JapaneseRestaurant implements Restaurant {

    // 셰프도 레스토랑 소속
    private Chef chef;

    // 코스요리 메뉴도 레스토랑 소속
    private Course course;

    public JapaneseRestaurant() {
        this.chef = new JapaneseChef();
        this.course = new JapaneseCourse();
    }
    @Override
    public void order() {

        System.out.println("한국 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();

    }
}
