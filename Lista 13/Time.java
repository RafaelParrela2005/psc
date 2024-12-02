public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hora) {
        this(hora, 0, 0);
    }

    public Time(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Time(int hora, int minuto, int segundo) {
        setTime(hora, minuto, segundo);
    }

    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 23.");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto deve estar entre 0 e 59.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo deve estar entre 0 e 59.");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public String formatarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
