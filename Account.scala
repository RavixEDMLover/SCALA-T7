class Account
  {
    var Sender :String = "Rox_Warner"
    var Amount :Int = 12500
    
  
    def transfer()=
      {
           
         var Rec = Amount;
         println("Recieved money by "+Sender);
         println("Amount : "+Rec);

      }


   }


object Main
{

    def main(args: Array[String]):Unit = 
      {
        

               var obj = new Account();
               obj.transfer();



      }





}