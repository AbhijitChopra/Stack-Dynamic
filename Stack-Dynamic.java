import static java.lang.System.out;
import java.util.Scanner;
class Stack
{
		Scanner scan = new Scanner(System.in);
		int top=-1,i=0;
		int size=1;
		int j,sw;
		int a[]=new int[size];
		int temp[]=new int[size];
		String ch;
		int k,t;
		char c='a';
		void exc()
		{
			for(t=0;t<i;t++)
			{
				temp[t]=a[t];
			}
			a=new int[size];
			for(t=0;t<i;t++)
			{
				
				a[t]=temp[t];
			}
			temp=new int[size];
			
		}
		void Input() 
		{ 
			
			out.print("What do you want to do : \n 1)PUSH \n 2)POP \n 3)VIEW \n ");
			sw=scan.nextInt();
			switch(sw)
			{
				case 1:
				{
					push();
					break;
				}
				case 2:
				{
					pop();
					break;
				}
				case 3:
				{
					display();
					break;
				}
			}
		}
		void push()
		{
			out.println("Enter the Element to be Push in Stack : ");
			a[++top]=scan.nextInt();
			i++;
			size++;
			contii();
		}
		void pop()
		{
			if(top==-1)
			{
				out.println("STACK IS EMPTY");
				contii();
			}
			else
			{
				top--;
				i--;
				size--;
				contii();
			}
		}
		void display()
		{
			if(top==-1)
			{
				out.println("STACK IS EMPTY ");
				contii();
			}
			else
			{
				out.println("The Entered Elements in Stack");
				for(j=i-1;j>=0;j--)
				{
					out.println(""+a[j]);
				}
				contii();
			}
		}
		void contii()
		{
			out.println("Do you want to cotni : ");
			ch=scan.next();
			for(k=0;k<ch.length();k++)
			{
					c=ch.charAt(k);
			}
			if(c=='y')
			{
				exc();
				Input();
			}
			else 
			{
				out.println("BYE");
			}
		}
}
public class Stack-Dynamic
{
	public static void main(String st[])
	{
		Stack s1 = new Stack1();
		s1.Input();
	}
}
