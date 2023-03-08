package HomeWork1.GeoTree.HomeWork2.ManAndAnimals;

public abstract class Animals {
    private String name;
    private Integer age;
    private String color;
    
    public Animals(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Animals(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void reactionForCall(Man man);
    abstract void wantToEat();




}
