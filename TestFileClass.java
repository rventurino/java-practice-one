package Three;

import java.util.Scanner;

public class TestFileClass {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("File file = new File(\"D:\\\\Java\\\\Hello.txt\");");
        Scanner scan = new Scanner(file);
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));

        String name = scan.next();
        System.out.println(name);
    }
}
