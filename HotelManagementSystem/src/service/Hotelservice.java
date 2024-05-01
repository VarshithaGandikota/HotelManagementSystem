package service;

import dao.HotelRepo;

public interface Hotelservice {
	
	void roomInfo();
	
//	void classicRooms();
//	
//	void standardRooms();
//	
//	void deluxRooms();
	

	
	void availableRoom();
	
	void allocate();
	
	void checkout();//deallocateRoom()
	
	void info();
	
	void findallCustomers();
}
