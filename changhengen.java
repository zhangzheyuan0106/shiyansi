package ��;

//import java.util.Arrays;
import java.util.Scanner;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeMap;
public class changhengen {

public static void main(String[] args) {
String str = "������ɫ˼�����������󲻵������Ů����������"
  + "�����δʶ��������������һ��ѡ�ھ��������һЦ����"
  + "��������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���"
  + "������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ���"
  + "��������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���"
  + "ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��"
  + "¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�"
  + "ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���"
  + "������˿���վ�������������ܱ�Ķ�����������������"
  + "�����س����̳���ǧ������������<δ�꣬����>";
 char ss[] = str.toCharArray();
 int count = ss.length/7;
 char[] chs=str.toCharArray();
try {
 for (int i=0; i<count+1; i++) {
    System.out.print(chs[(i*7)]);
    System.out.print(chs[(i*7)+1]);
    System.out.print(chs[(i*7)+2]);
    System.out.print(chs[(i*7)+3]);
    System.out.print(chs[(i*7)+4]);
    System.out.print(chs[(i*7)+5]);
    System.out.print(chs[(i*7)+6]);
if (i % 2 == 0 )
     System.out.print(",");
 else
     System.out.println("��");
}
}
catch (ArrayIndexOutOfBoundsException i) {
 System.out.print("����");
}
catch(Exception e) {
  System.err.println("�����쳣."+e.toString());
}
Scanner scan=new Scanner(System.in);
String b=scan.next();
      countString(str,b);
     }
//Scanner input=new Scanner(System.in);
//String str=input.next();

private static void countString(String str,String s) {
   int length=str.length();
   int count = 0;
   int k = 0;
   for(int i= 0; i<=length; i++){
       if(str.indexOf(s) == (i-k)){
           str = str.substring(i-k+1,str.length());
           count++;
           k = i+1;
       }
   }
   System.out.println(s+"���ֵĴ���Ϊ"+count+"��");
 }
}