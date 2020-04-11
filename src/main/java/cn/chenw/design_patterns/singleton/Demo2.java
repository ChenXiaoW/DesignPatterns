package cn.chenw.design_patterns.singleton;
/**
 *
 * @author: ChenWei
 * @create: 2020/4/11 - 15:33
 *
 * 懒汉式
 * 线程不安全
 **/

public class Demo2 {

	private static  Demo2 demo ;
	//私有化无参构造
	private Demo2(){}

	public static Demo2 getDemo(){
		if (demo == null){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			demo = new Demo2();
		}
		return demo;
	}

	public static void main(String[] args) {
	/*	Demo2 demo1 = Demo2.getDemo();
		Demo2 demo2 = Demo2.getDemo();
		//验证实例地址是否相同,如果相同，则说明JVM中只存在一个实例
		System.out.println("[验证实例地址是否相同]>>>"+(demo1 == demo2));*/

	//验证多线程下是否线程不安全 - 事实下真的不安全
		for (int i = 0; i <100 ; i++) {
			new Thread(()->{
				System.out.println("[打印]>>>"+Demo2.getDemo().hashCode());
			},"线程"+i).start();
		}
	}
}
