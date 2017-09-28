package com.revature.com.revature.pojo;

public class Bidder {
    private String name;
    private int maxBid;
    private int startingBid;
    private int currentBid;
    private int increment;

    public Bidder() {
    }

    public Bidder(String name, int maxBid, int startingBid, int increment) {
        this.name = name;
        this.maxBid = maxBid;
        this.startingBid = startingBid;
        this.currentBid = currentBid;
        this.increment = increment;
    }

    public int getMaxBid() {
        return maxBid;
    }

    public int getStartingBid() {
        return startingBid;
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

    public void setStartingBid(int startingBid) {
        this.startingBid = startingBid;
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
        return "User{" +
                "maxBid=" + maxBid +
                ", startingBid=" + startingBid +
                ", currentBid=" + currentBid +
                ", increment=" + increment +
                '}';
    }

}
