fun main() {
    val result = firstCharacter("Angelah", "Nyambu")
    println(result)


    var result2=numbers(arrayOf(1,2,6,8,9))
    println(result2)

    split("My name is Vallary")

    var role=careers(arrayOf("Nurse","Doctor","Teacher"))
    println(role)

    var calculator=Calculator(40.3,20.7)
    calculator.addition()
    calculator.multiplication()
    calculator.division()


}
//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun firstCharacter(name1: String, name2: String):Char {
     if (name1.length > name2.length) {
        return name1[0]
    }
     else  if (name2.length>name1.length) {
       return name2[0]
    }
    else
     {
         return name1[0]
     }
}

//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(num:Array<Int>):Triple<Int,Int,Double>{

   val num1=num.max()
   val num2=num.min()
    val num3=num.average()
    return Triple(num1,num2,num3)

}
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun split(put: String) {
    println(put.split( " "))
}



//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.

fun careers(name:Array<String>):String{
    return name.joinToString ( " ")

}

//5Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

class  Calculator( var num1:Double,var num2:Double){
    fun addition(){
        println(num1+num2)

    }
    fun substraction(){
        println(num1-num2)

    }
    fun division(){
        println(num1/num2)
    }
    fun multiplication(){
        println(num1*num2)
    }
}



