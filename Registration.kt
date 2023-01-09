package Registration

import java.io.*

fun main() {
    val listOfStrings: MutableList<String> = ArrayList()

    // load data from file
    val bf = BufferedReader(
        FileReader("/Users/sonaldhage/Project100/Registration/listOfNames.txt")
    )

    var line = bf.readLine()

    while (line != null) {
        listOfStrings.add(line)
        line = bf.readLine()
    }
    listOfStrings.add("")
    // closing bufferreader object
    bf.close()

    // storing the data in arraylist to array
    val array = listOfStrings.toTypedArray()


    print("Search your name: ")
    var input = readLine()
    for (i in array) {
        if (input == i) {
            println("Your name: $input \n")
        }
    }

    print("Sorry name not found!!!\nPlease register yourself:")
    var userName = readLine()

    // using extension function appendText
    if (userName != null) {
        File("/Users/sonaldhage/Project100/Registration/listOfNames.txt").appendText(userName)
    }
    println("Successfully registered!!!")

}