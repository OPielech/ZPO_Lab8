package edu.ib;

import android.annotation.SuppressLint;

public class Cantor {

    @SuppressLint("DefaultLocale")
    public String exchangeValues(double value, int indexFirst, int indexSecond) {
        double exchangedValue = 0;
        String result;

        if (indexFirst == indexSecond) {
            return "The same currencies are selected";
        } else {
            if (value < 200000) {
                if (indexFirst == 0 && indexSecond == 1) {
                    exchangedValue = (value * 0.9) - (0.2 / 100) * (value * 0.9);
                } else if (indexFirst == 0 && indexSecond == 2) {
                    exchangedValue = (value * 0.98) - (0.2 / 100) * (value * 0.98);
                } else if (indexFirst == 0 && indexSecond == 3) {
                    exchangedValue = (value * 0.75) - (0.2 / 100) * (value * 0.75);
                } else if (indexFirst == 0 && indexSecond == 4) {
                    exchangedValue = (value * 3.82) - (0.2 / 100) * (value * 3.82);
                } else if (indexFirst == 1 && indexSecond == 0) {
                    exchangedValue = (value * 1.11) - (0.2 / 100) * (value * 1.11);
                } else if (indexFirst == 1 && indexSecond == 2) {
                    exchangedValue = (value * 1.1) - (0.2 / 100) * (value * 1.1);
                } else if (indexFirst == 1 && indexSecond == 3) {
                    exchangedValue = (value * 0.84) - (0.2 / 100) * (value * 0.84);
                } else if (indexFirst == 1 && indexSecond == 4) {
                    exchangedValue = (value * 4.26) - (0.2 / 100) * (value * 4.26);
                } else if (indexFirst == 2 && indexSecond == 0) {
                    exchangedValue = (value * 1.02) - (0.2 / 100) * (value * 1.02);
                } else if (indexFirst == 2 && indexSecond == 1) {
                    exchangedValue = (value * 0.91) - (0.2 / 100) * (value * 0.91);
                } else if (indexFirst == 2 && indexSecond == 3) {
                    exchangedValue = (value * 0.76) - (0.2 / 100) * (value * 0.76);
                } else if (indexFirst == 2 && indexSecond == 4) {
                    exchangedValue = (value * 3.89) - (0.2 / 100) * (value * 3.89);
                } else if (indexFirst == 3 && indexSecond == 0) {
                    exchangedValue = (value * 1.33) - (0.2 / 100) * (value * 1.33);
                } else if (indexFirst == 3 && indexSecond == 1) {
                    exchangedValue = (value * 1.2) - (0.2 / 100) * (value * 1.2);
                } else if (indexFirst == 3 && indexSecond == 2) {
                    exchangedValue = (value * 1.31) - (0.2 / 100) * (value * 1.31);
                } else if (indexFirst == 3 && indexSecond == 4) {
                    exchangedValue = (value * 5.1) - (0.2 / 100) * (value * 5.1);
                } else if (indexFirst == 4 && indexSecond == 0) {
                    exchangedValue = (value * 0.21) - (0.2 / 100) * (value * 0.21);
                } else if (indexFirst == 4 && indexSecond == 1) {
                    exchangedValue = (value * 0.23) - (0.2 / 100) * (value * 0.21);
                } else if (indexFirst == 4 && indexSecond == 2) {
                    exchangedValue = (value * 0.26) - (0.2 / 100) * (value * 0.26);
                } else if (indexFirst == 4 && indexSecond == 3) {
                    exchangedValue = (value * 0.2) - (0.2 / 100) * (value * 0.2);
                }
            } else if (value >= 200000 && value < 1000000) {

                if (indexFirst == 0 && indexSecond == 1) {
                    exchangedValue = (value * 0.9) - (0.15 / 100) * (value * 0.9);
                } else if (indexFirst == 0 && indexSecond == 2) {
                    exchangedValue = (value * 0.98) - (0.15 / 100) * (value * 0.98);
                } else if (indexFirst == 0 && indexSecond == 3) {
                    exchangedValue = (value * 0.75) - (0.15 / 100) * (value * 0.75);
                } else if (indexFirst == 0 && indexSecond == 4) {
                    exchangedValue = (value * 3.82) - (0.15 / 100) * (value * 3.82);
                } else if (indexFirst == 1 && indexSecond == 0) {
                    exchangedValue = (value * 1.11) - (0.15 / 100) * (value * 1.11);
                } else if (indexFirst == 1 && indexSecond == 2) {
                    exchangedValue = (value * 1.1) - (0.15 / 100) * (value * 1.1);
                } else if (indexFirst == 1 && indexSecond == 3) {
                    exchangedValue = (value * 0.84) - (0.15 / 100) * (value * 0.84);
                } else if (indexFirst == 1 && indexSecond == 4) {
                    exchangedValue = (value * 4.26) - (0.15 / 100) * (value * 4.26);
                } else if (indexFirst == 2 && indexSecond == 0) {
                    exchangedValue = (value * 1.02) - (0.15 / 100) * (value * 1.02);
                } else if (indexFirst == 2 && indexSecond == 1) {
                    exchangedValue = (value * 0.91) - (0.15 / 100) * (value * 0.91);
                } else if (indexFirst == 2 && indexSecond == 3) {
                    exchangedValue = (value * 0.76) - (0.15 / 100) * (value * 0.76);
                } else if (indexFirst == 2 && indexSecond == 4) {
                    exchangedValue = (value * 3.89) - (0.15 / 100) * (value * 3.89);
                } else if (indexFirst == 3 && indexSecond == 0) {
                    exchangedValue = (value * 1.33) - (0.15 / 100) * (value * 1.33);
                } else if (indexFirst == 3 && indexSecond == 1) {
                    exchangedValue = (value * 1.2) - (0.15 / 100) * (value * 1.2);
                } else if (indexFirst == 3 && indexSecond == 2) {
                    exchangedValue = (value * 1.31) - (0.15 / 100) * (value * 1.31);
                } else if (indexFirst == 3 && indexSecond == 4) {
                    exchangedValue = (value * 5.1) - (0.15 / 100) * (value * 5.1);
                } else if (indexFirst == 4 && indexSecond == 0) {
                    exchangedValue = (value * 0.21) - (0.15 / 100) * (value * 0.21);
                } else if (indexFirst == 4 && indexSecond == 1) {
                    exchangedValue = (value * 0.23) - (0.15 / 100) * (value * 0.23);
                } else if (indexFirst == 4 && indexSecond == 2) {
                    exchangedValue = (value * 0.26) - (0.15 / 100) * (value * 0.26);
                } else if (indexFirst == 4 && indexSecond == 3) {
                    exchangedValue = (value * 0.2) - (0.15 / 100) * (value * 0.2);
                }
            } else if (value >= 1000000 && value < 3000000) {

                if (indexFirst == 0 && indexSecond == 1) {
                    exchangedValue = (value * 0.9) - (0.1 / 100) * (value * 0.9);
                } else if (indexFirst == 0 && indexSecond == 2) {
                    exchangedValue = (value * 0.98) - (0.1 / 100) * (value * 0.98);
                } else if (indexFirst == 0 && indexSecond == 3) {
                    exchangedValue = (value * 0.75) - (0.1 / 100) * (value * 0.75);
                } else if (indexFirst == 0 && indexSecond == 4) {
                    exchangedValue = (value * 3.82) - (0.1 / 100) * (value * 3.82);
                } else if (indexFirst == 1 && indexSecond == 0) {
                    exchangedValue = (value * 1.11) - (0.1 / 100) * (value * 1.11);
                } else if (indexFirst == 1 && indexSecond == 2) {
                    exchangedValue = (value * 1.1) - (0.1 / 100) * (value * 1.1);
                } else if (indexFirst == 1 && indexSecond == 3) {
                    exchangedValue = (value * 0.84) - (0.1 / 100) * (value * 0.84);
                } else if (indexFirst == 1 && indexSecond == 4) {
                    exchangedValue = (value * 4.26) - (0.1 / 100) * (value * 4.26);
                } else if (indexFirst == 2 && indexSecond == 0) {
                    exchangedValue = (value * 1.02) - (0.1 / 100) * (value * 1.02);
                } else if (indexFirst == 2 && indexSecond == 1) {
                    exchangedValue = (value * 0.91) - (0.1 / 100) * (value * 0.91);
                } else if (indexFirst == 2 && indexSecond == 3) {
                    exchangedValue = (value * 0.76) - (0.1 / 100) * (value * 0.76);
                } else if (indexFirst == 2 && indexSecond == 4) {
                    exchangedValue = (value * 3.89) - (0.1 / 100) * (value * 3.89);
                } else if (indexFirst == 3 && indexSecond == 0) {
                    exchangedValue = (value * 1.33) - (0.1 / 100) * (value * 1.33);
                } else if (indexFirst == 3 && indexSecond == 1) {
                    exchangedValue = (value * 1.2) - (0.1 / 100) * (value * 1.2);
                } else if (indexFirst == 3 && indexSecond == 2) {
                    exchangedValue = (value * 1.31) - (0.1 / 100) * (value * 1.31);
                } else if (indexFirst == 3 && indexSecond == 4) {
                    exchangedValue = (value * 5.1) - (0.1 / 100) * (value * 5.1);
                } else if (indexFirst == 4 && indexSecond == 0) {
                    exchangedValue = (value * 0.21) - (0.1 / 100) * (value * 0.21);
                } else if (indexFirst == 4 && indexSecond == 1) {
                    exchangedValue = (value * 0.23) - (0.1 / 100) * (value * 0.23);
                } else if (indexFirst == 4 && indexSecond == 2) {
                    exchangedValue = (value * 0.26) - (0.1 / 100) * (value * 0.26);
                } else if (indexFirst == 4 && indexSecond == 3) {
                    exchangedValue = (value * 0.2) - (0.1 / 100) * (value * 0.2);
                }

            } else {

                if (indexFirst == 0 && indexSecond == 1) {
                    exchangedValue = (value * 0.9) - (0.08 / 100) * (value * 0.9);
                } else if (indexFirst == 0 && indexSecond == 2) {
                    exchangedValue = (value * 0.98) - (0.08 / 100) * (value * 0.98);
                } else if (indexFirst == 0 && indexSecond == 3) {
                    exchangedValue = (value * 0.75) - (0.08 / 100) * (value * 0.75);
                } else if (indexFirst == 0 && indexSecond == 4) {
                    exchangedValue = (value * 3.82) - (0.08 / 100) * (value * 3.82);
                } else if (indexFirst == 1 && indexSecond == 0) {
                    exchangedValue = (value * 1.11) - (0.08 / 100) * (value * 1.11);
                } else if (indexFirst == 1 && indexSecond == 2) {
                    exchangedValue = (value * 1.1) - (0.08 / 100) * (value * 1.1);
                } else if (indexFirst == 1 && indexSecond == 3) {
                    exchangedValue = (value * 0.84) - (0.08 / 100) * (value * 0.84);
                } else if (indexFirst == 1 && indexSecond == 4) {
                    exchangedValue = (value * 4.26) - (0.08 / 100) * (value * 4.26);
                } else if (indexFirst == 2 && indexSecond == 0) {
                    exchangedValue = (value * 1.02) - (0.08 / 100) * (value * 1.02);
                } else if (indexFirst == 2 && indexSecond == 1) {
                    exchangedValue = (value * 0.91) - (0.08 / 100) * (value * 0.91);
                } else if (indexFirst == 2 && indexSecond == 3) {
                    exchangedValue = (value * 0.76) - (0.08 / 100) * (value * 0.76);
                } else if (indexFirst == 2 && indexSecond == 4) {
                    exchangedValue = (value * 3.89) - (0.08 / 100) * (value * 3.89);
                } else if (indexFirst == 3 && indexSecond == 0) {
                    exchangedValue = (value * 1.33) - (0.08 / 100) * (value * 1.33);
                } else if (indexFirst == 3 && indexSecond == 1) {
                    exchangedValue = (value * 1.2) - (0.08 / 100) * (value * 1.2);
                } else if (indexFirst == 3 && indexSecond == 2) {
                    exchangedValue = (value * 1.31) - (0.08 / 100) * (value * 1.31);
                } else if (indexFirst == 3 && indexSecond == 4) {
                    exchangedValue = (value * 5.1) - (0.08 / 100) * (value * 5.1);
                } else if (indexFirst == 4 && indexSecond == 0) {
                    exchangedValue = (value * 0.21) - (0.08 / 100) * (value * 0.21);
                } else if (indexFirst == 4 && indexSecond == 1) {
                    exchangedValue = (value * 0.23) - (0.08 / 100) * (value * 0.23);
                } else if (indexFirst == 4 && indexSecond == 2) {
                    exchangedValue = (value * 0.26) - (0.08 / 100) * (value * 0.26);
                } else if (indexFirst == 4 && indexSecond == 3) {
                    exchangedValue = (value * 0.2) - (0.08 / 100) * (value * 0.2);
                }
            }
        }
        result = String.format("%.2f", exchangedValue);
        return result;
    }//end of exchangeValues

}//end of class
