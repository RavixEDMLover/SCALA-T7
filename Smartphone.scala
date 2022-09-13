class Smartphone
{
     
    
    var number: Int = 16
    var nameofcompany: String = "Apple"
     
    
    def Display()=
    {
        println("Name of the company : " + nameofcompany);
        println("Total number of Smartphone generation: " + number);
    }
}
object Main
{
     
    // Main method
    def main(args: Array[String]):Unit = 
    {
         
        // Class object
        var obj = new Smartphone();
        obj.Display();
    }
}