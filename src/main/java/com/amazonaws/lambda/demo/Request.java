package com.amazonaws.lambda.demo;

public class Request {
	private String input;

	public Request(String input) {
		super();
		this.input = input;
	}

	public Request() {
		super();
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	@Override
	public String toString() {
		return "Request [input=" + input + "]";
	
	}
	
}
