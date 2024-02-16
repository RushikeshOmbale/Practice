package com.codingpractice.in;

public class MovieBook extends Thread{
      static BookTheaterSeat b;
      int seats;
      public void run()
      {
    	  b.bookSeat(seats);
      }
      
      public static void main(String[] args) {
    	  b=new BookTheaterSeat(); 
    	  MovieBook m = new MovieBook();
    	  m.seats=7;
    	  m.start();
    	  
    	  MovieBook k = new MovieBook();
    	  k.seats=6;
    	  k.start();
    	  
    	  
    	 
	}
}
