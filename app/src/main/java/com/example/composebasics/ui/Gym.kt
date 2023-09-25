package com.example.composebasics.ui

val listOfGyms = listOf<Gym>(
Gym(1,"UpTown Gym","7 Flowers ST, Kilo 21, AlAgami, Alexandria, Flowers ST, Egypt"),
Gym(2,"UpTown Gym","7 Flowers ST, Kilo 21, AlAgami, Alexandria, Flowers ST, Egypt"),
Gym(3,"UpTown Gym","7 Flowers ST, Kilo 21, AlAgami, Alexandria, Flowers ST, Egypt"),
Gym(4,"UpTown Gym","7 Flowers ST, Kilo 21, AlAgami, Alexandria, Flowers ST, Egypt"),
Gym(5,"UpTown Gym","7 Flowers ST, Kilo 21, AlAgami, Alexandria, Flowers ST, Egypt")
)

data class Gym(val id: Int, val name: String, val place: String, var isFavourite: Boolean = false)