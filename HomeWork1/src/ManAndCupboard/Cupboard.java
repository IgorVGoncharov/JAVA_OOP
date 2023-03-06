package ManAndCupboard;

import java.util.ArrayList;

import GeoTree.Male;

public class Cupboard {
    private String color;
    private Boolean dorOpen; // если true - то дверь открыта
    private ArrayList<String> cupboardItems = new ArrayList<>();

    public Cupboard(String color, Boolean dorOpen) {
        this.color = color;
        this.dorOpen = dorOpen;
    }

    public Cupboard(Boolean dorOpen) {
        this.dorOpen = dorOpen;
    }

    public Cupboard(String color) {
        this.color = color;
        this.dorOpen = false;
    }

    public String getColor() {
        return color;
    }

    public Boolean getdorOpen() {
        return dorOpen;
    }

    public Boolean setdorOpen(Boolean openClose) {
        return this.dorOpen = openClose;
    }

    public ArrayList<String> getCupboardItems() {
        return cupboardItems;
    }

    public void addItem(String item, Man man) {
        if (!this.dorOpen) {
            System.out.println(man.getName() + " пытается положить вещь в шкаф, но дверца шкафа закрыта!");
        } else {
            if (man.getMale() == Male.male) {
                System.out.println(man.getName() + " положил в шкаф следующую вещь: " + item);
            } else {
                System.out.println(man.getName() + " положила в шкаф следующую вещь: " + item);
            }
            cupboardItems.add(item);
        }
    }

    public void removeItem(String item, Man man) {
        if (!this.dorOpen) {
            System.out.println(man.getName() + " пытается достать что-то из закрытого шкафа, ха ха!");
        } else {
            if (cupboardItems.contains(item)) {
                cupboardItems.remove(item);
                if (man.getMale() == Male.male) {
                    System.out.println(man.getName() + " достал из шкафа следующую вещь: " + item);
                } else {
                    System.out.println(man.getName() + " достала из шкафа следующую вещь: " + item);
                }
            } else {
                System.out.println(man.getName() + " пытается достать " + item + ". Но такой вещи просто нет!");
            }
        }
    }
}