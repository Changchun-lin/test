package com.ccclin.mathtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 求数字倍数输出英文转化和输出特定数字
 * @author 47219
 *
 */
public class MathMutiple {
	final String  Fizz3 = "Fizz3";
	final String  Buzz5 = "Buzz5";
	final String  Buzz35 = "Buzz35";

	/**
	 * stage1
	 * @param a
	 * @return
	 */
	public List<String> getMutipleList(int a){
		List<String> alist = new ArrayList<String>();
		for(int i=1;i<=a;i++) {
			if(i%15==0) {
				alist.add("FizzBuzz");
			}else if(i%3==0){
				alist.add("Fizz");
			}else if(i%5==0){
				alist.add("Buzz");
			}else {
				alist.add(i+"");
			}
			
		}
		return alist;
	}
	
	/**
	 * stage2
	 * @param a
	 * @return
	 */
	public List<String> getContainList(int a){
		List<String> alist = new ArrayList<String>();
		for(int i=1;i<=a;i++) {
			if(i%15==0) {
				String s = String.valueOf(i);
				if(s.contains("3")||s.contains("5")) {
					alist.add("FizzBuzz");
				}else {
					alist.add(i+"");
				}
			}else if(i%3==0){
				String s = String.valueOf(i);
				if(s.contains("3")) {
					alist.add("Fizz");
				}else {
					alist.add(i+"");
				}
				
			}else if(i%5==0){
				String s = String.valueOf(i);
				if(s.contains("5")) {
					alist.add("Buzz");
				}else {
					alist.add(i+"");
				}
			}else {
				alist.add(i+"");
			}
		}
		return alist;
	}

}
