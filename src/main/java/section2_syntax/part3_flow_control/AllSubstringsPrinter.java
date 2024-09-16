/*
 * Copyright (c) 2014 Michiel Noback
 * All rights reserved
 * www.bioinf.nl, www.cellingo.net
 */
package section2_syntax.part3_flow_control;

/**
 *
 * @author michiel
 */
public class AllSubstringsPrinter {
    /**
     * main method serves development purposes only.
     *
     * @param args the args
     */
    public static void main(String[] args) {
        final AllSubstringsPrinter asp = new AllSubstringsPrinter();
        asp.printAllSubstrings("GATCG", true, false);
    }

    /**
     * Given a String object, it should print all possible substrings of it where
     * in each iteration the rightmost character is left out.
     *
     * @param stringToSubstring the string to substring
     */
    public void printSubstringsLeftAlignedLeftTruncated(String stringToSubstring) {
        for (int i = 0; i < stringToSubstring.length(); i++) {
            String subString = stringToSubstring.substring(i, stringToSubstring.length());
            System.out.println(subString);
        }
    }

    /**
     * Prints all possible substrings according to arguments. You can make use of {@link #createSpacer(int length) createSpacer} method.
     *
     * @param stringToSubstring the string to substring
     * @param leftTruncated     flag to indicate whether the substrings should be truncated from the left (or the right)
     * @param leftAligned       flag to indicate whether the substrings should be printed left-aligned (or right-aligned)
     */
    public void printAllSubstrings(String stringToSubstring, boolean leftTruncated, boolean leftAligned) {
        int length = stringToSubstring.length();

        if (leftTruncated) {

            for (int i = 0; i < length; i++) {
                String subString = stringToSubstring.substring(i);
                if (leftAligned) {
                    System.out.println(subString);
                } else {

                    System.out.println(createSpacer(length - subString.length()) + subString);
                }
            }
        } else {

            for (int i = 0; i < length; i++) {
                String subString = stringToSubstring.substring(0, length - i);
                if (leftAligned) {
                    System.out.println(subString);
                } else {

                    System.out.println(createSpacer(i) + subString);
                }
            }
        }
    }

    /**
     * Creates a string with spaces of the given length.
     *
     * @param length the length of the spacer
     * @return a string containing spaces
     */
    private String createSpacer(int length) {
        return " ".repeat(length);
    }
}