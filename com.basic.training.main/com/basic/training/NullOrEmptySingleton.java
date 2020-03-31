package com.basic.training;

public final class NullOrEmptySingleton {
	private static final NullOrEmptySingleton INSTANCE = new NullOrEmptySingleton();
	private NullOrEmptySingleton() {
		
	}
	public static NullOrEmptySingleton getInstance() {
		return INSTANCE;
	}
	public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
}
