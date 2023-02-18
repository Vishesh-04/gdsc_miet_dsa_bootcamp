import java.util.*;
class find_1st_last_element{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int n = sc.nextInt();
        int A[]=new int [n];
        System.out.println("Enter Elements of the Array");
        for(int i =0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter target no.");
        int t = sc.nextInt();
        int s=-1,l=-1;
        for(int i =0;i<n;i++){
            if(A[i]==t)
            {
                if(s==-1)
                s = i;
                else 
                l=i;
            }
        }
        System.out.println("First Index of "+t+ " = "+s);
        System.out.println("Last Index of "+t+ " = "+l);
    }
}