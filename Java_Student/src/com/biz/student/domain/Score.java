package com.biz.student.domain;

/*
 * VO 클래스 작성
 * VO 클래스는 프로젝트에서 매우 중요한 역할을 수행한다.
 * 프로젝트에서 어떤 데이터를 어떻게 취급할것인가를 먼저 파악하고 클래스를 작성한다.
 * 프로젝트에서 필요한 데이터항목이 누락되거나 불필요한 항목이 추가되지 않도록 잘 설계를 해야 한다.
 * => 객체지향에서 객체의 추상화 단계라고 한다
 */
public class Score {
	private String num;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float floatAvg;
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	
	
	

}
