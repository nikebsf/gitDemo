package com.rbc.qa.testcases;
import java.util.HashMap;

// cloned from git

public class test {
	
	public static void main(String[] args) {
		
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("Nikunj", "patel");
		hm.put("Jay", "patel");
		hm.put("Harsh", "patel");
		hm.put("Om", "patel");
		hm.put("Meet", "patel");
		
		hm.put("Nikunj", "patel");
		hm.put("Jay", "patel");
		hm.put("Harsh", "patel");
		hm.put("Om", "patel");
		hm.put("Meet", "patel");
		
		System.out.println("GitDemo push pull");
		System.out.println(hm);
		
		System.out.println(hm.get("Om"));
		
		System.out.println(hm.size());
	}
}
