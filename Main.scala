class Rational
 {


    var number = 5;
   
    def neg()=
      {
            var num =  -1 * number ;

            println("After evaluation : "+num);


      }


  }


object Main
 {

    def main(args: Array[String]):Unit = 
      
        {

               var obj = new  Rational();
               obj.neg();



        }





  }