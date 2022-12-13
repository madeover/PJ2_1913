/**
 * CSCI 1913 Daniel Kluver
 * Izra Bereket
 */
public class CaesarCipher extends BaseCipher {
    private int keyValue;

    /** This is the constructor in which it rotates by a set integer  */
    public CaesarCipher(int keyValue){
        super("CaesarCipher");
        this.keyValue = keyValue;
    }
    @Override
    /** If within a certain range of rotatable numbers it will return a boolean value */
    public boolean isValid(){
        if (keyValue >= 1 & keyValue <= 25){
            return true;
        } else {
            return false;
        }
    }
    @Override
    /** This returns a string by implementing caesercipher from the input */
    public String encrypt(String given){
        given = given.toLowerCase();
        String newString = "";
        for (int i = 0; i < given.length(); i++) {
            if (Character.isLetter(given.charAt(i)) == true){
                char c = given.charAt(i);
                int j = (int) c;
                int k = j + keyValue;
                if ( k > 122){
                    k = k - 26;
                }
                char d = (char) k;
                newString += d;
            } else {
                newString += given.charAt(i);
            }
        }
        return newString;
    }
    @Override
    /** This returns a string by implementing a reverse caesercipher from the input */
    public String decrypt(String given){
        given = given.toLowerCase();
        String newString = "";

        for (int i = 0; i < given.length(); i++) {
            if (Character.isLetter(given.charAt(i))){
                char c = given.charAt(i);
                int j = (int) c;
                int k = j - keyValue;
                if ( k < 97){
                    k = k + 26;
                }
                char d = (char) k;
                newString += d;
            } else {
                newString += given.charAt(i);
            }
        }
        return newString;
    }
    @Override
    /** This returns a string that describes the object */
    public String toString(){
        return "Caesar" + "(" + keyValue + ")";
    }
    @Override
    /** returns a boolean type if another caesercipher is passed with the same rotational ammount */
    public boolean equals(Object o){
        if (this == o){
            return true;
        } else if (o == null){
            return false;
        } else if (o instanceof CaesarCipher){
            CaesarCipher cc = (CaesarCipher)o;
            return this.keyValue == cc.keyValue;
        } else {
            return false;
        }
    }

}
