package com.SingletonTypes;

public class LazyInitialization {

	private static LazyInitialization lazyInitialization=null;
	
	private LazyInitialization()
	{
		System.out.println("Inside LazyInitialization constructor");
	}
	
	public static LazyInitialization getInstance()
	{
		if(lazyInitialization==null)
			lazyInitialization=new LazyInitialization();
		
		return lazyInitialization;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LazyInitialization a=LazyInitialization.getInstance();
		LazyInitialization b=LazyInitialization.getInstance();
	}

}
