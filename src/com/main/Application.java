package com.main;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int n1,n2,select,sayi;
		double sonuc;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ilk Sayiyi Giriniz : ");	
		n1 = input.nextInt();
		System.out.println("Ikinci Sayiyi Giriniz");
		n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-Cikarma\n3-Bolme\n4-Carpma");
		System.out.println("Seciminiz : ");
		select = input.nextInt();
		sayi = n1*n2;
		
		switch (select) {
		case 1:
			sonuc = n1+n2;
			System.out.println("sonuc: "+sonuc);
			break;
		case 2:
			sonuc = Math.abs(n1-n2);
			System.out.println("sonuc: "+sonuc);
			break;
		case 3:
			switch (sayi) {
			case 0:
				System.out.println("Sayi Sifira Bolunemez");
				break;
			default:
				sonuc = Math.max(n1, n2)/Math.min(n1, n2);
				System.out.println("sonuc: "+sonuc);				
			}
			break;
		case 4:
			sonuc = n1*n2;
			System.out.println("sonuc: "+sonuc);
			break;
		default:
			System.out.println("Yanlis Secim");
			break;
		}
	}
	
	
}
