public class NumberOperations
{
    public static void main(String[] args)
    {
        int a = 15;
        a += 5;
        a -= 4;

        int b = a;
        b++;

        boolean firstCondition = b % 2 != 0;
        boolean secondCondition = (b * (b + 1)) % 3 == 0;
        if (firstCondition && secondCondition)
            System.out.println("Both conditions are met.");
        else
            System.out.println("One or both conditions are not met.");
    }
}
