package ManAndCupboard;

import GeoTree.Male;

public class main {
    public static void main(String[] args) {
        Man Igor = new Man("Игорь", Male.male);
        Man Marina = new Man("Марина", Male.female);
        Cupboard cupboard = new Cupboard(false);
        Igor.openDor(cupboard);
        Marina.openDor(cupboard);

    }
    
    

}
