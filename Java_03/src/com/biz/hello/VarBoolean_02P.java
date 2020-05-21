package com.biz.hello;

public class VarBoolean_02P {

	public static void main(String[] args) {

				
		  int num1 = 256;
		  int num2 = 354;
		  
		  int numP = num1+num2;
		  int numM = num2-num1;
		  int numT = num1*num2;
		  int numD = num2/num1;
		  
		  System.out.println(numP);
		  System.out.println(numM);
		  System.out.println(numT);
		  System.out.println(numD);
		  
		  boolean bVarP = (numP%2)==0;
		  boolean bVarM = (numM%2)==0;
		  boolean bVarT = (numT%2)==0;
		  boolean bVarD = (numD%2)==0;
		  
		  System.out.println(bVarP);
		  System.out.println(bVarM);
		  System.out.println(bVarT);
		  System.out.println(bVarD);
		  
		  if(bVarP==true) {
		  System.out.println("덧셈결과는 짝수");
		  }
		  
		  if(bVarM==true) {
		  System.out.println("뺄셈결과는 짝수");
		  }
		  
		  if(bVarT==true) {
		  System.out.println("곱셈결과는 짝수");
		  }
		  
		  if(bVarD==true) {
		  System.out.println("나눗셈결과는 짝수");
		  }

	}

}
