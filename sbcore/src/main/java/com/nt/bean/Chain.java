package com.nt.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
@Component
public class Chain {
	@Value("${cid}")
	private int cid;
	@Value("${cname}")
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Chain [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	

}
