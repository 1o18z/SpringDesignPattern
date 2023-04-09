package org.example.templatemethod;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.playWithOwner();

        System.out.println();
        System.out.println();

        cat.playWithOwner();
    }
}

abstract class Animal{
    // 템플릿 메서드
    public void playWithOwner(){
        System.out.println("이리왕~~~");
        play();
        runSomething();
        System.out.println("잘해썽~~~");
    }

    // 추상 메서드 : 오버라이딩 강제
    abstract void play();

    // Hook 메서드 : 오버라이딩 선택
    void runSomething() {
        System.out.println("쫄랑쫄랑");
    }
}


class Dog extends Animal{

    @Override
    void play() {
        System.out.println("멍멍멍멍멍뭉");
    }

    @Override
    void runSomething() {
        System.out.println("멍멍멍머멍나눈강아징!!!");
    }
}

class Cat extends Animal{

    @Override
    void play() {
        System.out.println("냐냐냥냥냥");
    }

    @Override
    void runSomething() {
        System.out.println("냐냐냥냔ㅇ냐옹나눈꼬양이!!");
    }
}

