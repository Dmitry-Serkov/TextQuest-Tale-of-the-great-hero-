package com.example.textquest;

public class Level {
    public final String text;
    public final String leftButtonText;
    public final String rightButtonText;
    public final int nextLevelIndexLeft;
    public final int nextLevelIndexRight;
    public final boolean LeftVisibility;
    public final boolean RightVisibility;

    public Level(String text, String leftButtonText, String rightButtonText, int nextLevelIndexLeft, int nextLevelIndexRight, boolean LeftVisibility,boolean RightVisibility) {
        this.text = text;
        this.leftButtonText = leftButtonText;
        this.rightButtonText = rightButtonText;
        this.nextLevelIndexLeft = nextLevelIndexLeft;
        this.nextLevelIndexRight = nextLevelIndexRight;
        this.LeftVisibility = LeftVisibility;
        this.RightVisibility = RightVisibility;
    }
}
