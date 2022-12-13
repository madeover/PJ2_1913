/**
 * CSCI 1913 Daniel Kluver
 * Izra Bereket
 */

public class EncryptUtils {

    /** The function should return a new array of strings that is the result of encrypting each String using the cipher. */
    public static String[] encryptMany(BaseCipher cipher, String[] sumEncrypt){
        String newEncrypt[] = new String[sumEncrypt.length];
        for (int i = 0;i < sumEncrypt.length; i++){
            newEncrypt[i] = cipher.encrypt(sumEncrypt[i]);
        }
        return newEncrypt;
    }
    /** The function should return a new array of strings that is the result of decrypting each String using the cipher. */
    public static String[] decryptMany(BaseCipher cipher, String[] sumDecrypt){
        String newDecrypt[] = new String[sumDecrypt.length];
        for (int i = 0;i < sumDecrypt.length; i++){
            newDecrypt[i] = cipher.decrypt(sumDecrypt[i]);
        }
        return newDecrypt;
    }
    
}
