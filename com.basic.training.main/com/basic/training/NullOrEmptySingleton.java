package com.basic.training;

public final class NullOrEmptySingleton {
	private static final NullOrEmptySingleton INSTANCE = null;

	private NullOrEmptySingleton() {

	}

	public static NullOrEmptySingleton getInstance() {
		if (INSTANCE == null)
			return new NullOrEmptySingleton();
		return INSTANCE;
	}

	public boolean isNullOrEmpty(String str) {
		if (str != null && !str.isEmpty())
			return false;
		return true;
	}
}
