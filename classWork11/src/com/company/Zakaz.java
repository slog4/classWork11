package com.company;

import java.util.ArrayList;



    public class Zakaz {
        public void setId(int id) {
            this.id = id;
        }

        //        private String name;
        private int id = 0;
        private int time;
        private ArrayList<Dish> dishes;
        private boolean closed;

        @Override
        public String toString() {
            return "\n"+"Zakaz{" + " id "+id+
                    ", time=" + time +
                    ", dishes=" + dishes +
                    ", closed=" + closed +
                    '}';
        }



        public Zakaz(Dish... dishes) {



            this.dishes = new ArrayList<>();
            for (Dish dish : dishes) {

                this.dishes.add(dish);
            }
            for (int i = 0; i < dishes.length; i++) {
                this.time += dishes[i].getTime();
            }
            this.closed = false;
            this.id++;
        }

    }


