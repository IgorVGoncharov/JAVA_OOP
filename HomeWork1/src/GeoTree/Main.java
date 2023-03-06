package GeoTree;
public class Main {
    public static void main(String[] args) {
        Person Igor = new Person("Игорь", Male.male, 1981);
        Person Evgeniy = new Person("Евгений", Male.male, 1978);
        Person Galina = new Person("Галина", Male.female, 1954);
        Person Victor = new Person("Виктор", Male.male, 1950);
        Person Ludmila = new Person("Людмила", Male.female, 1953);
        Person Nikolay = new Person("Николай", Male.male, 1933);
        Person Olga = new Person("Ольга", Male.female, 1935);
        Person Elena = new Person("Елена", Male.female, 1930);
        Person Ivan = new Person("Иван", Male.male, 1927);
        GeoTree gt = new GeoTree();
        gt.append(Igor, Relationship.brother, Evgeniy);
        gt.append(Igor, Relationship.children, Galina);
        gt.append(Igor, Relationship.children, Victor);
        gt.append(Evgeniy, Relationship.children, Galina);
        gt.append(Evgeniy, Relationship.children, Victor);
        gt.append(Galina, Relationship.wife, Victor);
        gt.append(Galina, Relationship.children, Olga);
        gt.append(Galina, Relationship.children, Nikolay);
        gt.append(Nikolay, Relationship.husband, Olga);
        gt.append(Victor, Relationship.children, Elena);
        gt.append(Victor, Relationship.children, Ivan);
        gt.append(Elena, Relationship.wife, Ivan);
        gt.append(Ludmila, Relationship.sister, Victor);
        gt.append(Ludmila, Relationship.children, Elena);
        gt.append(Ludmila, Relationship.children, Ivan);
        
        //System.out.println(new Reserch(gt).spend(Igor, Relationship.children));
        
        new Reserch(gt).FindParent(Igor); // ищет родителей указанного человека
        new Reserch(gt).findSistBroth(Victor); // ищет систер и братьев указанного человека
        new Reserch(gt).FindChildren(Olga); // изет всех детей указанного человека
        new Reserch(gt).FindMale(Victor, Male.male);// выдает все связи по женской или мужской линии
        new Reserch(gt).BornBefor(1950); //выдает список людей, которые родились до указанного года
        new Reserch(gt).AllRelations(Victor); // поиск всех связей человека
    }

}
