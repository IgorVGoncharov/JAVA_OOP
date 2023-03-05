package GeoTree;

public class Person {
    private String fullName;
    private Male male;
    private Integer birthYear;//


    public Person(String fullName, Male male, Integer birthYear) {
        this.fullName = fullName;
        this.male = male;
        this.birthYear = birthYear;
    }

    public Person(String fullName, Male male) {
        this.fullName = fullName;
        this.male = male;
    }

    public Person (String fullName, Integer birthYear){
        this.fullName = fullName;
        this.birthYear = birthYear;
    }


    public Person (String fullName){
        this.fullName = fullName;
    }
    
    public String getFullName() {
        return fullName;
    }


    public Male getMale() {
        return male;
    }
    
    public Integer getbirthYear() {
        return birthYear;
    }

}

