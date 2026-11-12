using System;

public class ReverseWords
{
    public static void Main()
    {
        string sentence = "To be or not to be.";
        string[] words = sentence.Split(' ');

        for (int i = 0; i < words.Length; i++)
        {
            string word = words[i];
            string punctuation = "";
            if (word.Length > 0 && ".!?,".Contains(word[word.Length - 1]))
            {
                punctuation = word[word.Length - 1].ToString();
                word = word.Substring(0, word.Length - 1);
            }
            char[] chars = word.ToCharArray();
            Array.Reverse(chars);
            words[i] = new string(chars) + punctuation;
        }

        string result = string.Join(" ", words);
        Console.WriteLine(result);
    }
}
