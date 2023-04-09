package org.example.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        IService decorator = new Decorator();

        System.out.println(decorator.runSomething());
    }

}

class Decorator implements IService {
    IService service;


    @Override
    public String runSomething() {
        System.out.println("나는양 데코레이더 패턴이용~~ 프록시랑 구현 또가튼뎅 덧붙이지롱~");

        service = new Service();
        return "진짜진짜" + service.runSomething();
    }
}


class Service implements IService {
    @Override
    public String runSomething() {
        return "데코레이터 짱!!!!!!!!!!";
    }
}


interface IService {
    public abstract String runSomething();
}


