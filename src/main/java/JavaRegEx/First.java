package JavaRegEx;

public class First {
    public static void main(String[] args) {
        String string = "abcDeeeeeeeeeF12GhiiiiijkL9abcDeee7";
        //System.out.println(string);

        String y = string.replaceAll("e{2,4}", "p");
        System.out.println(y);

        //REMOVE WHITE SPACE
        String hasWhiteSpace = "I have blanks and \ta tab, and a \nnew line ";
        //System.out.println(hasWhiteSpace.replaceAll("\\w", "a"));

    }
}
