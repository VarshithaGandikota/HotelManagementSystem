package serviceimple;

import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.HotelRepo;
import entity.Customer;
import entity.address;
import service.Hotelservice;

public class Hotelserviceimple implements Hotelservice,HotelRepo{
	Scanner ip=new Scanner(System.in);
	{
		for(int i=0;i<=10;i++) {
			cm.put(i, null);
		}
		for(int i=0;i<=8;i++) {
			sm.put(i,null);
		}
		for(int i=0;i<=5;i++) {
			dm.put(i,null);
		}
	}

	@Override
	public void roomInfo() {
		System.out.println("==========Classic Rooms==========");
		System.out.println("Hot Water:Yes");
		System.out.println("Ac:No");
		System.out.println("TV:No");
		System.out.println("Wifi:No");
		System.out.println("Price:2000 Rs");
		System.out.println("==========Standard Rooms==========");
		System.out.println("Hot Water:Yes");
		System.out.println("Ac:No");
		System.out.println("TV:Yes");
		System.out.println("Wifi:No");
		System.out.println("Price:3500 Rs");
		System.out.println("==========Delux Rooms==========");
		System.out.println("Hot Water:Yes");
		System.out.println("Ac:Yes");
		System.out.println("TV:Yes");
		System.out.println("Wifi:Yes");
		System.out.println("Price:5000 Rs");
	}


	public void checkRooms(LinkedHashMap<Integer,Customer> l1) {
		boolean flag=false;
		for(Integer ele:l1.keySet()) {
			if(l1.get(ele)==null) {
				System.out.println(ele+" ");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("NO ROOMS ARE AVAILABLE");
		}
	}
	
	
	public void availableRoom() {
		System.out.println("===========Available Rooms============");
		System.out.println("===========Classic Rooms=============");
		checkRooms(cm);
		System.out.println("============Standard Rooms=============");
		checkRooms(sm);
		System.out.println("=============Delux Rooms===============");
		checkRooms(dm);
	}
	Customer createCustomer() {
		System.out.println("=======Enter Customer Details=======");
		System.out.println("enter the customer id");
		int cid=ip.nextInt();
		System.out.println("enter the customer name");
		String cname=ip.next();
		System.out.println("enter the customer age");
		int cage=ip.nextInt();
		System.out.println("enter the customer phone");
		long cpho=ip.nextLong();
		System.out.println("enter the customer email");
		String cemail=ip.next();
		System.out.println("enter the door num");
		String cdoor=ip.next();
		System.out.println("enter the customer street");
		String cstrt=ip.next();
		System.out.println("enter the customer dist");
		String cdist=ip.next();
		System.out.println("enter the customer state");
		String cstate=ip.next();
		System.out.println("enter the customer country");
		String ccntry=ip.next();
		System.out.println("enter the pincode");
		int cpin=ip.nextInt();
		address a=new address(cdoor,cstrt,cdist,cstate,ccntry,cpin);
		return new Customer(cid,cname,cage,cpho,cemail,a);
		
	}
	
	
	public void mapRoom(LinkedHashMap<Integer,Customer> l1,int roomNo,double amt) {
		if(l1.get(roomNo)==null) {
			Customer c=createCustomer();
			a1.add(c);
			l1.put(roomNo,c);
			c.setCamt(amt);
			System.out.println("Room No"+roomNo+"had been allocated for "+c.getCname());
			System.out.println("=====================================");
		}
		else {
			System.out.println("Room is not available");
		}
	}
	
	
	
	
	public void allocate() {
		
		System.out.println("1.Classic Rooms\n2.Standard Rooms\n3.Delux Rooms");
		int op=ip.nextInt();
		System.out.println("choose option");
		switch(op) {
		case 1:
			System.out.println("enter the room number");
			int roomNo1=ip.nextInt();
			System.out.println("enter the amount");
			double amt=ip.nextDouble();
			if(roomNo1>=1 && roomNo1<=10) {
				mapRoom(cm,roomNo1,2000);
			}
			else {
				System.out.println("Enter correct room number");
			}
			break;
		case 2:
			System.out.println("enter the room number");
			int roomNo2=ip.nextInt();
			System.out.println("enter the amount");
			double amt2=ip.nextDouble();
			if(roomNo2>=1 && roomNo2<=10) {
				mapRoom(sm,roomNo2,3500);
			}
			else {
				System.out.println("Enter correct room number");
			}
			break;
		case 3:
			System.out.println("enter the room number");
			int roomNo3=ip.nextInt();
			System.out.println("enter the amount");
			double amt3=ip.nextDouble();
			if(roomNo3>=1 && roomNo3<=10) {
				mapRoom(dm,roomNo3,5000);
			}
			else {
				System.out.println("Enter correct room number");
			}
			break;
		}
	}
	
	
	void unmapRoom(LinkedHashMap<Integer,Customer> l1,int roomNo) {
		if(l1.get(roomNo)!=null) {
			Customer c1=l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+" need to pay"+c1.getCamt()+" Rs. ");
			l1.put(roomNo,null);
			
		}
		else {
			System.out.println("INVALID ROOMNO..!!!!!!");
		}
	}
	public void checkout() {
		System.out.println("1.Classic Rooms\n2.Standard Rooms\n3.Delux Rooms");
		int op=ip.nextInt();
		System.out.println("enter the room number");
		int roomno=ip.nextInt();
		System.out.println("choose option");
		switch(op) {
		case 1:
			if(roomno>=1 && roomno<=10) {
				unmapRoom(cm,roomno);
			}
			else {
				System.out.println("Enter correct Room no......");
			}
			break;
		case 2:
			if(roomno>=1 && roomno<=8) {
				unmapRoom(sm,roomno);
			}
			else {
				System.out.println("Enter correct Room no......");
			}
			break;
		case 3:
			if(roomno>=1 && roomno<=3) {
				unmapRoom(dm,roomno);
			}
			else {
				System.out.println("Enter correct Room no......");
			}
			break;
			default:
				System.out.println("INVALID CREDENTIALS");
				break;
			
		}


	
}


	
	public void info() {
		boolean flag=false;
		System.out.println("choose the option");
		int op=ip.nextInt();
		switch(op) {
		case 1:{
			System.out.println("enter the customer id");
			int id=ip.nextInt();
			for(Customer ele:a1) {
				if(ele.getCid()==id) {
					System.out.println(ele);
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("INVALID ID");
			}
			break;
		}
		case 2:{
			System.out.println("enter the phone number");
			long pho=ip.nextLong();
			for(Customer ele:a1) {
				if(ele.getPhone()==pho) {
					System.out.println(ele);
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("INVALID ID");
			}
			break;
		}
		}
		
		
	}


	
	public void findallCustomers() {
		if(a1.size()==0) {
			System.out.println("DataBase is Empty......");
		}
		else {
			for(Customer ele:a1) {
				System.out.println(ele);
			}
		}
	}
}

	

	


