/**
 * CSCI 1913 Daniel Kluver
 * Izra Bereket
 */


/**
 * The point of this is to swap each occurrence of one word for a pre chosen replacement
 */
public class WordReplacementCipher extends BaseCipher{
    String replaceFrom;
    String replaceTo;
    /** This takes in two strings representing the word replaced from and replaced to */
    public WordReplacementCipher(String replaceFrom, String replaceTo){
        super("WordReplacementCipher");
        this.replaceFrom = replaceFrom;
        this.replaceTo = replaceTo;
    }
    @Override
    /** This returns a string that applies the wordreplacement to the parameter input */
    public String encrypt(String inputString){
        return inputString.replace(replaceFrom, replaceTo);
    }
    @Override
    /** This reverses the wordreplacement parameter input */
    public String decrypt(String inputString){
        return inputString.replace(replaceTo, replaceFrom);
    }
    @Override
    /** This returns the string that describes the object */
    public String toString(){
        return "WordReplacementCipher(" + replaceFrom + ", " + replaceTo + ")";
    }
    @Override
    /** This returns a boolean if the wordreplacementcipher is passed as the same
     * with the same from and to words
    */
    public boolean equals(Object a){
        if (this == a){
            return true;
        } else if (a == null) {
            return false;
        } else if (a instanceof WordReplacementCipher) {
            WordReplacementCipher cc = (WordReplacementCipher) a;
            return (this.replaceFrom + this.replaceTo) .equals (cc.replaceFrom + cc.replaceTo);
        } else {
            return false;
        }
    }  
}