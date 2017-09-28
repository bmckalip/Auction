package com.revature.com.revature.pojo;

import java.util.ArrayList;
import java.util.List;

public class Auction {
    private List<Bidder> bidders = new ArrayList<Bidder>();
    private List<Bid> bids = new ArrayList<Bid>();
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
        int biddersPerRound = 0;
        for(Bidder bidder : bidders){
            if(currentBid <= bidder.getMaxBid()){
                biddersPerRound++;
                while(bidder.getCurrentBid() <= currentBid){
                    int bidAmt = bidder.getCurrentBid() + bidder.getIncrement();
                    bidder.setCurrentBid(bidAmt);
                    bids.add(new Bid(bidder, bidAmt));
                }
            }
        }

        if(biddersPerRound <= 1){
            winner = bids.get(bids.size() - 1).getSubmitter();
        }
    }
}