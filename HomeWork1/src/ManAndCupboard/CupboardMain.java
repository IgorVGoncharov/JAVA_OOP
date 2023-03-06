package ManAndCupboard;

import GeoTree.Male;

public class CupboardMain {
    public static void main(String[] args) {
        Man Igor = new Man("Игорь", Male.male);
        Man Marina = new Man("Марина", Male.female);
        Cupboard cupboard = new Cupboard("Белый");
        Igor.openDor(cupboard);
        cupboard.addItem("Майка", Igor);
        cupboard.addItem("Рубашка", Igor);
        Marina.openDor(cupboard);
        cupboard.addItem("Юбка", Marina);
        cupboard.addItem("Платье", Marina);
        Marina.closeDor(cupboard);
        cupboard.addItem("Штаны", Igor);
        Igor.openDor(cupboard);
        cupboard.addItem("Штаны", Igor);
        Igor.whatInCupboard(cupboard);
        cupboard.removeItem("Юбка", Marina);
        Marina.closeDor(cupboard);
        Igor.whatInCupboard(cupboard);
        cupboard.removeItem("Штаны", Igor);
        Igor.openDor(cupboard);
        cupboard.removeItem("Носки", Igor);
        Igor.whatInCupboard(cupboard);
        Igor.closeDor(cupboard);
        Marina.closeDor(cupboard);
        



    }
    
    

}
