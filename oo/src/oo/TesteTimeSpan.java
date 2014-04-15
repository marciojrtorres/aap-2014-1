package oo;

public class TesteTimeSpan {

    public static void main(String[] args) {

        TimeSpan ts = new TimeSpan(15);  // 0,0,15
                                        
        System.out.println(ts.getHours());
        System.out.println(ts.getMinutes());
        System.out.println(ts.getSeconds());

        TimeSpan t1 = new TimeSpan(1,0,0);

        System.out.println(t1);  // t1.toString();      
        System.out.println(t1.toString());  // t1.toString();      

        TimeSpan t2 = new TimeSpan(1,0,0);
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // true

        TimeSpan t3 = new TimeSpan(2,0,0);
        //System.out.println(t2.compareTo(t3)); // Comparable
        // positivo se o primeiro ob maior que o segundo
        // zero se forem iguais
        // negativo se o primeiro ob menor que o segundo
        // TimeSpan[] horarios = {t1, t2, t3};
        // java.util.Collections.sort(horarios);
        TimeSpan t4 = new TimeSpan();
        System.out.println(t4); // 00:00:00
        t4.plusMinutes(70);
        System.out.println(t4.getHours()); // 01:10:00
        System.out.println(t4.getMinutes()); // 01:10:00
        System.out.println(t4.getSeconds()); // 01:10:00
    }
}