fun main(args: Array<String>) {
    println("Hello World!")

    val squareCabin = GDP.SquareCabin(6, 50.0)
    val roundHut = GDP.RoundHut(3, 10.0)
    val roundTower = GDP.RoundTower(4, 15.5)


    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
    }

    with(roundHut) {
        println("\nRound Hut\n=========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")

        println("Carpet size: ${calculateMaxCarpetSize()}")
    }


    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")

        println("Has room? ${hasRoom()}")
        getRoom()

        println("Carpet size: ${calculateMaxCarpetSize()}")
    }
}