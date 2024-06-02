package controller;

public class Counter {
    static private int count = 0;

    public void increaseCounter(){
        count++;
    }
    public void reduceСounter(){
        count--;
    }
    public int getCount() {
        return count;
    }
}
