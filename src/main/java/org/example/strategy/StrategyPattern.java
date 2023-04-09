package org.example.strategy;

public class StrategyPattern {
    public static void main(String[] args) {

        Strategy strategy = new StrategyBow();
        Strategy strategy2 = new StrategyGun();
        Strategy strategy3 = new StrategySword();

        Soldier sol = new Soldier();
        sol.runContext(strategy);
        sol.runContext(strategy2);
        sol.runContext(strategy3);
    }
}

interface Strategy {
    public abstract void runStrategy();

}

class StrategyGun implements Strategy {

    @Override
    public void runStrategy() {
        System.out.println("탕타탕탕아당당");
    }
}

class StrategyBow implements Strategy {

    @Override
    public void runStrategy() {
        System.out.println("슈슈슉슉슈슛ㄱ");
    }
}

class StrategySword implements Strategy {

    @Override
    public void runStrategy() {
        System.out.println("챙챙챛채챛ㅇ챙챙");
    }
}

class Soldier {
    void runContext(Strategy strategy) {
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}