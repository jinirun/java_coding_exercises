package com.techreturners.exercise001;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0) + "." + lastName.charAt((0));
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        //DecimalFormat vat = new DecimalFormat("#.00");
        //DecimalFormat total = new DecimalFo;
        Double vat = (vatRate / 100) * originalPrice;

        return Math.round(originalPrice + vat);
    }

    public String reverse(String sentence) {
        // Add your code here
        String revSentence = "";
        for (int i=sentence.length()-1; i >= 0; i-- )
            revSentence = revSentence + sentence.charAt(i);
        return revSentence;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count = 0;
        for (User countUser: users)
            if (countUser.getType() == "Linux")
                count++;
        return count;
    }
}
