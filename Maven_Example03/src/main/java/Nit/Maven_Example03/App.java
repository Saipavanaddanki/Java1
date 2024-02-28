package Nit.Maven_Example03;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int k=50;
        int l=60;
       App. mul(k,l);
       App.sub(k, l);
       App.add(k, l);
       
    }
    public static void mul(int k,int l){
    	System.out.println(k*l);
    }
    public static void  sub(int k,int l) {
    	System.out.println(k-l);
    }
   public static void add(int k,int l) {
	   
	  System.out.println(k+l);
   }
	
}
