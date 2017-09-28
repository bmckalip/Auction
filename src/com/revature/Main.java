package com.revature;

import com.revature.com.revature.pojo.Auction;
import com.revature.com.revature.pojo.Bidder;

public class Main {

    public static void main(String[] args) {
	    Auction a = new Auction();
	    //add users
        a.addBidder(new Bidder("Steve", 150, 30, 5));
        a.addBidder(new Bidder("Joe", 200, 10, 2));
        a.addBidder(new Bidder("Paul", 100, 50, 1));
	    a.run();
        System.out.println(a.getWinner().getName() + " has won the auction");

    }
}
