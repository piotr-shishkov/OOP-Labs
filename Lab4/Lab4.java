package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Lab4 {

    public static void main(String[] args) throws Exception
    {
        System.out.println("\nReading from One Expression");
        ReadExpressionsFromFile("src/com/company/one_expression.txt");
        System.out.println("\nReading from Three Expression");
        ReadExpressionsFromFile("src/com/company/three_expressions.txt");
    }

    public static void ReadExpressionsFromFile(String path) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        while(true)
        {
            var str = reader.readLine();
            if(str == null) break;
            System.out.println("\nFound expression: " + str);
            System.out.println("Expression - " + CheckExpression(str));
        }
    }

    public static String CheckExpression(String ex)
    {
        if (ex.isEmpty())
            return "Empty";

        Stack<Character> cStack = new Stack<Character>();
        for (int i = 0; i < ex.length(); i++)
        {
            char curChar = ex.charAt(i);
            if (curChar == '{' || curChar == '(' || curChar == '[')
            {
                cStack.push(curChar);
            }
            else if (curChar == '}' || curChar == ')' || curChar == ']')
            {
                if (cStack.isEmpty())
                    return "Not Correct";

                char lastChar = cStack.peek();

                if (curChar == '}' && lastChar == '{' || curChar == ')' && lastChar == '(' || curChar == ']' && lastChar == '[')
                    cStack.pop();
                else return "Not Correct";
            }
        }
        if(cStack.isEmpty()) return "Correct";
        else return "Not Correct";
    }
}
