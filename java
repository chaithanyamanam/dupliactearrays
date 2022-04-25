import java.util.*; 
public class duplicate 
{
public static void main(String[] args) 
{
int ar[];
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
n=sc.nextInt();
ar=new int[n];
System.out.println("enter array elements");
for(i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
for (i=0; i<ar.length-1;i++)
{
for (j=i+1;j<ar.length;j++)
{
if ((ar[i] == ar[j]) && (i != j))
{
System.out.println("Duplicate Element : "+ar[j]);
}
}
}
}    
}
