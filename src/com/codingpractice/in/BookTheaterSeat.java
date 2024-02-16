package com.codingpractice.in;

 public class BookTheaterSeat {
	
	int totalSeats=10;
	synchronized void bookSeat(int seats)
	{
		
		//synchronized(this)
		{
		if(totalSeats>=seats)
		{
			System.out.println(seats+"seats book successfully");
			totalSeats=totalSeats-seats;
			System.out.println("seats left"+totalSeats);
		}
		else
		{
			System.out.println("sorry seats cannot be booked");
			
			System.out.println("seats left"+totalSeats);
			
		}
	}
	}
	

}

