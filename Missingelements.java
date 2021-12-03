package week1.day1;

import java.util.Arrays;

public class Missingelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr = {0,1,2,3,4,7,6,8};
      Arrays.sort(arr);
      
      
      for (int i = 0 ; i <= arr.length-1 ; i++)
      {
    	 if (i != arr[i])
    	  System.out.println(arr[i]);
    	  
    	  
    	    
      } 
      
      
	   }

}
