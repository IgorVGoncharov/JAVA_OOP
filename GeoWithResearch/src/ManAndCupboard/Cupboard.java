package ManAndCupboard;

public class Cupboard {
    private String color;
    private Boolean openClose;

    public Cupboard(String color, Boolean openClose){
        this.color = color;
        this.openClose = openClose;
    }
    public Cupboard(Boolean openClose){
        this.openClose = openClose;
    }
    public Cupboard(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public Boolean getOpenClose(){
        return openClose;
    }
    
}