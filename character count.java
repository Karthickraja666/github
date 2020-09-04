import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	String string = sc.next();
    int count=0;
    for(int i=0;i<string.length();i++) {
    if(string.charAt(i)!=' ')
    {
        count+=1;
        
    }
    
}    System.out.println("Number of Characters : "+count);

}
}
