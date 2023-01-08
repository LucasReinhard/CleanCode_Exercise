package exercise2;

public class FunctionManager {
    public static String execute(String input, int functionCode)
    {
        switch (functionCode)
        {
            case 0:
                return input + "Hello";
            case 1:
                return input + " ";
            case 2:
                return input + "World";
            case 3:
                System.out.println(input);
                return input;
            default:
                throw new IllegalArgumentException();
        }
    }
}
