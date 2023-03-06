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

    public void setAge(Integer age){
        this.age = age;
    }

    public void openDor(Cupboard cupboard){
        if (cupboard.getdorOpen()){
            System.out.println(this.name + " хочет открыть дверцу шкафа, но она уже открыта!");
        }
        else{
            if (this.male == Male.male){
                System.out.println(this.name + " открыл дверь шкафа");
            }
            else{
                System.out.println(this.name + " открыла дверь шкафа");
            }
            cupboard.setdorOpen(true);
        }
    }

    public void closeDor(Cupboard cupboard){
        if (!cupboard.getdorOpen()){
            System.out.println(this.name + " хочет закрыть дверцу шкафа, но она уже закрыта!");
        }
        else{
            if (this.male == Male.male){
                System.out.println(this.name + " закрыл дверцу шкафа");
            }
            else{
                System.out.println(this.name + " закрыла дверцу шкафа");
            }
            cupboard.setdorOpen(false);
        }
    }

    public void whatInCupboard(Cupboard cupboard){
        if (!cupboard.getdorOpen()){
            System.out.println(this.name + " пытается посмотреть, что в шкафу, но ничего не видно. Дверь шкафа закрыта!");
        }
        else{
            System.out.println("Вот, что есть сейчас в шкакфу: ");
            for (String item : cupboard.getCupboardItems()) {
                System.out.println("- " + item);
            }
        }
    }
}
