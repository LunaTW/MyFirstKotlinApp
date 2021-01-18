package com.example.MyFirstKotlinApp

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MyFirstKotlinAppApplication

fun main(args: Array<String>) {
	val options = arrayOf("Rock","Paper","Scissors")
	val gameChoice = getGameChoice(options)
	val userChoice = getUserChoice(options)
	printResult(gameChoice,userChoice)
}

fun getGameChoice(options:Array<String>): String {
	return options[(Math.random() * options.size).toInt()]
}

fun getUserChoice(options:Array<String>): String {
	while (true){
		println("Please enter one of the following:")
		for (item in options) println (item)
		println("~~~~~~~~~~~~~~~~~~~~~~~~")

		val userInput = readLine()?.capitalize()
		if (userInput != null && userInput in options ){
			return userInput;
		}else{
			println("Please enter a valid choice!")
		}
	}
}

fun printResult(userChoice: String, gameChoice: String){
	val result: String
	if(userChoice== gameChoice) result="Tie!";
	else if ((userChoice=="Rock" && gameChoice == "Scissors") ||
			(userChoice == "Paper" && gameChoice == "Rock") ||
			(userChoice == "Scissors" && gameChoice == "Paper")) result="You win!"
	else result="You lose!"
	println("You chose $userChoice. I chose $gameChoice. $result")
}