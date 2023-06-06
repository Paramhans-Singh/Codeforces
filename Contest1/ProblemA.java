import java.util.Scanner;

public class ProblemA{
public static void main (String[] args){
Scanner s = new Scanner(System.in);
int t = s.nextInt();
while(t-->0){
int n = s.nextInt();
String ans="";
String str=s.next();

char first = str.charAt(0);
ans+=first;


for(int i=1;i+1<n;i++){
  if(str.charAt(i)==first){ 
      i++;
      ans+=str.charAt(i); 
      first=str.charAt(i);
  }  
}
  
System.out.println(ans);
}
}
}
