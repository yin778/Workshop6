public class Decoder {
    public static void main(String[] args) {
        // plain letters a-z and the coded letter in the same column
        String plain = "abcdefghijklmnopqrstuvwxyz";
        String coded = "crgzavibsdoeqfhujxkelwmynpt";

        String message = "G tgsl Qefe.";
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                int index = plain.indexOf(lower);
                char out = coded.charAt(index);
                if (Character.isUpperCase(ch)) {
                    out = Character.toUpperCase(out);
                }
                decoded.append(out);
            } else {
                decoded.append(ch); // keep spaces and punctuation
            }
        }

        System.out.println("Coded:   " + message);
        System.out.println("Decoded: " + decoded);
    }
}
