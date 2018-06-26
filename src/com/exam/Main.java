package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	



public class Main {
	List<Menu> menus = new ArrayList<>();
	public Main(){
		readMenus();
		for(Menu m : menus){
			System.out.println(m.getId()+"."+m.getName());
			
		}
		for(Menu m : menus){
			
		
		System.out.println("8.結算");
		Scanner scanner = new Scanner(System.in);		
		System.out.println("請輸入餐點編號:");
		int id =scanner.nextInt();
		System.out.println("請輸入數量:");
		int n = scanner.nextInt();
		System.out.println("目前餐點");
		System.out.println(n+"份"+ m.getName());
		
		
		
		
		
		
		
			System.out.println((n*m.getPrice()));
			break;
		}
		
		
	}
		
	
	



	public void readMenus(){
		
	
		try {
			BufferedReader in = new BufferedReader(new FileReader("menu.txt"));
			String line = in.readLine();
			while(line!=null){
				String[] tokens =line.split(",");
				int id = Integer.parseInt(tokens[0]);
				String name = tokens[1];
				int price = Integer.parseInt(tokens[2]);
				int cal = Integer.parseInt(tokens[3]);
				Menu m = new Menu(id, name, price, cal);
				menus.add(m);
				line = in.readLine();
			   }	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static void main(String[] args) {
			new Main();
		
		}
	}

	

	
			



			
			
			
				
			

	
