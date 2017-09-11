public class HelloWorld {
    public static void main( String[] args ) {
        String message = "Hello World";
        try {
            message = String.format("Hello %s", args[0]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("No username provided, using default message.");
        }
        finally {
            System.out.println(message);
        }
        System.exit( 0 );
    }
}
