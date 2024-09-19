package section3_apis.part1_interfaces;

public class CaesarCypher implements EncryptionEngine {
    private final int shift = 3;

    @Override
    public String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char newChar = (char) ((c - 'A' - shift + 26) % 26 + 'A');
                encrypted.append(newChar);
            } else if (Character.isLowerCase(c)) {
                char newChar = (char) ((c - 'a' - shift + 26) % 26 + 'a');
                encrypted.append(newChar);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String encryptedMessage) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedMessage.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char newChar = (char) ((c - 'A' + shift) % 26 + 'A');
                decrypted.append(newChar);
            } else if (Character.isLowerCase(c)) {
                char newChar = (char) ((c - 'a' + shift) % 26 + 'a');
                decrypted.append(newChar);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
