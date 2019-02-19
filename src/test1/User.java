package test1;

import heap.Person;
import heap.Person1;

public class User extends Person1{
	private int t4;
	private int t3;

	public int getT3() {
		return t3;
	}

	public void setT3(int t3) {
		this.t3 = t3;
	}

	public User(int t3, int t4) {
		this.t3 = t3;
		this.t4 = t4;
	}

	public int getT4() {
		return t4;
	}

	public void setT4(int t4) {
		this.t4 = t4;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
