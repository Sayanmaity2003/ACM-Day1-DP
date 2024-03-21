import java.util.*;
public class prob4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i=0; i<testCase; i++){
        int n = sc.nextInt();
        String a = sc.next();
        int ans = result(a);
        System.out.println(ans);
        }
    }
    public static int result(String a){
        int count = 0;
        for(int i=1; i<a.length()-1; i++){
            if((a.charAt(i)=='i' && a.charAt(i-1)=='p' && a.charAt(i+1)=='e') || (a.charAt(i)=='a' && a.charAt(i-1)=='m' && a.charAt(i+1)=='p')){
                count++;
                i+=2;
            }
        }
        return count;
    }       
}