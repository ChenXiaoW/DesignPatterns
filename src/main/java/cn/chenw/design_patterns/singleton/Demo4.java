package cn.chenw.design_patterns.singleton;

/**
 * @author: ChenWei
 * @create: 2020/4/11 - 15:33
 * <p>
 * 懒汉式
 * 通过加锁实现线程安全 - 双重检查 - 在demo3的基础上提升效率
 * 缺点：效率下降
 **/

public class Demo4 {
	private static volatile Demo4 demo;

	//私有化无参构造
	private Demo4() {
	}

	public static Demo4 getDemo() {

		if(demo == null){
			synchronized (Demo4.class){
				if(demo == null){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					demo = new Demo4();
				}
			}
		}
		return demo;
	}

	public static void main(String[] args) {

		//验证多线程下是否线程不安全 - 事实下是安全的
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println("[打印]>>>" + Demo4.getDemo().hashCode());
			}, "线程" + i).start();
		}
	}
}
