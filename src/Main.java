public class Main {
    public static void main(String[] args) {
        CaesarEncription ceasar = new CaesarEncription();
        String encryptedText = "Yaxcnlc mjcj oaxv dwjdcqxarinm jllnbb jwm nwbdan rwoxavjcrxw bnldarch.";
        String plainText;
        for (int i = 1; i <= 26; i++) {
            plainText = ceasar.Decription(encryptedText,i);
           // System.out.println(plainText);
        }

        String test = "Protect data from unauthorized access and ensure information security.";

        String encrypted = ceasar.vigenereEncrypt(test,"salah");
        System.out.println(encrypted);
        plainText = ceasar.vigenereDecrypt(encrypted,"salah");
        System.out.println(plainText);
    }
}