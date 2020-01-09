package com.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashmap {

	public static void main(String[] args) {
   HashMap<String,String> hm=new  HashMap<>();
   hm.put("a", "mangesh");
   hm.put("b", "sachin");
   hm.put("c", "dhoni");
   System.out.println(hm);
   //1Iterate through a HashMap EntrySet using Iterator
   Iterator<Map.Entry<String, String>> entrySet = hm.entrySet().iterator();
   
   while (entrySet.hasNext())
   {
       Map.Entry<String, String> entry = entrySet.next();
       
       System.out.println("Key : "+entry.getKey()+"   Value : "+entry.getValue());
   }
   
   //2.Iterate through HashMap KeySet using Iterator
   System.out.println("2. using keyset");
   Iterator keySetIterator = hm.keySet().iterator();
   
   while (keySetIterator.hasNext())
   {
       String key = keySetIterator.next().toString();
       
       System.out.println("Key : "+key+"   Value : "+hm.get(key));
   }
   //3.Iterate HashMap using For-each Loop
   System.out.println("3. Iterate HashMap using For-each Loop");
   Set<Map.Entry<String, String>> entrys = hm.entrySet();
   
   for(Map.Entry<String, String> entry : entrys)
   {
       System.out.println("Key : "+entry.getKey()+"   Value : "+entry.getValue());
   }
   //4.4. Iterate a HashMap using For-each Loop [KeySet]
   System.out.println("4. Iterate a HashMap using For-each Loop [KeySet]");
   Set<String> keySet = hm.keySet();
   
   for(String key : keySet)
   {
       System.out.println("Key : "+key+"   Value : "+hm.get(key));
   }
   //5. 5. Iterating through a HashMap using Lambda Expressions
   System.out.println(" 5. Iterating through a HashMap using Lambda Expressions");
   hm.forEach((k,v) -> {System.out.println("Key : "+k+"   Value : "+v);});
   //6.
   //7.
   //8.
}

}
