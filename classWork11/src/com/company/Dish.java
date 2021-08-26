package com.company;


import java.util.ArrayList;

public class Dish {
    private String title;
    private ArrayList<Ingridient> ingridients;
    private String shortDescription;
    private int calorieContent;
    private int time;

    @Override
    public String toString() {
        return "Dish: " +
                "title='" + title + '\'' +
                ", ingridients=" + ingridients +
                ", shortDescription='" + shortDescription + '\'' +
                ", calorieContent=" + calorieContent +
                ", time=" + time +
                '\n';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(ArrayList<Ingridient> ingridients) {
        this.ingridients = ingridients;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(int calorieContent) {
        this.calorieContent = calorieContent;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Dish(String title, String shortDescription, int calorieContent, int time,
                Ingridient... ingridients) {

        this.title = title;
        this.ingridients = new ArrayList<>();
        for (Ingridient ingridient : ingridients) {

            this.ingridients.add(ingridient);
        }
        this.shortDescription = shortDescription;
        this.calorieContent = calorieContent;
        this.time = time;
    }
}