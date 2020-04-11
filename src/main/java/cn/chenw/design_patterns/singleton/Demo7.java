package cn.chenw.design_patterns.singleton;

/**
 * @author: ChenWei
 * @create: 2020/4/11 - 15:33
 * <p>
 * 懒汉式 - 枚举单例 - 静态内部类
 **/
public class Demo7 {

	private  Demo7(){}

	//枚举对象只有一个单例
	static enum  SingletonEnum{
		INSTANCE;

		private Demo7 demo7;
		//单例模式的构造方法要么不写权限修饰符，要么就是privcate
		private SingletonEnum(){
			demo7 = new Demo7();
		}

		private Demo7 getDemo(){
			return demo7;
		}
	}

	public static Demo7 getDemo(){
		return SingletonEnum.INSTANCE.getDemo();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(() -> {
				System.out.println("[打印]>>>" + Demo7.getDemo().hashCode());
			}, "线程" + i).start();
		}
	}

}
