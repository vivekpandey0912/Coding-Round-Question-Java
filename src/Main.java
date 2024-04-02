package src;

public class Main {


    public static void main(String[] args) {

    }
}


// write a program to print string and array with same method
class Solution1 {






    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};


        printArray(intArray);
        printArray(stringArray);
    }
}

//  Write a program to reverse of String


class PrintString
{
    public static void printReverseStringWithStringBuffer(String value)
    {

        StringBuffer stringBuffer = new StringBuffer(value);
        System.out.println(stringBuffer.reverse());



    }
    public static void printReverseStringWithLoop(String value)
    {

        for (int i = value.length()-1; i>=0; i--) {

            System.out.println(value.charAt(i));

        }


    }

    public static void main(String[] args) {


        String name = "Vivek Pandey";
        String name1 = "Alok Pandey";

        PrintString.printReverseStringWithStringBuffer(name);
        PrintString.printReverseStringWithLoop(name1);




    }




}





