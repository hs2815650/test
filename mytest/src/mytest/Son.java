package mytest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

public class Son extends Father {
	// @Override
	public Collection doSomething(Map map) {
		System.out.println("子类被执行。。。");
		return map.values();
	}

	public static void main(String[] args) {
		Son son = new Son();
		HashMap hm = new HashMap();
		son.doSomething(hm);
		son.doSomething((Map) hm);
		Resource.class.getClassLoader();
	}
}
