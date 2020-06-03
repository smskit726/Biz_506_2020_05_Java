package com.biz.score.vo;

public class ScoreVO {
	private String Name;
	private int kor;
	private int eng;
	private int math;
	private int music;
	private int stdSum;
	private int stdAvg;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getStdSum() {
		return stdSum;
	}
	public void setStdSum(int stdSum) {
		this.stdSum = stdSum;
	}
	public int getStdAvg() {
		return stdAvg;
	}
	public void setStdAvg(int stdAvg) {
		this.stdAvg = stdAvg;
	}
	
	
	
}
