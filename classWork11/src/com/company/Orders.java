package com.company;

import java.util.ArrayList;

public class Orders {
    private ArrayList<Zakaz>orders;
    private String name;
    private int iD = 1;

    public Orders(Zakaz...orders) {
        this.orders = new ArrayList<>();
        for (Zakaz order:orders) {
            this.orders.add(order);
            order.setId(this.iD++);
        }

    }

    @Override
    public String toString() {
        return "Orders{" +
                "orders=" + orders +
                '}';
    }

    public ArrayList<Zakaz> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Zakaz> orders) {
        this.orders = orders;
    }
    public void addZakaz(Zakaz zakaz){
        orders.add(zakaz);
        zakaz.setId(this.iD++);

    }
   /* public boolean searchOrder(String name){
        int arrayLength = orders.size();
        for (int i = 0; i < arrayLength; i++) {
            if(orders.{
                return true;
            }
        }
        return false;
    }*/
}
