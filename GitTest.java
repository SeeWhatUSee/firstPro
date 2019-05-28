public class GitTest{
	private String operation;
	private String userName;
	public GitTest(String operation,String userName){
		this.operation = operation;
		this.userName = userName;
	}
	public void setOperation(String operation){
		this.operation = operation;
	}
	public String getOperation(){
		return this.operation;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public String toString(){
		print('git beautful');
	}
	public String toString2(){
		print('git beautful2');
	}

}