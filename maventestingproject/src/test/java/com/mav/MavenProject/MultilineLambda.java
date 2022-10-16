package com.mav.MavenProject;

import java.util.Arrays;
import java.util.List;

public class MultilineLambda {

	public static void main(String[] args) {
		List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach(x ->{
			x+=2;
		System.out.println(x);
		});
	}}
