//
// Main method
//
class MyMain {

    public static void main(String[] args) 
    {
       System.out.println("Starting the program.");
       
       // myStaticMethod(); // Call the static method
       // myPublicMethod(); This would compile an error

        HelloWd testing = new HelloWd(); // Create an object of MyClass
        testing.myPublicMethod(); // Call the public method on the object

       System.out.println("ENDING program.");
       
    }

}
