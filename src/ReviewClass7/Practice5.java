package ReviewClass7;

public class Practice5 {
    String weekDay(String day){
        day = day.toLowerCase();
        switch (day) {
            case "monday":
                return "it is lazy day";
            case "tuesday":
                return "it is productive day";
            case "wednesday":
                return "it is gloomy day";
            case "thursday":
                return "it is exciting day";
            case "friday":
                return "no work day";
            default:
                return"No correct option found";
        }
    }

    public static void main(String[] args) {
        Practice5 p=new Practice5();
        p.weekDay("friday");

    }
}
