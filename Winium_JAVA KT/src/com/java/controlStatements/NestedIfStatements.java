package com.java.controlStatements;

public class NestedIfStatements {

	public static void main(String[] args) {
		 int a=10;
         int b=10;
       
       if(a==10){
 
           if(b>=5){
        	   
        	   if(a==b) {
               System.out.println("Flow is correct!!");
           }
           
           else{
               System.out.println("Flow is not correct!!");
           }
       }
   }
 }
}