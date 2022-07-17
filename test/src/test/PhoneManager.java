package test;

import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Phone phone[]=new Phone[100];
		System.out.print("인원수>>");
		int x=scan.nextInt();
		for(int i=0;i<x;i++)
		{
			String a,b;
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			a=scan.next();
			b=scan.next();
			phone[i]=new Phone(a,b);
		}
		System.out.println("저장되었습니다...");
		while(true)
		{
			String y;
			System.out.print("검색할 이름>>");
			y=scan.next();
			int num=0;
			if(y.equals("exit"))
			{
				System.out.print("프로그램을 종료합니다...");
				break;
			}
			else
			{
				for(int i=0;i<x;i++)
				{
					if(y.equals(phone[i].name))
					{
						System.out.println(y+"의 번호는 "+phone[i].tel+"입니다.");
						num++;
						break;
					}
				}
				if(num==0)
				{
					System.out.println(y+"이 없습니다.");
				}
				
			}
		}
		
		
	}

}
