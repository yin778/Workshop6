public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String punctuation = "";
            // Keep a trailing punctuation mark at the end of the word
            if (word.matches(".*[.,!?]$")) {
                punctuation = word.substring(word.length() - 1);
                word = word.substring(0, word.length() - 1);
            }
            words[i] = new StringBuilder(word).reverse().toString() + punctuation;
        }

        String result = String.join(" ", words);
        System.out.println(result);
    }
}
