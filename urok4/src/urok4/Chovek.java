package urok4;

import java.io.Serializable;

public class Chovek implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private boolean pol;
	public Chovek(String name, int age, boolean pol)
	{
		this.name=name;
		this.age=age;
		this.pol=pol;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public boolean getPol() {
		return this.pol;
	}
}
