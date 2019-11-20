package test;

/**
 * 单列模式
 * 饿汉
 */
import java.security.Signature;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	static Singleton getSingleton() {
		return singleton;
	}

}
