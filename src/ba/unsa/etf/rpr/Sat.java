package ba.unsa.etf.rpr;

public class Sat
{
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde)
    {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public void postavi(int sati, int minute, int sekunde)
    {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public void sljedeci() {
        sekunde++;
        if(sekunde == 60) { sekunde = 0; minute++; }
        if(minute == 60) {minute = 0; sati++; }
        if(sati == 24) { sati = 0; }
    }
    public void prethodni() {
        sekunde--;
        if(sekunde == -1) { sekunde = 59; minute--; }
        if(minute == -1) {minute = 59; sati--; }
        if(sati == -1) { sati = 23; }
    }
    public void pomjeriZa(int pomak) {
        if(pomak > 0) for(int i = 0; i < pomak; i++) sljedeci();
        else for(int i = 0; i < -pomak; i++) prethodni();
    }
    public int dajSate() { return sati; }
    public int dajMinute() { return minute; }
    public int dajSekunde() { return sekunde; }
    public void ispisi() { System.out.println((sati == 0 ? 00 : sati) + ":" + (minute == 0 ? 00 : minute) + ":" + (sekunde == 0 ? 00 : minute)); }
}