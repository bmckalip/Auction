package com.revature.com.revature.pojo;

import java.util.List;

public class Auction {
    private List<Bidder> bidders;
    private List<Bid> bids;
    private Bidder winner;
    private int currentBid;

    public Auction() {}

    public Bidder getWinner() { return winner; }

    public void addBidder(Bidder bidder){
        bidders.add(bidder);
    }

    public void addBid(Bid bid){
        bids.add(bid);
    }

    public void run(){
        while(winner == null){ bid(); }
    }

    private void bid(){
        for(Bidder bidder : bidders){

        }
    }
}