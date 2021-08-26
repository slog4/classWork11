package com.company;

import java.util.ArrayList;

public class Orders {
    private ArrayList<Zakaz>orders;
    private int iD=0;

    public Orders(Zakaz...orders) {
        this.orders = new ArrayList<>();
        for (Zakaz order:orders) {
            this.orders.add(order);
            order.setId(this.iD++);
        }

    }

    @Override
    public String toString() {
        return "Orders{" +" iD "+iD+"\n"+
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
        this.iD++;
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
