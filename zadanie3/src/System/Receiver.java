package System;

public class Receiver {
    int hours = 00;
    int minutes = 00;

    public void timeUp() {
        if(minutes == 59) {
            if(hours == 23) {
                hours = 0;
            } else {
                hours++; 
            }
            minutes = 0;
        } else {
            minutes++;
        }
    }

    public String getTime() {
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes);
    }
}
