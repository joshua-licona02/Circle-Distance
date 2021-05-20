package cis.vmi.edu;

import java.util.Scanner;
/*
 * Author: Joshua Licona
 * Purpose: Find greatest circle distance
 */

public class circleDistance {

	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter point 1 latitude in degrees: ");
		double latitude1=scanner.nextDouble();
		double lat1=Math.toRadians(latitude1);
		
		System.out.println("Enter point 1 longitude in degrees: ");
		double longitude1=scanner.nextDouble();
		double long1=Math.toRadians(longitude1);
		
		System.out.println("Enter point 2 latitude in degrees: ");
		double latitude2=scanner.nextDouble();
		double lat2=Math.toRadians(latitude2);
		
		System.out.println("Enter point 2 longitude in degrees: ");
		double longitude2=scanner.nextDouble();
		double long2=Math.toRadians(longitude2);
		
		double radius=6371.01;
		
		double answer=radius*Math.acos((Math.sin(lat1)*Math.sin(lat2))+(Math.cos(lat1)*Math.cos(lat2))*Math.cos(long1-long2));
		
		System.out.println("The distance between the two points is "+answer+" km");
		
		
	}
}
