package com.socialmedia.exceptions;

public class EmptyPostException extends Exception{
	/**
	 * 
	 */
	public static final String MSG = "No post found to create.";
	
	public EmptyPostException() {
		super(MSG);
	}
}