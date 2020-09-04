import java.util.*; 
  
public class Main{ 
      

    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {   int arr[]=new int[5];
            int rrr[]=new int[5];
            System.out.println("Enter the "+i+" student Quarterly marks");
            for(int j=0;j<5;j++)
            {
                arr[j]=sc.nextInt();
            }
            System.out.println("Enter the "+i+" student Half yearly marks");
            for(int j=0;j<5;j++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Average of "+i+" student marks");
            System.out.println("English - "+(arr[0]+rrr[0])/2);
            System.out.println("Tamil - "+(arr[1]+rrr[1])/2);           
            System.out.println("Maths - "+(arr[2]+rrr[2])/2);
            System.out.println("Science - "+(arr[3]+rrr[3])/2);
            System.out.println("Social Science - "+(arr[4]+rrr[4])/2);



        }
        
    } 
} 