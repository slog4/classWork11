package com.company;

public class Main {

    public static void main(String[] args) {

	Ingridient ingridient1 = new Ingridient("water",1,Units.cup,"..water.");
        Ingridient ingridient2 = new Ingridient("sugar",2,Units.spoon,".sugar..");
        Ingridient ingridient3 = new Ingridient("tea",1,Units.spoon,"..tea.");
        Ingridient ingridient4 = new Ingridient("milk",1,Units.cup,"..milk..");
        Ingridient ingridient5 = new Ingridient("bread",0.1 ,Units.kg,"..bread..");
        Ingridient ingridient6 = new Ingridient("ham",0.15,Units.kg,"ham");
       /* System.out.println(ingridient1);
        System.out.println(ingridient2);
        System.out.println(ingridient3);
        System.out.println(" ");*/
        Dish dish1 = new Dish("tea","ok",100,3, ingridient1, ingridient2, ingridient3);
//        System.out.println(dish1);
        Dish dish2 = new Dish("tea","ok",100,3, ingridient1, ingridient3);
//        System.out.println(dish2);
        Dish sandwich = new Dish("sandwich","ok",200,5,ingridient5,ingridient6,ingridient5);
        Zakaz zakaz1= new Zakaz(dish1,dish2);
//        System.out.println(zakaz1);
//        System.out.println(" ");
        Zakaz zakaz2= new Zakaz(dish2,dish2);
//        System.out.println(zakaz2);
        Zakaz zakaz3 = new Zakaz(dish1,sandwich);
        Orders orders = new Orders(zakaz1,zakaz2);
        System.out.println(orders);
        orders.addZakaz(zakaz3);
        System.out.println(orders);
//        orders.addZakaz(zakaz2);


//        System.out.println(orders.searchOrder("zakaz2"));
    }
}
