package com.biz.score.domain;

/*
 * 성적처리 과정에서 1학생의 성적을 담는 Object 변수
 * Value Object 클래스 라고 한다.
 * VO, DTO 클래스들을 domain 클래스 라고 한다.
 * 
 * 필드변수를 private로 설정하고 필드변수에 접근(값을 저장, 읽기) getter, setter를 선언
 * 
 * 이러한 방식으로 클래스를 정의하는 것을 정보은닉, 캡슐화라고 한다.
 * 
 */

public class ScoreVO {
	private String stID;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float floatAvg;

	public String getStID() {
		return stID;
	}

	public void setStID(String stID) {
		this.stID = stID;
	}

	public int getIntKor() {
		return intKor;
	}

	// 정보의 유효성 검사
	// 성적은 0 ~ 100까지가 기본값인데 만약에 성적을 0미만, 100초과 된 값을 저장하려고 하면 거부하도록 setKor() 변경
	public boolean setIntKor(int intKor) {
		if (intKor <= 0 || intKor >= 100) {
			return false;
		}
		this.intKor = intKor;
		return true;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
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
