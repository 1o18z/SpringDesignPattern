package org.example.singleton;

public class SingletonPattern {
    public static void main(String[] args) {
        // private 생성자이므로 new를 통해 인스턴스 생성 불가
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        Singleton st3 = Singleton.getInstance();

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        st1 = null;
        st2 = null;
        st3 = null;
    }


}

class Singleton{
    static Singleton singletonObject; // 정적 참조 변수

    private Singleton(){}; // private 생성자

    // 객체 반환 정적 메서드
    public static Singleton getInstance(){
        if(singletonObject == null){
            singletonObject = new Singleton();
        } // 정적 참조 변수에 객체가 할당돼 있지 않은 경우에만 new를 통해 객체 생성 후 정적 참조 변수에 할당

        return singletonObject;
        // 정적 참조 변수에 할당돼 있는 유일한 객체의 참조를 반환
    }
}

