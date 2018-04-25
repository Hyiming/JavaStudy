import java.util.Scanner;

public class A{
	 public static void main(String args[]){
	  int number = (int)(Math.random()*100+1);
	  int count = 0;
	  int a = 0;
	  System.out.println("我已经想好了一个一到一百的数。");
	  do{
		System.out.print("请猜这个1到100之间的数：");
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		count ++;
		if(a>number){
		System.out.println("你猜的数大了。");}
		else if(a<number){
		System.out.println("你猜的数小了。");
		}
	  }while(a!=number);
	  System.out.println("太好了，你用了"+count+"次就猜到了答案。");
		}
	}
