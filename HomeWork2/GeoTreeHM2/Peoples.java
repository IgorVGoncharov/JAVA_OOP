package HomeWork1.GeoTree.HomeWork2.GeoTreeHM2;

public abstract class Peoples {
    private String fullName;
    private Sex sex;
    private Integer birthYear;
    
    public Peoples(String fullName, Integer birthYear, Sex sex) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.sex = sex;
    }

    public Peoples(String fullName, Integer birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public Peoples(String fullName, Sex sex) {
        this.fullName = fullName;
        this.sex = sex;
    }

    public Peoples(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
