package cn.chenw.design_patterns.singleton;

/**
 * @author: ChenWei
 * @create: 2020/4/11 - 15:33
 * <p>
 * 懒汉式 - 静态内部类方式
 *
 * JVM保证单例，加载外部类时不会加载内部类，这样就可以实现懒加载
 **/

public class Demo5 {

	//私有化无参构造
	private Demo5() {
	}

	private static class Holder{
		private static final Demo5 demo = new Demo5();
	}

	public static Demo5 getDemo() {
		return Holder.demo;
	}

	public static void main(String[] args) {

		//验证多线程下是否线程不安全 - 事实下是安全的
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println("[打印]>>>" + Demo5.getDemo().hashCode());
			}, "线程" + i).start();
		}
	}
}
