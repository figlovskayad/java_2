public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 300;
        if (replenishment > 1000) {
            System.out.println("Итоговый счет " + (balance + replenishment));
            System.out.println("Бонус " + replenishment / 100);

        } else {
            System.out.println("Итоговый счет " + (balance + replenishment));
        }

    }
}

