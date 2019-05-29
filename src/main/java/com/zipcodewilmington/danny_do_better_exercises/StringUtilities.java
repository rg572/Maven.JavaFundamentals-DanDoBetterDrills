package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello" + " " + "World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment.concat(secondSegment);
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return String.format("%d%s",firstSegment, secondSegment);
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        if(input.length() < 3){
            return input;
        }
        else {
            return input.substring(0,3);
        }
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        if(input.length() < 3){
            return input;
        }
        else {
            return input.substring(input.length()-3);
        }
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        // as an exercise, lets try a "dumb" compare:
        if(inputValue.length() != comparableValue.length()){
            return false;
        }

        for(int i = 0; i < inputValue.length(); i++){
            if(inputValue.charAt(i) != comparableValue.charAt(i)){
                return false;
            }
        }

        return true;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        if(inputValue.length()%2 == 0){
            return inputValue.charAt((inputValue.length()/2)-1);
        }
        else {
            return inputValue.charAt((inputValue.length()-1)/2);
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        int spaceInd = spaceDelimitedString.indexOf(' ');
        if(spaceInd == -1){
            return spaceDelimitedString; // variable name is a lie!
        }
        else{
            return(spaceDelimitedString.substring(0,spaceInd));
        }
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        int spaceInd1 = spaceDelimitedString.indexOf(' ');
        if(spaceInd1 == -1 || spaceInd1 == spaceDelimitedString.length()-1){
            return spaceDelimitedString;
        }

        int spaceInd2 = spaceDelimitedString.indexOf(' ', spaceInd1 + 1);
        if(spaceInd2 == -1){
            return spaceDelimitedString.substring(spaceInd1 + 1);
        }
        else{
            return spaceDelimitedString.substring(spaceInd1 + 1, spaceInd2);
        }

    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        StringBuilder sbuild = new StringBuilder();
        for(int i = stringToReverse.length()-1; i > -1; i--){
            sbuild.append(stringToReverse.charAt(i));
        }
        return sbuild.toString();
    }
}
