package Assets;

import java.io.Serializable;

public class PrintAssets implements Serializable {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public static PrintAssets print = new PrintAssets(false);
    public static PrintAssets println = new PrintAssets(true);
    private String ln;

    public PrintAssets(boolean lineBreak) {
        ln = (lineBreak) ? "\n" : "";
    }

    public void black(String string) {
        System.out.print(ANSI_BLACK);
        System.out.print(string + ln);
        System.out.print(ANSI_RESET);
    }

    public void red(String string) {
        System.out.print(ANSI_RED);
        System.out.print(string + ln);
        System.out.print(ANSI_RESET);
    }

    public void green(String string) {
        System.out.print(ANSI_GREEN);
        System.out.print(string + ln);
        System.out.print(ANSI_RESET);
    }

    public void yellow(String string) {
        System.out.print(ANSI_YELLOW);
        System.out.print(string + ln);
        System.out.print(ANSI_RESET);
    }

    public void blue(String string) {
        System.out.print(ANSI_BLUE);
        System.out.print(string + ln);
        System.out.print(ANSI_RESET);
    }

    public void purple(String string) {
        System.out.print(ANSI_PURPLE);
        System.out.print(string + ln);
        System.out.print(ANSI_RESET);
    }

    public void cyan(String string) {
        System.out.print(ANSI_CYAN);
        System.out.print(string + ln);
        System.out.print(ANSI_RESET);
    }

    public void white(String string) {
        System.out.print(ANSI_WHITE);
        System.out.print(string + ln);
        System.out.print(ANSI_RESET);
    }

}
