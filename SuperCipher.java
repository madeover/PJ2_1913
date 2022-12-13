import java.util.Arrays;
/**
 * CSCI 1913 Daniel Kluver
 * Izra Bereket
 */
public class SuperCipher extends BaseCipher{
    BaseCipher [] cipherBase;
    /** This initalizaes an array from basecipher */
    public SuperCipher(BaseCipher [] cipherBase){
        super("SuperCipher");
        this.cipherBase = cipherBase;
    }
    /** Checks if its valid using the function and returns if it is or isnt */
    public boolean isValid(){
        for (int i = 0; i < cipherBase.length; i++){
            if(cipherBase[i].isValid() == false){
                return false;
            }
        }
        return true;
    }
    /** This encrypts and returns a string resulting after each cipher is added on */
    public String encrypt(String text){
        for (int i = 0; i < cipherBase.length; i++){
            text = cipherBase[i].encrypt(text);
        }
        return text;
    }
    /** This decrypts and returns a string resulting after each cipher is added on */
    public String decrypt(String text){
        for (int i = 0; i < cipherBase.length; i++){
            text = cipherBase[i].decrypt(text);
        }
        return text;
    }
    /** Returns a string thats formatted from the test files */
    public String toString(){
        String returnedMessage = "";
        for (int i = 0; i < cipherBase.length; i++){
            returnedMessage += cipherBase[i].toString(); 
            if (i != cipherBase.length - 1){
                returnedMessage += " | ";
            }
        }
        return "SuperCipher(" + returnedMessage + ")";
    }
    /** A superCipher is equal to another SuperCipher if and only if it’s chain of ciphers match */
    public boolean equals(Object o){
        if (this == o){
            return true;
        } else if (o == null) {
            return false;
        } else if (o instanceof SuperCipher){
            SuperCipher lr = (SuperCipher) o;
            return Arrays.equals(this.cipherBase, lr.cipherBase); 
        } else {
            return false;
        }

    }
}
