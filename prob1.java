import java.util.*;
public class prob1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t>0){
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            int ans = a;
            int r = b%3;
            if(r==0){
                ans += b/3;
                if(c%3==0){
                    ans += c/3;
                }else{
                    ans += c/3+1;
                }
                    System.out.println(ans);
            }else if(c>=3-r){
                b += 3-r;
                c -= 3-r;
                ans += b/3;
                if(c%3==0){
                    ans += c/3;
                }else{
                    ans+= (c/3)+1;
                    }
                    System.out.println(ans);
            }else{
                System.out.println(-1);
            }
            t--;
        }

    }
}