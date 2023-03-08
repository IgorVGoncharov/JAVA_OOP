package HomeWork1.GeoTree.HomeWork2.ManAndAnimals;

import java.util.Random;

public class Man {
    private String fullName;
    private Integer age;

    public Man(String fullName, Integer age){
        this.fullName = fullName;
        this.age = age;
    }
    
    public Man(String fullName) {
        this.fullName = fullName;
    }

    public Random random = new Random();
    
    public Integer getAge(){
        return age;
    }
    
    public void setAge(Integer age){
        this.age = age;
    }

    public String getFullName(){
        return fullName;
    }

    public void callingForCat(Cat cat){
        System.out.println(this.getFullName() + " зовет кота. " + cat.getName() + " кис кис...");
    }

    public void callingForGDog(Dog dog){
        System.out.println(this.getFullName() + " зовет собаку. " + dog.getName() + "!");
    }

    public void takeEat(Animals animal){
        System.out.println(this.getFullName() + " накладывает корм. " + animal.getName() + " с удовольсвтием ест");
    }

    public void playingWithDog(Dog dog){
        System.out.println(this.getFullName() + " гуляет с собакой и бросает ей палку.");
    }
}
