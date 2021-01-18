package com.example.MyFirstKotlinApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFirstKotlinAppApplication

fun main(args: Array<String>) {
	//	runApplication<MyFirstKotlinAppApplication>(*args)
	val wordArray1 = arrayOf("24/7","muti-haha","xixi","oo")
	val wordArray2 = arrayOf("username","password","key","login")

	val arraySize1 = wordArray1.size
	val arraySize2 = wordArray2.size

	val rand1 = (Math.random() * arraySize1).toInt()
	val rand2 = (Math.random() * arraySize2).toInt()
	val phrase = "${wordArray1[rand1]},${wordArray2[rand2]}"

	println(phrase)
}
