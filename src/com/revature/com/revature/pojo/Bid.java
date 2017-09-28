package com.revature.com.revature.pojo;

public class Bid {
    Bidder submitter;
    int amount;
    String timestamp;

    public Bid(){}

    public Bid(Bidder submitter, int amount, String timestamp) {
        this.submitter = submitter;
        this.amount = amount;
        this.timestamp = timestamp;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "submitter=" + submitter +
                ", amount=" + amount +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

}
