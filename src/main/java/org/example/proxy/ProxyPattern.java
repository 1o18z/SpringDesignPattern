package org.example.proxy;

public class ProxyPattern {
    public static void main(String[] args) {

        IService proxy = new Proxy(); // List<> ls = new ArrayList<>(); 같은 느낌
        System.out.println(proxy.runSomething());

    }
}

class Service implements IService{
    public String runSomething() {
        return "프록시짱!!!!!!!!";
    }
}

class Proxy implements IService{ // 얘가 짭이구나
    IService service1;

    @Override
    public String runSomething() {
        System.out.println("나눈야 IService 구현한 프록시 클래스양");

        service1 = new Service();
        return service1.runSomething();
    }
}



interface IService {
    String runSomething();
}