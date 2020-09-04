import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int temp=0;
    System.out.println("Before Swaping\n x="+x+"\n y="+y);
    temp=y;
    y=x;
    x=temp;
    System.out.println("After Swaping\n x="+x+"\n y="+y);
    
}
}
