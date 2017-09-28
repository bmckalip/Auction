package com.revature.com.revature.pojo;

public class Bid {
    Bidder submitter;
    int amount;

    public Bid(){}

    public Bid(Bidder submitter, int amount) {
        this.submitter = submitter;
        this.amount = amount;
    }

    public Bidder getSubmitter() {
        return submitter;
    }

    public void setSubmitter(Bidder submitter) {
        this.submitter = submitter;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "submitter=" + submitter +
                ", amount=" + amount +
                '}';
    }

}
