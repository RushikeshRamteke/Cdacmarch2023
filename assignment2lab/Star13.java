class Star13{
public static void main(String args[]){
for(int i=1;i<=5;i++)
{ for(int m=2;m<=i;m++)
  {
    System.out.print(" ");
  } 	
  for(int j=5;j>=i;j--)
  { 
    System.out.print("*"); 
	}
	System.out.println();
	}
	for(int k=1;k<=5;k++)
	{  for(int m=4;m>=k;m--)
      {
    System.out.print(" ");
      } 
	  for(int l=1;l<=k;l++)
	  {
	    System.out.print("*");
		}
		System.out.println();
		}
		}
}