// для каждого отдельного домашнего задания создаю новый обьект. 
//Считаю это правильно, т.к. по идее это не связанные задания.
// Если считаем их связанными, то можно human наследовать от Person.
//как лучше??

package ManAndCupboard;

import GeoTree.Male;

public class Man {
    private String name;
    private Male male;
    private Integer age;

    public Man(String name, Male male, Integer age){
        this.name = name;
        this.male = male;
        this.age = age;
    }
    public Man(String name, Male male){
        this.name = name;
        this.male = male;
    }

    public Man(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public Man(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Male getMale(){
        return male;
    }

    public Integer getAge(){
        return age;
    }

    public void openDor(Cupboard cupboard){
        if (cupboard.getOpenClose()){
            System.out.println("Дверца шкафа уже открыта");
        }
        else{
            if (this.male == Male.male){
                System.out.println(this.name + " открыл дверцу шкафа");
            }
            else{
                System.out.println(this.name + " открыла дверцу шкафа");
            }
        }
    }
}
