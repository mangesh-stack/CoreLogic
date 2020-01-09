package com.app;

import java.util.HashMap;
import java.util.Map;

public class IsPrimeNot {

	public static void main(String[] args) {
    
	/*Map<String,Integer> map=new HashMap<>(); 
   map.put("a", 1);
   map.put("b", 2);
   map.put("c", 3);
   System.out.println(map);
   for(Map.Entry<String,Integer> m:map) {
	   
   }
   */
for(int i=1;i<=4;i++) {
	for(int j=1;j<=7;j++) {
		if(j>=5-i && j<=3+i)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
		
		
}
}