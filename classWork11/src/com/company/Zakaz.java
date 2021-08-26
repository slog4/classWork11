package com.company;

import java.util.ArrayList;



    public class Zakaz {
        private int id;
        private int time;
        private ArrayList<Dish> dishes;
        private boolean closed;

        @Override
        public String toString() {
            return "Zakaz{" +
                    "id=" + id +
                    ", time=" + time +
                    ", dishes=" + dishes +
                    ", closed=" + closed +
                    '}';
        }

        public void setId(int id) {
            this.id = id;
        }

        public Zakaz(Dish... dishes) {
            this.id++;


            this.dishes = new ArrayList<>();
            for (Dish dish : dishes) {

                this.dishes.add(dish);
            }
            for (int i = 0; i < dishes.length; i++) {
                this.time += dishes[i].getTime();
            }
            this.closed = false;

        }
    }


