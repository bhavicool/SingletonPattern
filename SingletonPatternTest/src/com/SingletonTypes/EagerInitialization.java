package com.SingletonTypes;

public class EagerInitialization {

	private static final EagerInitialization eagerInitialization = new EagerInitialization();

	//private constructor to avoid client applications to use constructor
	private EagerInitialization(){
		System.out.println("Singleton instance initialized");
	}

	public static EagerInitialization getInstance(){
		return eagerInitialization;
	}

	public static void main(String[] args) {

	}

}
