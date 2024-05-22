package main; 

import java.util.ArrayList;

public class Main{

public static void main(String[] args){

ArrayList<String> second = new ArrayList<>();

second.add("Diana");
second.add("Bob");
second.add("Earl");
second.add("Alice");
second.add("Christina");


	System.out.println(second);

second.remove(2);

	System.out.println();
	
	System.out.println("After the third element is removed: " + second);

	System.out.println();
for(int i = 0; i < second.size(); i++ ){
	if(second.get(i).equals("Alice")) {
	System.out.println("Alice was in the index number : " + second.indexOf("Alice"));
}}

	System.out.println();
	
for(int i = 0; i < second.size() - 1; i++){
	for(int j = 0; j < second.size() -1 - i; j++){

	if(second.get(j).compareTo(second.get(j +1)) > 0){
	String hold = second.get(j);
	second.remove(j);
	second.add(j , second.get(j));
	second.remove(j +1);
	second.add(j +1, hold);
}




}}

	System.out.println("Sorted ArrayList: " + second);
}}