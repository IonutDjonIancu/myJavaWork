package org.gameloft;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String option;

        do
        {
            displayMenuText();

            Scanner scanner0 = new Scanner( System.in );
            int n = scanner0.nextInt();

            option = "" + n;

            switch ( option )
            {
                case "0":
                    System.out.println("Bye");
                    System.exit(0);
                    break;

                case "1":
                    System.out.println("Enter a string to encrypt");
                    Scanner scanner1 = new Scanner( System.in );
                    String plainText = scanner1.nextLine();
                    System.out.println("enter a key");
                    Scanner keyScanner1 = new Scanner( System.in );

                    int key1 = keyScanner1.nextInt();
                    if( key1 < 1 || key1 > 25 )
                    {
                        System.out.println("Wrong/Invalid key");
                        System.exit(-1);
                    }
                    System.out.println( encrypt(plainText, key1) );
                    break;

                case "2":
                    System.out.println("Enter a string to decrypt");
                    Scanner scanner2 = new Scanner( System.in );
                    String cipherText = scanner2.nextLine();
                    System.out.println("enter a key");
                    Scanner keyScanner2 = new Scanner( System.in );

                    int key2 = keyScanner2.nextInt();
                    System.out.println( decrypt( cipherText, key2 ) );

                    if( key2 < 1 || key2 > 25 )
                    {
                        System.out.println("Wrong/Invalid key");
                        System.exit(-1);
                    }
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("========================");
        }
        while( option != "0" );




        // String secretMessage = "HELLOWORLD";




//        System.out.println(secretMessage);
//        String encryptedMessage = encrypt(secretMessage, shiftKey);
//
//        System.out.println(encryptedMessage);
//
//        String decryptedMessage = decrypt(encryptedMessage, shiftKey);
//        System.out.println(decryptedMessage);
    }

    static String encrypt(String message, int key)
    {
        key = key % 26 + 26;
        char[] messageChars = message.toCharArray();
        char[] tempArr = new char[messageChars.length];
        for(int i = 0; i< messageChars.length; i++)
        {
            tempArr[i] = (char) ( 'A' + (messageChars[i] - 'A' + key) % 26 );
        }

        return new String(tempArr);
    }

    static String decrypt(String encMessage, int key)
    {
        key = (26 - key) % 26 + 26;
//            key = ~key + 1;
        char[] messageChars = encMessage.toCharArray();
        char[] tempArr = new char[messageChars.length];
        for(int i = 0; i< messageChars.length; i++)
        {
            tempArr[i] = (char) ( 'A' + (messageChars[i] - 'A' + key) % 26 );
        }

        return new String(tempArr);
    }

    static void displayMenuText()
    {
        System.out.println("Press 1 to encrypt");
        System.out.println("Press 2 to decrypt");
        System.out.println("Press 0 to exit");
    }




}

