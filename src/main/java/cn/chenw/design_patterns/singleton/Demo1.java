package cn.chenw.design_patterns.singleton;
/**
 *
 * @author: ChenWei
 * @create: 2020/4/11 - 15:33
 *
 * 饿汉式
 * 类加载到内存后，就实例化一个对象，JVM保证线程安全
 * 缺点：不管用到与否，类加载时就完成实例化
 **/

public class Demo1 {
	//实例化唯一一个实例
	private static final Demo1 demo = new Demo1();
	//私有化无参构造
	private Demo1(){}

	public static Demo1 getDemo(){
		return demo;
	}

	public static void main(String[] args) {
		Demo1 demo1 = Demo1.getDemo();
		Demo1 demo2 = Demo1.getDemo();
		//验证实例地址是否相同,如果相同，则说明JVM中只存在一个实例
		System.out.println("[验证实例地址是否相同]>>>"+(demo1 == demo2));
	}
}
