/**
 * CSCI 1913 Daniel Kluver
 * Izra Bereket
 */

import java.lang.Math;

public class EvenOddCipher extends BaseCipher {
    public EvenOddCipher (){
        super("EvenOddCipher");
    }
    @Override
    /** Returns a srting by applying evenoddcipher into the input */
    public String encrypt(String letters){
        String evenEmpty = "";
        String oddEmpty = "";
        for (int i = 0; i < letters.length(); i++){
            if (i % 2 == 0){
                evenEmpty += letters.charAt(i);
            }
            else {
                oddEmpty += letters.charAt(i);
            }
        }
        return evenEmpty + oddEmpty;
    }
    @Override
    /** Returns a string of reversing the evenoddcipher into the input */
    public String decrypt(String letters){
        String decrypted = "";
        int position = (int) Math.ceil(letters.length() / 2.0);
        for (int i = 0; i < position; i++) {
            decrypted += letters.charAt(i);
            if (position + (i) < letters.length()) {
                decrypted += letters.charAt(position + i);
            }
        }
        return decrypted;
    }
    @Override
    /** Returns a string that describes the object */
    public String toString(){
        return "EvenOddCipher";
    }
    @Override
    /** Returns a boolean true if its passed as another evenoddcipher */
    public boolean equals(Object o){
        if (this == o) {
        return true;
        } else if (o == null) {
        return false;
        } else if (o instanceof EvenOddCipher) {
        EvenOddCipher cc = (EvenOddCipher) o;
        return this.getCipherName().equals(cc.getCipherName());
        } else {
        return false;
        }
    }
}
