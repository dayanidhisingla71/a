package assignment5;
public class Overloading {
	    static void print(){
	        System.out.println("Overload");
	    }
	    static void print(int a){
	               System.out.println("Overload"+a);
	    }
	    static void print(float a){
	               System.out.println("Overload"+a);
	    }
	    public static void main(String args[]){
	        int a=1;
	        float b=1F;
	        Overloading.print();
	        Overloading.print(b);
	        Overloading.print(a);
	    }
	}

