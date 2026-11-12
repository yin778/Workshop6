using System;
using System.Text;

public class Boxes
{
    private int size;
    private const int MaxSize = 10;

    public Boxes(int size)
    {
        SetSize(size);
    }

    public void SetSize(int size)
    {
        if (size > MaxSize) size = MaxSize;
        else if (size < 1) size = 1;
        this.size = size;
    }

    public override string ToString()
    {
        return $"{size} x {size}";
    }

    public void Draw()
    {
        string horizontal = Repeat("-", size);
        string spaces = Repeat(" ", size - 2);
        Console.WriteLine(horizontal);
        for (int i = 0; i < size - 2; i++)
        {
            Console.WriteLine("|" + spaces + "|");
        }
        Console.WriteLine(horizontal);
    }

    private string Repeat(string s, int n)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.Append(s);
        return sb.ToString();
    }
}

public class BoxDriver
{
    public static void Main()
    {
        Boxes small = new Boxes(3);
        Console.WriteLine(small.ToString());
        small.Draw();

        Boxes large = new Boxes(10);
        Console.WriteLine(large.ToString());
        large.Draw();
    }
}
