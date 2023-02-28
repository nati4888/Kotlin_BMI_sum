var sum : Int = 0
fun calculator (num1: Int,num2: Int,operator: String): Int?{
    when(operator){
        "+"->return num1+num2
        "-"->return num1-num2
        "/"->if(num2 == 0) return null else return num1/num2
        "*"->return num1*num2
        else -> return null
    }
}

fun sumOfArrayList (arr: Array<Int>) {
    for (a in arr){
        sum += a
    }
    println(sum)
}

fun bmiMetric (weight: Double,height: Double): String {
    val bmi = weight /  (height * height)
    return if  (bmi < 18.5) "Underweight"
    else if  (bmi < 25) "Normal weight"
    else "Overweight"
}

fun main () {
     //Local varable
    val weight = 80.57
    val height = 1.727
    val num1 = 500
    val num2= 250
    val opp="*"
    val arr = arrayOf(1,2,3,4,5)

    val status = bmiMetric(weight, height)//have return and assignation
    println(status)

    println(calculator(num1, num2,opp))//have return with no assignation

    sumOfArrayList(arr)//no return print inside function


}