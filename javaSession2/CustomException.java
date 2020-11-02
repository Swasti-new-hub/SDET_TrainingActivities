package javaSession2;

public class CustomException extends Exception{
	
	private String message=null;
	
	public CustomException(String str){
		this.message = str;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
