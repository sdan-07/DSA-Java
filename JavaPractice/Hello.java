public class Hello {
    public static void main(String[] args) {
        String day = "SATURDAY";
        System.out.println(DayType(day));
    }

    static String DayType(String day){
        return switch (day) {
            case "SATURDAY", "FRIDAY" -> "weekend";
            case "MONDAY" -> "Weekday";
            default -> "Not a day";
        };
    }
}
