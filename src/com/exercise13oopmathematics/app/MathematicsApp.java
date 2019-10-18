package com.exercise13oopmathematics.app;

import java.util.Scanner;
import com.exercise13oopmathematics.model;

public class MathematicsApp {

	public static void main(String[] args)
	{
		//Variable declaration
		double base=0;
		double height=0;
		double radio=0;
		double side=0;
		double result=0;
		
		//Object construction
		Scanner input = new Scanner(System.in);
		MathematicsOperation myOperation = new MathematicsOperations();
		
		System.out.println("Input the base: ");
		base = input.nextDouble();
		System.out.println("Input the height: ");
		height = input.nextDouble();
		result = myOperation.areaTriangule(base, height);
		
	}

}
