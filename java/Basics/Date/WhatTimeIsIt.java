import java.time.LocalTime;

public class WhatTimeIsIt{
	public static void main(String[] args){
		LocalTime myObj = LocalTime.now();
		System.out.println("Now it's exactly " + myObj);
	}
}