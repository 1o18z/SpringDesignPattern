package org.example.factorymethod;

public class FactoryMethodPattern {
    public static void main(String[] args) {// 팩터리 메서드를 보유한 객체들 생성
        Animal dog = new Dog();
        Animal cat = new Cat();

        // 팩터리 메서드가 반환한 객체들
        AnimalToy dogBall = dog.getToy();
        AnimalToy catTower = cat.getToy();

        // 팩터리 메서드가 반환한 객체들 사용
        dogBall.identify();
        catTower.identify();
    }
}

abstract class Animal {
    // 추상 팩터리 메서드
    abstract AnimalToy getToy();
}

// 팩터리 메서드가 생성할 객체의 상위 클래스
abstract class AnimalToy {
    abstract void identify();
}

class Dog extends Animal {
    // 추상 팩터리 메서드 오버라이딩
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}

class Cat extends Animal {

    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}

// 팩터리 메서드가 생성할 객체
class DogToy extends AnimalToy {
    @Override
    public void identify() {
        System.out.println("나는야 테니스공 멍멍이의 친구지롱");
    }
}

class CatToy extends AnimalToy {
    @Override
    public void identify() {
        System.out.println("나는야 캣타워 냥냥이의 친구지롱");
    }
}