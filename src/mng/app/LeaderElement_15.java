package mng.app;

import java.util.Arrays;
import java.util.Scanner;

public class LeaderElement_15 {
	static void findLeader(int arr[], int n)  
	{  
	    int maxCount = 0;  
	    int index = -1; // sentinels  
	    for(int i = 0; i < n; i++)  
	    {  
	        int count = 0;  
	        for(int j = 0; j < n; j++)  
	        {  
	            if(arr[i] == arr[j])  
	            count++;  
	        }  
	        if(count > maxCount)  
	        {  
	            maxCount = count;  
	            index = i;  
	        }  
	    }  
	    if (maxCount >= n/2)  
	    System.out.println ("Leader Element is:"+arr[index]);  
	    else
	    System.out.println ("No Leader Element");  
	}  
	    public static void main (String[] args) { 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the length of array:");
	  int n=sc.nextInt();
	  int[] arr=new int[n];
	  System.out.println("Enter the element for array:");
	  for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
	  }
	  System.out.println(Arrays.toString(arr));
	    findLeader(arr, n);  
	    } 
	}

