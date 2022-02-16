/*
* File: App.java
* Author: Szalai Alexandra
* Copyright: 2022, Szalai Alexandra
* Group: Szoft I N
* Date: 2022-02-16
* Github: https://github.com/szalaialexandra/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class App {
	public static void main (String [] args){
		System.out.println("Szalai Alexandra, 2022_02_16, Szoft I N");
		System.out.println("Feladat 0306");
		System.out.println("Haromszog terulete");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Oldal: ");
		double oldal = sc.nextDouble();
		
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		
		double terulet = oldal * magassag / 2;
		System.out.println("Terulet: " + terulet);
		
	}
}

