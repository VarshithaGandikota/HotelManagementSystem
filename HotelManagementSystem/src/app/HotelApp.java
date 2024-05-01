package app;

import java.util.Scanner;

import service.Hotelservice;
import serviceimple.Hotelserviceimple;

public class HotelApp {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		Hotelservice h1=new Hotelserviceimple();
		System.out.println("====WELCOME TO HOTEL MANAGEMENT SYSTEM====");
		while(true) {
			System.out.println("============MENU===========");
			System.out.println("1.roomInfo\n2.Available Rooms\n3.allocate\n4.Chechout\n5.info\n6.fillallCustomers\n7.exit");
			int op=ip.nextInt();
			switch(op) {
			case 1:
				h1.roomInfo();
				break;
			case 2:
				h1.availableRoom();
				break;
			case 3:
				h1.allocate();
				break;
			case 4:
				h1.checkout();
				break;
			case 5:
				h1.info();
				break;
			case 6:
				h1.findallCustomers();
				break;
			case 7:
				System.out.println("THANK YOU VISIT AGAIN");
				
			}


		}

	}
}
