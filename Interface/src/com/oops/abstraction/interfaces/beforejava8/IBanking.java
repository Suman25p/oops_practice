package com.oops.abstraction.interfaces.beforejava8;

public interface IBanking {
	
	public abstract void doBanking();
	
	public abstract void stopTxn();
	
//	public default void stopTxn() { //this is optional in java 8 
//		//body may or may not have, It is implements in subclass body
//	}
}
