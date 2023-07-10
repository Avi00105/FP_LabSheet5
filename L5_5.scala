object L5_5 {


  def sumEven(n:Int,current:Int=2):Int={

    if(n<0 || n==0)

      0

    else if(n%2==0)

      n + sumEven(n-2)

    else

      sumEven(n-1)

  }

  def main(args:Array[String]):Unit={

    val number=5

    val evenResult=sumEven(number)

    println(s"Sum of the even numbers less than $number is = $evenResult")

  }

}
