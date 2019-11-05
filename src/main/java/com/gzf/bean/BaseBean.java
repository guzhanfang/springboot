package com.gzf.bean;

import java.util.Date;

public class BaseBean {
	protected Date ct;
	protected Date up;
	protected int state;

	public Date getCt() {
		return ct;
	}

	public void setCt(Date ct) {
		this.ct = ct;
	}

	public Date getUp() {
		return up;
	}

	public void setUp(Date up) {
		this.up = up;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "BaseBean [ct=" + ct + ", up=" + up + ", state=" + state + "]";
	}

}
