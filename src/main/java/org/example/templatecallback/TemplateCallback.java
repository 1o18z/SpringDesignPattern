package org.example.templatecallback;


public class TemplateCallback {
    public static void main(String[] args) {

        Soldier sol = new Soldier();
        sol.runContext("탕탕");
        sol.runContext("챙챙");
        sol.runContext("슉슉");

    }
}

interface Strategy {
    public abstract void runStrategy();

}


class Soldier {
    void runContext(String weaponSound) {
        System.out.println("전투 시작");
        chooseWeapon(weaponSound).runStrategy();
        System.out.println("전투 종료");
    }

    private Strategy chooseWeapon(final String weaponSound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
