package fourth;

import java.util.Arrays;

public class Fourth {
    public static StringBuilder capitalize(String textString){

        StringBuilder StringVariable = new StringBuilder();
        String SomeText = textString;

        for (int checkAsci: SomeText.toCharArray()) {

            if(checkAsci>=97 && checkAsci<=122 ){
                checkAsci-= 32;
                StringVariable.append((char)checkAsci);
            }
            else{
                StringVariable.append((char)checkAsci);
            }
        }

        return StringVariable;

    }

    public static StringBuilder firstLetterCapitialize(String textString){

        StringBuilder tempString = new StringBuilder();
        StringBuilder mainString = new StringBuilder();

        String someText = textString;
        String[] words = someText.split("\\s");


        for (String tempStringLitral:words) {
            int checkAsci =  tempStringLitral.charAt(0);

            if(checkAsci>=97 && checkAsci<=122 ){
                checkAsci-= 32;
                tempString.append(tempStringLitral);
                tempString.setCharAt(0 , (char)checkAsci);
                mainString.append(tempString + " ");
                tempString.setLength(0);
            }
            else{
                mainString.append(tempStringLitral + " ");
            }
        }

        return mainString;
    }

}
