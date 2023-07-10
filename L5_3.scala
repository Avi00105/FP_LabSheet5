object L5_3 {

  def addition(x:Int,sum:Int=1):Int={

    if(x==1 || x==0)

        x

    else

        x+addition(x-1)

    }

  def main(args:Array[String]):Unit={

    val resultadd=addition(4);

    println(s"addition of 1 to 4 =$resultadd");

  }

}
