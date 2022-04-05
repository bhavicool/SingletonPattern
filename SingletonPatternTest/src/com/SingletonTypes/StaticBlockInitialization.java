package com.SingletonTypes;

public class StaticBlockInitialization {

private static StaticBlockInitialization staticBlockInitialization=null;
    
    private StaticBlockInitialization(){
    	System.out.println("StaticBlockInitialization called");
    }
    
    //static block initialization for exception handling
    static{
        try{
        	staticBlockInitialization = new StaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockInitialization getInstance(){
        return staticBlockInitialization;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
