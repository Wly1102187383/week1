package week1;

import java.util.Scanner;

public class x {
	public static void main(String args[]) {
		float dollar;
		int number;
		float decimals;
		float onedollar;
		float twodollar;
		float fiftycent;
		float twentycent;
		float tencent;
		float fivecent;
		int one=0,two=0;
		int number1=0,number2=0,number3 = 0,number4 = 0;
		float decimals1 = 0,decimals2 = 0,decimals3=0,decimals4=0;
		
		
		onedollar = 1.0f;
		twodollar = 2.0f;
		fiftycent = 0.5f;
		twentycent = 0.2f;
		tencent = 0.1f;
		fivecent = 0.05f;
				
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ԫ��");
		dollar = scan.nextFloat();
		decimals = dollar % onedollar;
		number = (int) (dollar / onedollar);
		if(fiftycent<decimals)
		{
			number1 = (int) (decimals / fiftycent);
			decimals1 = decimals % fiftycent;
		}
		if(twentycent<decimals1)
		{
			number2 = (int) (decimals1 / twentycent);
			decimals2 = decimals1 % twentycent;
		}
		if(tencent <decimals2)
		{
			number3 = (int) (decimals2 / tencent);
			decimals3 =(int) (decimals2 % tencent);
		}
		if(fivecent < decimals3)
		{
			number4 =(int) (decimals3 / fivecent);
			decimals4 = (int) (decimals3 % fivecent)
		}
		System.out.println(number + "��һ��Ԫ");
		System.out.println(number1 + "����ʮ����");
		System.out.println(number2 + "����ʮ����");
		System.out.println(number3 + "��ʮ����");
		System.out.println(number4 + "��������");
		if(dollar>twodollar)
		{
		two = (int) (dollar /twodollar);
		}
		if(dollar>onedollar)
		{
		one = (int) (dollar/onedollar);
		}
		if(fivecent < decimals3)
		{
		System.out.println("�޸�Ϊ"+ two + "������Ԫ");
		System.out.println("�޸�Ϊ"+ one + "��һ��Ԫ");
	}
}
