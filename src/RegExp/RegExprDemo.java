package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExprDemo {
    public static void main(String args[]) {
        RegExpr r = new RegExpr();
        r.RegExp();
        System.out.println("------------------------------------------------------------------------------");
        RegExpr2 r2 = new RegExpr2();
        r2.RegExp();
        System.out.println("------------------------------------------------------------------------------");
        RegExpr3 r3 = new RegExpr3();
        r3.RegExp();
        System.out.println("------------------------------------------------------------------------------");
        RegExpr4 r4 = new RegExpr4();
        r4.RegExp();
        System.out.println("------------------------------------------------------------------------------");
        RegExpr5 r5 = new RegExpr5();
        r5.RegExp();
        System.out.println("------------------------------------------------------------------------------");
        RegExpr6 r6 = new RegExpr6();
        r6.RegExp();
        System.out.println("------------------------------------------------------------------------------");
        RegExpr7 r7 = new RegExpr7();
        r7.RegExp();
        System.out.println("------------------------------------------------------------------------------");
        RegExpr8 r8 = new RegExpr8();
        r8.RegExp();
        System.out.println("------------------------------------------------------------------------------");
        RegExpr9 r9 = new RegExpr9();
        r9.RegExp();
        System.out.println("------------------------------------------------------------------------------");
    }
}

// A simple pattern matching demo.
class RegExpr {
    void RegExp() {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");

        found = mat.matches(); // check for a match

        System.out.println("Testing Java against Java.");
        if (found) System.out.println("Matches");
        else System.out.println("No Match");

        System.out.println();

        System.out.println("Testing Java against Java 8.");
        mat = pat.matcher("Java 8"); // create a new matcher

        found = mat.matches(); // check for a match

        if (found) System.out.println("Matches");
        else System.out.println("No Match");
    }
}

class RegExpr2 {
    void RegExp() {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 8");

        System.out.println("Looking for Java in Java 8.");

        if (mat.find()) System.out.println("subsequence found");
        else System.out.println("No Match");
    }
}

class RegExpr3 {
    void RegExp() {
        Pattern pat = Pattern.compile("test");
        Matcher mat = pat.matcher("test 1 2 3 test");

        while (mat.find()) {
            System.out.println("test found at index " +
                    mat.start());
        }
    }
}

class RegExpr4 {
    void RegExp() {
        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW");

        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}


class RegExpr5 {
    void RegExp() {
        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}


class RegExpr6 {
    void RegExp() {
        // Use reluctant matching behavoir.
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}


class RegExpr7 {
    void RegExp() {
        // Match lowercase words.
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}


class RegExpr8 {
    void RegExp() {
        String str = "Jon Jonathan Frank Ken Todd";

        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);

        System.out.println("Original sequence: " + str);

        str = mat.replaceAll("Eric ");

        System.out.println("Modified sequence: " + str);

    }
}

class RegExpr9 {
    void RegExp() {

        // Match lowercase words.
        Pattern pat = Pattern.compile("[ ,.!]");

        String strs[] = pat.split("one two,alpha9 12!done.");

        for (int i = 0; i < strs.length; i++)
            System.out.println("Next token: " + strs[i]);

    }
}