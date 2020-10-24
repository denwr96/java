package main.java.javaguru.sunday.student_violeta_klimova.lesson_3.level_6.task_24_part_1;

class Chips {

    private final String chipsName;
    private double packWeight;
    private boolean open;

    Chips(String chipsName, double packWeight, boolean open) {
        this.chipsName = chipsName;
        this.packWeight = packWeight;
        this.open = open;
    }

    String getChipsName() {
        return chipsName;
    }

    public double getPackWeight() {
        return packWeight;
    }

    void openPack() {
        this.open = true;
    }

    void emptyPack() {
        packWeight = 0;
    }

    boolean isPackOpen() {
        return open;
    }

}

class ChipsDemo {
    public static void main(String[] args) {
        Chips chips = new Chips ("MyHomeMadeChips", 150, false);
                                //They don't pay for advertisement
        System.out.println("There is some nice pack named: " + chips.getChipsName());

        if (chips.isPackOpen()) {
            System.out.println("Oh no! My pack was already by someone!");
        } else {
            System.out.println("Lets open it!");
            chips.openPack();
            System.out.println("Now it is open, time to get more weight!");
            System.out.println("Pack has a weight of " + chips.getPackWeight() + " grams.");
            chips.emptyPack();
            System.out.println("Not even a second passed, but the weight of pack is " + chips.getPackWeight() + " grams!");
            System.out.println("Oh no, but tasty...");
            System.out.println("Hell yeah!");
        }
    }
}