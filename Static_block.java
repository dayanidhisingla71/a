package assignment5;
public class Static_block { 
		   int rollno;  
		   String name;  
		   static String college ="ITS";  
		     
		   Static_block(int r,String n){  
		   rollno = r;  
		   name = n;  
		   }  
		 void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		 public static void main(String args[]){  
			 Static_block s1 = new Static_block(111,"Karan");  
			 Static_block s2 = new Static_block(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();  
		 }  
		}  

