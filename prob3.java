import java.util.*;
public class prob3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i=0; i<testCase; i++){
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int j=0; j<n; j++){
            a[j]=sc.nextInt();
        }
        String ans=result(a);
        System.out.println(ans);
        }
    }
    public static String result(int[] a){
        for(int i=1; i<a.length-1; i++){
            if(a[i-1]<=a[i+1] && a[i]>=2*a[i-1]){
                a[i] -= 2*a[i-1];
                a[i+1] -= a[i-1];
                a[i-1] = 0;
            }
        } 
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                return "NO";
            }
        }
        return "YES";
        }       
}