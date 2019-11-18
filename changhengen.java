package 歌;

//import java.util.Arrays;
import java.util.Scanner;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeMap;
public class changhengen {

public static void main(String[] args) {
String str = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在"
  + "深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚"
  + "生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶"
  + "起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵"
  + "春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游"
  + "夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉"
  + "楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父"
  + "母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌"
  + "慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣"
  + "曲九重城阙烟尘生千乘万骑西南行<未完，待续>";
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
     System.out.println("。");
}
}
catch (ArrayIndexOutOfBoundsException i) {
 System.out.print("……");
}
catch(Exception e) {
  System.err.println("发生异常."+e.toString());
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
   System.out.println(s+"出现的次数为"+count+"次");
 }
}