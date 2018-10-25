package com.ccclin.mathtesta;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ccclin.mathtest.MathMutiple;

public class mathJUnit {

	// stage1
	@Test
	public void test1() {
		MathMutiple mathMutiple = new MathMutiple();
		List<String> mList = mathMutiple.getMutipleList(100);
		for(String s:mList) {
			System.out.println(s);
		}
	}

	//stage2
	@Test
	public void test2() {
		MathMutiple mathMutiple = new MathMutiple();
		List<String> containList = mathMutiple.getContainList(100);
		System.out.println("#stage2 ########################################################");
		for(String s:containList) {
			System.out.println(s);
		}
	}
	
	//stage2
	@Test
	public void test3() {
		MathMutiple mathMutiple = new MathMutiple();
		List<String> containList = mathMutiple.getContainList(100);
		for(int i=0;i<containList.size();i++) {
			int b= i+1;
			if(b==75) {
				assertEquals(containList.get(i), "FizzBuzz");
			}
		}
	}
	
	//stage2
	@Test
	public void test4() {
		MathMutiple mathMutiple = new MathMutiple();
		List<String> containList = mathMutiple.getContainList(100);
		for(int i=0;i<containList.size();i++) {
			int b= i+1;
			if(b==33) {
				assertEquals(containList.get(i), "Fizz");
			}
		}
	}
	
	//stage2
	@Test
	public void test5() {
		MathMutiple mathMutiple = new MathMutiple();
		List<String> containList = mathMutiple.getContainList(100);
		for(int i=0;i<containList.size();i++) {
			int b= i+1;
			if(b==35) {
				assertEquals(containList.get(i), "Buzz");
			}
		}
	}
	
}
