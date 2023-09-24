package by.bsuir.lab1.task9;

import java.util.Locale;

public class Ball {

    int volume;
    String bollColor;

    public Ball(int volume, String color) {
        this.volume = volume;
        this.bollColor = color;
    }

    public String GetColor (){return this.bollColor.toLowerCase(Locale.ROOT);}

}
