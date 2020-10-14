package Two;

public class testy {
    public static void main(String[] args) {
        try{
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime exception in main");
        }
        catch (Exception e) {
            System.out.println("Exception in main");
        }
    }

    static void method() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        }
        catch (StringIndexOutOfBoundsException s){
            System.out.println("Invalid request");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime exception in method(");
        }
        catch (Exception e) {
            System.out.println("Exception in method()");
        }
    }
}
