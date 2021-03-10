package com.techreturners.exercise001;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt((0));
    }

    public double addVat(double originalPrice, double vatRate) {
        DecimalFormat df = new DecimalFormat("##.##");
        Double vat = (vatRate / 100) * originalPrice;
        Double totalAmount = originalPrice + vat;

        return (Double.parseDouble(df.format(totalAmount)));
    }

    public String reverse(String sentence) {
        String revSentence = "";
        for (int i=sentence.length()-1; i >= 0; i-- )
            revSentence = revSentence + sentence.charAt(i);
        return revSentence;
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (User countUser: users)
            if (countUser.getType() == "Linux")
                count++;
        return count;
    }
}
