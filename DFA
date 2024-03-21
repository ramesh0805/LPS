import java.util.Scanner;
public class DFA {
 public static void main(String[] args) {
   int q=0;
   int pre_q;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the String:");
      String str = sc.next();
   //String str = "ababcc";
   for(int i=0;i<str.length();i++) {
   if(str.charAt(i)!='a' && str.charAt(i)!='b' && str.charAt(i)!='c') {
   System.out.println("Given string is not valid");
   return;
   }
   pre_q = q;
   switch(q) {
   case 0:
    q=(str.charAt(i)=='a') ? 1:0;
    break;
   case 1:
    q=(str.charAt(i)=='b') ? 2:(str.charAt(i)=='a') ? 1:0;
    break;
   case 2:
    q=(str.charAt(i)=='c') ? 3:(str.charAt(i)=='a') ? 1:0;
    break;
   case 3:
    q=(str.charAt(i)=='a') ? 1:0;
    break;
   }
   }
   if(q==3)
    System.out.println("ACCEPTED");
   else 
    System.out.println("NOT ACCEPTED");
 }
}
