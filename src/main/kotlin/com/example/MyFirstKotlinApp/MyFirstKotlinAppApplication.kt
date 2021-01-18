package com.example.MyFirstKotlinApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFirstKotlinAppApplication

fun main(args: Array<String>) {
//	runApplication<MyFirstKotlinAppApplication>(*args)
	// Normal statement
	var x = 3;
	x = x*10;
	print("x is $x.\n");

	// Loop statement
	while (x >20){
		x = x-1;
		println("x is $x. ")
	}
	for (i in 1..10){
		x=x+1;
		println("X now is $x. ");
	}

	// if - else 若只有一行，可简写
	println(if (x>3) "X is grater than 3" else "X is smaller than 3")


}
