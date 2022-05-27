package exceptions;

import java.io.File;

public class MyClass {

    public static void main(String[] args){

        File file = new File("c://myFile.txt");
        try {
            System.out.println("random");
            throw new Exception("java exception!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after exception");

//        int myArray[] = {1, 2, 3};
//        System.out.println(myArray[3]);
    }

/*    public static void main(String[] args) {

        File file = new File("c://myFile.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("after exception");

//        int myArray[] = {1, 2, 3};
//        System.out.println(myArray[3]);
    }*/
}
