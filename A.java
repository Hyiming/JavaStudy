import java.util.Scanner;

public class A{
	 public static void main(String args[]){
	  int number = (int)(Math.random()*100+1);
	  int count = 0;
	  int a = 0;
	  System.out.println("���Ѿ������һ��һ��һ�ٵ�����");
	  do{
		System.out.print("������1��100֮�������");
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		count ++;
		if(a>number){
		System.out.println("��µ������ˡ�");}
		else if(a<number){
		System.out.println("��µ���С�ˡ�");
		}
	  }while(a!=number);
	  System.out.println("̫���ˣ�������"+count+"�ξͲµ��˴𰸡�");
		}
	}
