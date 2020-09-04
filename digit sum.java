import java.util.*; 
  
public class Main{ 
      
    static int fun(int n) 
    { 
        int sum = 0; 
          while (n > 0 || sum>9)  
        { 
            if (n==0) { 
                n=sum; 
                sum=0; 
            } 
            sum+=n%10; 
            n/=10; 
        } 
        return sum; 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fun(n)); 
    } 
} 