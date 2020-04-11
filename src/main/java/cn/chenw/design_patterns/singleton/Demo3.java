package cn.chenw.design_patterns.singleton;

/**
 * @author: ChenWei
 * @create: 2020/4/11 - 15:33
 * <p>
 * 懒汉式
 * 通过加锁实现线程安全
 * 缺点：效率下降
 **/

public class Demo3 {

	private static Demo3 demo;

	//私有化无参构造
	private Demo3() {
	}

	public static synchronized Demo3 getDemo() {

		if (demo == null) {
			//模拟延迟测试
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			demo = new Demo3();
		}
		return demo;
	}

	public static void main(String[] args) {
	/*	Demo2 demo1 = Demo2.getDemo();
		Demo2 demo2 = Demo2.getDemo();
		//验证实例地址是否相同,如果相同，则说明JVM中只存在一个实例
		System.out.println("[验证实例地址是否相同]>>>"+(demo1 == demo2));*/

		//验证多线程下是否线程不安全 - 事实下是安全的
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println("[对象HashCode]>>>" + Demo3.getDemo().hashCode());
			}, "线程" + i).start();
		}
		long end = System.currentTimeMillis();
		System.out.println("[测试耗时]>>>"+(end-begin));
	}
}
