package casting;

public class Casting {
    public static void main(String[] args) {
        byte byteValue = (byte) 128;
        short shortVal = 32767;
        int intVal = 2147483647;

        float floatVal = 32332.9F;
        intVal = (int) floatVal;
        System.out.println(intVal);
    }
}
