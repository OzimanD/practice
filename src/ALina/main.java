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
            case 4:
                result = "Th";
                break;
            case 5:
                result = "Fr";
                break;
            case 6:
                result = "Sa";
                break;
            case 7:
                result = "Su";
                break;
            default:
                result = " There is no such a day ";
        }
        return result;
    }
}
