package domain;

public class LoginBean {
	
	private String name;
	private String pwd;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public boolean validate(){
		if(pwd.equals("admin")){
			return true;
		}else{
			return false;
		}
	}
	
	
}
