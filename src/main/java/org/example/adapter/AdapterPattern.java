package org.example.adapter;

public class AdapterPattern {
    public static void main(String[] args) {

        AdapterServiceA adA = new AdapterServiceA();
        AdapterServiceB adB = new AdapterServiceB();

        adA.runService();
        adB.runService();
//        ServiceA sa1 = new ServiceA();
//        ServiceB sb1 = new ServiceB();
//
//        sa1.runServiceA();
//        sb1.runServiceB();
    }
}

class ServiceA{
    void runServiceA(){
        System.out.println("ServiceA.runServiceA");
    }
}

class ServiceB{
    void runServiceB(){
        System.out.println("ServiceB.runServiceB");
    }
}

class AdapterServiceA{
    ServiceA sa1 = new ServiceA();

    void runService(){
        sa1.runServiceA();
    }
}

class AdapterServiceB{
    ServiceB sb1 = new ServiceB();

    void runService(){
        sb1.runServiceB();
    }
}
