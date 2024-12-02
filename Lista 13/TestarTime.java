public class TestarTime {
    public static void main(String[] args) {

        Time time1 = new Time();
        System.out.println("Time 1: " + time1.formatarHora());

        Time time2 = new Time(10);
        System.out.println("Time 2: " + time2.formatarHora());

        Time time3 = new Time(10, 30);
        System.out.println("Time 3: " + time3.formatarHora());

        Time time4 = new Time(10, 30, 45);
        System.out.println("Time 4: " + time4.formatarHora());

        time4.setTime(23, 59, 59);
        System.out.println("Time 4 atualizado: " + time4.formatarHora());
    }
}
