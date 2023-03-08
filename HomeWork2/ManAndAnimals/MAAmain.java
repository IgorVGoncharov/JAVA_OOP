package HomeWork1.GeoTree.HomeWork2.ManAndAnimals;

public class MAAmain {
    public static void main(String[] args) {
        Man Igor = new Man("Игорь");
        Cat cat = new Cat("Барсик", 5);
        Dog dog = new Dog("Дружок", 3);
        
        cat.wantToEat();
        cat.voice();
        Igor.takeEat(cat);
        System.out.println("\n");
        dog.wantToEat();
        dog.voice();
        Igor.takeEat(dog);
        System.out.println("\n");
        Igor.callingForCat(cat);
        cat.reactionForCall(Igor);
        System.out.println("\n");
        Igor.callingForGDog(dog);
        dog.reactionForCall(Igor);
        System.out.println("\n");
        Igor.playingWithDog(dog);
        dog.bringAStick();
            

    }
}
