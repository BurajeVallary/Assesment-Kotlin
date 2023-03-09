fun main() {
    val result = firstCharacter("Hello", "would")
    println(result)



    val numbers = intArrayOf( 2, 4,6)
    val (smallest, largest, average)= intArrayOf(2,4,6)
    println("Smallest: $smallest, Largest: $largest, Average: $average")

    val putString = "I can do it"
    split(putString)


}
//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun firstCharacter(name1: String, name2: String): Char {
    return if (name1.length > name2.length) {
        name1[0]
    } else {
        name2[0]
    }
}

//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun getNum(numbers: Array<Int>):Int {
    var smallest = numbers.minOrNull()
    var largest = numbers.maxOrNull()
    var average = numbers.average()
    return (Int.hashCode())
}
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun split(put: String) {
    val man = put.toCharArray()
    println("I can make it:")
    for (char in man) {
        println(char)
    }
}
