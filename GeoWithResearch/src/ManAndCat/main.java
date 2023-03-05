package ManAndCat;

public class main {
    public static void main(String[] args) {
        Human igor = new Human("Игорь");
        Cat pushok = new Cat("Пушок");
        igor.collingForCat(pushok);
        igor.patCat(pushok);
        pushok.catWantsToEat(igor);
        pushok.catPeed(igor);
        pushok.catComeInNight(igor);
    }
}
