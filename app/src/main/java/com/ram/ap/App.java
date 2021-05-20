package com.ram.ap;

import utils.Utils;

public class App {

	public static void main(String[] args) {
		
		String encode=Utils.encoder("Ramanji");
		System.out.println(encode);
		byte[] decode=Utils.decoder(encode);
		System.out.println(decode.toString());

	}

}
