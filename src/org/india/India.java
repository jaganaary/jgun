package org.india;

import org.tamilnadu.TamilNadu;

public class India extends TamilNadu {
	public void india() {
		System.out.println("India is a beautiful country");

	}
	//Multilevel Inheritance
	public static void main(String[] args) {
		India i=new India();
		i.tamilNadu();
		i.india();
		i.malayalam();
		i.telugu();
	}

}
