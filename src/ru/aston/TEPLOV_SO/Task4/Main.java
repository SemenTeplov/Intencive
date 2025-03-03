package ru.aston.TEPLOV_SO.Task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Админ\\IdeaProjects\\ExampleArrays\\src\\ru\\aston\\TEPLOV_SO\\Task4\\text.txt";

        try {
            System.out.println(readFile(path));
            writeFile(path, "Another text -- Antother ,,");
            System.out.println(readFile(path));
            joinFiles(path, path);
            System.out.println(readFile(path));
            changeStringOfFile(path, '$');
            System.out.println(readFile(path));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readFile(String path) throws IOException {
        FileReader input = null;

        try {
            input = new FileReader(path);
            int c;
            StringBuilder str = new StringBuilder();

            while ((c = input.read()) != -1) {
                str.append(Character.toChars(c));
            }

            return str.toString();
        }
        finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static void writeFile(String path, String text) throws IOException {
        FileWriter output = null;

        try {
            output = new FileWriter(path);
            int c;

            for (int i = 0; i < text.length(); i++) {
                output.write(text.charAt(i));
            }
        }
        finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static void joinFiles(String path1, String path2) {
        try {
            String str = readFile(path1) + " " + readFile(path2);

            writeFile(path1, str);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void changeStringOfFile(String path, char ch) {
        try {
            String str = readFile(path);
            StringBuilder outString = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))) {
                    outString.append(ch);
                }
                else {
                    outString.append(str.charAt(i));
                }
            }

            writeFile(path, outString.toString());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
