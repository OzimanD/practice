package ALina;

public class main {
    public static void main(String[] args) {
        System.out.println( Day(2));

    }

    static String Day (int a){
        String result;

        switch (a){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            default:
                result = " There is no such a day ";
        }
        return result;
    }
}
