package assignment5;
public class Length_of_array {
	    public static void main(String args[]){
	        int arr[]={12,2,4,5,6,8,10};
	        int array_count[]={1,1,1,1,1,1,1};
	        for(int i=0;i<6;i++)
	        {
	            for(int j=i;j<6;j++)
	            {if(arr[j]<arr[j+1])
	                array_count[i]=array_count[i]+1;
	            else
	                break;
	            }
	        }
	        int max=array_count[0];
	        for(int i=0;i<7;i++)
	            if(array_count[i]>max)
	              max=array_count[i];
	        System.out.println("Longest Subarray's length is "+max);
	  }
}
