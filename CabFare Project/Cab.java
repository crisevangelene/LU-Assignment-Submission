/*
In this Cab fare calculator, I've taken the charges as listed below:
upto 5km -> Rs.100
for the next 10 km -> Rs.10/km
for the next 15 km -> Rs.8/km
for more than 25 km ->Rs.5/km
*/


import java.lang.*;
import java.util.Scanner;

public class Cab {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int distance,amount=0;
	System.out.print("Enter the Distance you travelled: ");
	distance=sc.nextInt();
	if(distance<=5)
	amount=100;
	else if(distance>5 && distance<=15)
	amount=(distance-5)*10+100;
	else if(distance>15 && distance<=25)
	amount=(distance-15)*8+200;
	else if(distance>25)
	amount=(distance-25)*5+280;
	System.out.println("Here's the Cab Fare for your trip !\n");
	System.out.println("Distance Travelled: "+distance);
	System.out.println("Total Amount: "+amount);
 }

}