package com.example.MyFirstKotlinApp

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MyFirstKotlinAppApplication

fun main(args: Array<String>) {
	val SongOne = Song("The Mesopotamians","Luna")
	val SoneTwo = Song("Going Underground","The Jam")

	SongOne.play()
	SoneTwo.play()
	SongOne.stop()
}

class Song(val title: String, val artist: String){
	fun play(){
		println("Playing the song $title by $artist")
	}

	fun stop(){
		println("Stopped playing $title")
	}
}


