package in.ac.sharda;

public class Mainday3 {
	

	public static void main(String[] args) {
       int[] arr= new int[10];
       for(int i=0; i< arr.length; i++) {
    	   System.out.println(arr[i]);
    	   arr[i]=(int) (Math.random()*100);
    	   System.out.println(arr[i]);
   }
}
}
