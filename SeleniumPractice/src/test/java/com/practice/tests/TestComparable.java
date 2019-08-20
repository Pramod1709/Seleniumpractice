package com.practice.tests;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		
		System.out.println("Sorting By Age Using Comparable");
		Collections.sort(al);  
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		} 
		
		System.out.println("Sorting By Age Using Comparator");
		Collections.sort(al,new AgeComparator() );
		for(Student st:al){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}  

}
