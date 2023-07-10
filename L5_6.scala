object L5_6 {

  def Fib(n:Int):Int={

    if(n<=1)

      n

    else

      Fib(n-1)+Fib(n-2)
  }

  def printFib(n:Int):Unit={

    for(i <- 0 until n){

      print(Fib(i)+" ")

    }

  }

  def main(args:Array[String]):Unit={

    printf("Enter the terms:")
  val number=scala.io.StdIn.readInt();

    println(s"FibonacciSeries up to $number:")
    printFib(number)
  }

}
