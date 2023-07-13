package com.canddella.utility;

import com.canddella.entity.PlatinumCurrentAccount;
import com.canddella.entity.PlatinumSavingsAccount;

public class Utility {

	public static void main(String[] args) {
		
		PlatinumCurrentAccount pca = new PlatinumCurrentAccount("AC12","5738");
		PlatinumSavingsAccount psa= new PlatinumSavingsAccount("AC13","5%");
		
		psa.getDiscount();
		psa.getCard();
		pca.getDiscount();
		pca.getCard();
		

		

	

	}

}
