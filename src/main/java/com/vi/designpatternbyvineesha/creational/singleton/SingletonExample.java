package com.vi.designpatternbyvineesha.creational.singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonEager instance = SingletonEager.getInstance();

		SingletonLazy instance1 = SingletonLazy.getInstance();

		System.out.println("SingletonEager  : " + instance);
		System.out.println("SingletonLazy : " + instance1);

		SingletonSynchronizedForMethod instance3 = SingletonSynchronizedForMethod.getInstance();
		System.out.println("SingletonSynchronizedForMethod : " + instance3);

	}

}

/* this is for eager initialization */

class SingletonEager {

	private static SingletonEager instance = new SingletonEager();

	private SingletonEager() {

	}

	public static SingletonEager getInstance() {

		return instance;

	}

}

/* this is for lazy initialization */

class SingletonLazy {
	private static SingletonLazy instance;

	private SingletonLazy() {

	}

	public static SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();

		}
		return instance;
	}

}

/* synchronized for method(for read and write) */

class SingletonSynchronizedForMethod {
	private static SingletonSynchronizedForMethod instance;

	private SingletonSynchronizedForMethod() {

	}

	public static synchronized SingletonSynchronizedForMethod getInstance() {
		if (instance == null) {
			instance = new SingletonSynchronizedForMethod();
		}
		return instance;
	}
}

/* synchronized for object creation block */

class SingletonSynchronizedForBlock {
	private static SingletonSynchronizedForBlock instance;

	private SingletonSynchronizedForBlock() {

	}

	public static SingletonSynchronizedForBlock getInstance() {
		if (instance == null) {
			synchronized (SingletonSynchronizedForBlock.class) {
				if (instance == null) {
					instance = new SingletonSynchronizedForBlock();

				}

			}
		}
		return instance;

	}
}