package Pattttttern;

public class Charpattern {
     public static void main(String[] args) {
		char num='A';
		int space=1;
		for(int i=1;i<=6;i++){
			for(char ch='F';ch>=num;ch--){
				System.out.print(ch+" ");}{
					for(int m=1;m<space;m++){
						System.out.print(" ");
					}
					num++;
					space++;
					System.out.println();
			}
		}
		char Num='E';
		int Space=4;
		for(int i=1;i<=5;i++)
		{
			for(char j='F';j>=Num;j--)
			{
				System.out.print(j+" ");
				}
			{
					for(int m=1;m<=Space;m++)
					{
						System.out.print(" ");
					}
					Num--;
					Space--;
					System.out.println();
			}
		
		
	
}}}
