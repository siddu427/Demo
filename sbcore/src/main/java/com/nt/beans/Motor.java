package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.bean.Chain;
@Component
public class Motor {
	@Value("${mid}")
	private int mid;
	@Autowired
	private Chain chain;
	
	public void run() {
		System.out.println(chain.toString());
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public Chain getChain() {
		return chain;
	}
	public void setChain(Chain chain) {
		this.chain = chain;
	}
	@Override
	public String toString() {
		return "Motor [mid=" + mid + ", chain=" + chain + "]";
	}
	

}
