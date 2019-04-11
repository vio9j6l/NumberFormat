package com.company;

public class NumberFormat
{
    public static void testNumber(String number)
    {
        try
        {
            new Integer(number);
            System.out.println(number + " is an integer.");
            return;
        }
        catch (NumberFormatException notAnInt)
        {
            try
            {
                new Double(number);
                System.out.println(number + " is a floating-point number.");
                return;
            }
            catch (NumberFormatException notAFloat)
            {
                System.out.println(number + " is not a number at all.");
            }
        }
    }
    public static void main(String[] argv)
    {
        testNumber("1");
        testNumber("2.3");
        testNumber("ABC");
    }
}

