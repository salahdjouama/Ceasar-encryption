public class CaesarEncription {


    public CaesarEncription(){

    }

    public String Decription(String encrypted,int key){
        StringBuilder plainText = new StringBuilder();

        for (int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);
            if (Character.isUpperCase(ch)) {
                char decryptedChar = (char) (((ch - 'A' - key + 26) % 26) + 'A');
                plainText.append(decryptedChar);
            } else if (Character.isLowerCase(ch)) {
                char decryptedChar = (char) (((ch - 'a' - key + 26) % 26) + 'a');
                plainText.append(decryptedChar);
            } else {
                plainText.append(ch); // Non-alphabet characters remain the same
            }
        }
        return plainText.toString();
    }

    public String vigenereEncrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                int shift = key.charAt(keyIndex % key.length()) - 'a';
                char encryptedChar = (char) (((ch - 'A' + shift) % 26) + 'A');
                result.append(encryptedChar);
                keyIndex++;
            } else if (Character.isLowerCase(ch)) {
                int shift = key.charAt(keyIndex % key.length()) - 'a';
                char encryptedChar = (char) (((ch - 'a' + shift) % 26) + 'a');
                result.append(encryptedChar);
                keyIndex++;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String vigenereDecrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                int shift = key.charAt(keyIndex % key.length()) - 'a';
                char decryptedChar = (char) (((ch - 'A' - shift + 26) % 26) + 'A');
                result.append(decryptedChar);
                keyIndex++;
            } else if (Character.isLowerCase(ch)) {
                int shift = key.charAt(keyIndex % key.length()) - 'a';
                char decryptedChar = (char) (((ch - 'a' - shift + 26) % 26) + 'a');
                result.append(decryptedChar);
                keyIndex++;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

}
