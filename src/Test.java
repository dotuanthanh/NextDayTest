public class Test {
    public static void main(String[] args) {
        Time time=  new Time();
        time.nextDay(31,12,2020);
        System.out.println(time);
        System.out.println(time.getDay());
    }
}
