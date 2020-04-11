package cn.chenw.design_patterns.singleton;

/**
 * @author: ChenWei
 * @create: 2020/4/11 - 15:33
 * <p>
 * 懒汉式 - 枚举单例
 **/
public enum Demo6 {

	INSTANCE;

	public void m() {
		System.out.println("方法调用");
	}

	public static void main(String[] args) {

		//验证多线程下是否线程不安全 - 事实下是安全的
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println("[打印]>>>" + Demo6.INSTANCE.hashCode());
			}, "线程" + i).start();
		}
	}
}
