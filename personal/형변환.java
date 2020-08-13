public class test_1 {
    public static void main(String[] args) {
        int test_int, temp_int;
        String test_str, temp_srt;

        test_int = 10;
        test_srt = "1234";

        temp_int = Integer.parseInt(test_srt); // 변환할 String
        temp_srt = Integer.toString(test_int); // 변환할 int
    }
}

// valueOf(String s)
// parseByte(String s)
// parseDouble(String s)
// parseFloat(String s)
// parseInt(String s)
// parseLong(String s)
// parseShort(String s)

public class Main {
    public static void main(String[] args) {
        String strNum = "2005.09";
        String strBool = "true";

        int intNum = (int) Float.parseFloat(strNum);
        float floatNum = Float.parseFloat(strNum);
        Boolean boolObj = Boolean.valueOf(strBool);
        boolean bool = boolObj.booleanValue();

        System.out.println("Integer.parseInt(strNum) ->" + intNum);
        System.out.println("Float.parseFloat(strNum) ->" + floatNum);
        System.out.println("Boolean.getBoolean(strBool) ->" + bool);
    }
}