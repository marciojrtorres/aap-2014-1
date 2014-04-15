package oo;

// modelando o Tempo Decorrido
// sempre sobrescreve o metodo toString
// sempre sobrescrever equals e hashCode
// considere implementar Comparable

public class TimeSpan { // extends Object {

    private int h, m, s;

    public TimeSpan() {} // h,m,s=0

    public TimeSpan(int h, int m, int s) {
        plusSeconds(s);
        plusMinutes(m);
        plusHours(h);
    }

    public TimeSpan(int s) {
        // delegando para o construtor completo
        this(0, 0, s); // this(0,0,s) = TimeSpan(0,0,s);
    }

    public TimeSpan(int m, int s) { // h=0, m=12, s=40
        this(0, m, s);
    }

    public int getHours() {
        return h;
    }

    public int getMinutes() {
        return m;
    }

    public int getSeconds() {
        return s;
    }

    public void plusSeconds(int s) {
        if (s < 0) {
            throw new IllegalArgumentException("Invalid Time");
        }

        int m = 0;

        if (s > 59) {
            m += s / 60;
            this.s += s % 60;
        } else {
            this.s += s;
        }
        
        if (m > 59) {
            this.h += m / 60;
            this.m += m % 60;
        } else {
            this.m += m;
        }

    }

    public void plusMinutes(int m) {
        plusSeconds(m * 60);
    }

    public void plusHours(int h) {
        plusMinutes(h * 60);
    }

    public void plus(TimeSpan t) {
        plusSeconds(t.s);
        plusMinutes(t.m);
        plusHours(t.h);
    }

    @Override // sobrescreve
    public String toString() {
        return String.format("%02d:%02d:%02d", h, m, s);
    }
    // t1.equals(t1) == t1 == t1
    @Override
    public boolean equals(Object outro) {
        if (this == outro) return true; // eh a mesma instancia
        if (outro == null) return false;
        if (!(outro instanceof TimeSpan)) return false;        
        TimeSpan ts = (TimeSpan) outro; // coercao, type cast
        if (this.s != ts.s) return false;
        if (this.m != ts.m) return false;
        if (this.h != ts.h) return false;
        return true;
    }

    @Override // dois objetos equals, devem ter o mesmo hashCode
    public int hashCode() {
        return s + m * 60 + h * 3600;
    }

}