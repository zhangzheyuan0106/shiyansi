# shiyansi 大181 2018310989 张柘元
实验名称：字符串实验
一、实验目的:1.掌握字符串String及其方法的使用。
             2.掌握异常处理结构。
二、业务要求：
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.考虑操作中可能出现的异常，在程序中设计异常处理程序
输入：
汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>
输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………
三、实验过程与核心代码
1、使用main方法中的args数组传递，在建立了class changhengen后，直接在public static void main(String[] args)函数中编译代码，目的是加入标点符号“，”和“。”每7个字一个逗号，如果字符数组可以被2整除，那么加句号。其代码如下：
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
2、接下来统计其中的字的个数，代码运行后，输入你想统计的字，返回该字的个数，代码如下，运行结果见附件。
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
3、关于异常处理，代码如下。
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
四、实验结果
均见附件。

五、实验感想
