package lesson2;

public class TwoDimensionArray {
    static String[][] arrayDataException = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "1", "2", "3"}, {"u", "4", "5", "6"}};

    static String[][] arraySizeException = {{"1", "2"}, {"3", "4",}, {"5", "6"}, {"7", "8"}};

    static String[][] arrayWithNoError = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "1", "2", "3"}, {"4", "5", "6", "7"}};

    static int sizeA = 4;
    static int sizeB = 4;

    public static void main(String[] args) {

        try {
            System.out.println("Array sum: " + getSumm(arrayWithNoError));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Array sum: " + getSumm(arraySizeException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Array sum: " + getSumm(arrayDataException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
    }

    static void checkValue(String[][] array) throws MyArraySizeException{
        if(array.length!=sizeA || array[0].length!=sizeB) throw new MyArraySizeException();

    }

    static Integer getSumm(String[][] array) throws MyArrayDataException,MyArraySizeException{
        checkValue(array);
        Integer result = 0;
        int i =0;
        int j =0;
        try {
            for (; i < array.length; i++) {
                j =0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new  MyArrayDataException("Input position error: " + i+","+j);
        }

        return result;
    }

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(){
            super("Size error");
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message){
            super(message);
        }
    }
}
