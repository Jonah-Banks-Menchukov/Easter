// Jonah Banks
// This will calculate Easter based on a given year after 1500
public class Easter{
    public static void main (String[] args){
       int y=2026;
       int a= y%19;
       int b=y/100;
       int c=y%100;
       int d=b/4;
       int e=b%4;
       int f=(b+8)/25;
       int g=(b-f+1)/3;
       int h=(19*a+b
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
       System.out.println(f);
       System.out.println(g);
    }
}
