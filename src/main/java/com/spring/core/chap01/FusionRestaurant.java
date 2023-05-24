package com.spring.core.chap01;

import java.lang.reflect.Field;

public class FusionRestaurant implements Restaurant {

    // 셰프
    private Chef chef;

    // 코스
    private Course course;

    public FusionRestaurant() {
        chef = new JapaneseChef();
        course = new JapaneseCourse();
    }

    @Override
    public void order() {
        System.out.println("여기는 퓨전 레스토랑입니다.");
        course.combineMenu();
        chef.cook();

    }
}
