package com.revature.com.revature.pojo;

public class Bidder {
    private String name;
    private int maxBid;
    private int currentBid;
    private int increment;

    public Bidder() {}

    public Bidder(String name, int maxBid, int currentBid, int increment) {
        this.name = name;
        this.maxBid = maxBid;
        this.currentBid = currentBid;
        this.increment = increment;
    }

    public int getMaxBid() {
        return maxBid;
    }

    public int getCurrentBid() {
        return currentBid;
    }

    public int getIncrement() {
        return increment;
    }

    public String getName() { return name; }

    public void setMaxBid(int maxBid) {
        this.maxBid = maxBid;
    }

    public void setCurrentBid(int currentBid) {
        this.currentBid = currentBid;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public void setName(String name) { this.name = name; }


    @Override
    public String toString() {
        return "Bidder{" +
                "maxBid=" + maxBid +
                ", currentBid=" + currentBid +
                ", increment=" + increment +
                '}';
    }

}
