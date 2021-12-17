//演示转义字符的使用
public class Change{
	public static void main(String[]args){
		System.out.println("hello word!");
//	\t:一个制位表,实现对及功能
	System.out.println("广西\t钦州\t平吉");
//	\n:换行符
	System.out.println("广西\n钦州\n平吉");

//	\":一个"
	System.out.println("老关说：\"你不好好学习就完蛋啦\"");
//	\\:一个\
	System.out.println("guan\\yezhou");
//	\':一个'
//	\r:一个回车 Systme.out.println("hello word!");
	System.out.println("老关你不好好学习就\r\n完蛋啦");
	}
}
