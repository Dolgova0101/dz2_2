//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int replenishment = 1200;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итого бонусов: " + bonus);

        int balance = bonus + amount + replenishment;

        System.out.println("Итого баланс: " + balance);


    }
}