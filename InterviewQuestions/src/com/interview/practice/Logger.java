package com.interview.practice;

public class Logger {
	private static Logger logger = new Logger();
	
	private Logger() { }
	
	public static Logger getLogger() {
		return logger;
	}
	public void log(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Logger log = Logger.getLogger();
		log.log("Hello");
	}

}
