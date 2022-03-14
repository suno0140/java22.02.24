package chap06.book.exercis.p18;

import chap06.book.exercis.p18.ShopService;

public class ShopService {
	
	private static ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return shopService;
	}

}
