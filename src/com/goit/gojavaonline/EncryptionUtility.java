package com.goit.gojavaonline;

import java.util.ArrayList;
import java.util.List;

public class EncryptionUtility {
    private static int key = 1;
    private static List<Character> alphabet;
    static {
        alphabet = new ArrayList<>();
        for (char c='A'; c<='Z'; c++){
            alphabet.add(c);
        }
        for (char c='a'; c<='z'; c++){
            alphabet.add(c);
        }
    }

    public static StringBuilder encryptString(String sourceString){
        char[] sourceArray = sourceString.toCharArray();
        char[] encryptedArray = new char[sourceArray.length];
        for(int i = 0; i < sourceArray.length; i++){
            encryptedArray[i] = encryptChar(sourceArray[i]);
        }
        StringBuilder encryptedString = new StringBuilder();
        encryptedString.append(encryptedArray);

        return encryptedString;
    }

    public static char encryptChar(char symbolForEncryption){
        char encryptedCharacter;
        int characterIndexInAlphabet = getCharacterIndexInAlphabet(symbolForEncryption);
        if(characterIndexInAlphabet == -1){
            encryptedCharacter = symbolForEncryption;
        }
        else{
            encryptedCharacter = alphabet.get( (characterIndexInAlphabet + key) % alphabet.size());
        }
        return encryptedCharacter;
    }

    public static int getCharacterIndexInAlphabet(Character sourceCharacter){
        int index = -1;
        for(int i = 0; i < alphabet.size(); i++){
            if(alphabet.get(i).equals(sourceCharacter) ){
                index = i;
            }
        }
        return index;
    }

    public static StringBuilder decryptString(String encryptedString){
        char[] encryptedArray = encryptedString.toCharArray();
        char[] decryptedArray = new char[encryptedArray.length];

        for(int i = 0; i < encryptedArray.length; i++){
            decryptedArray[i] = decryptChar(encryptedArray[i]);
        }
        StringBuilder decryptedString = new StringBuilder();
        decryptedString.append(decryptedArray);

        return decryptedString;
    }

    public static char decryptChar(char symbolForDecryption){
        char encryptedCharacter;
        int charIndexInAlphabet = getCharacterIndexInAlphabet(symbolForDecryption);
        if(charIndexInAlphabet == -1){
            encryptedCharacter = symbolForDecryption;
        }
        else {
            encryptedCharacter = alphabet.get(( charIndexInAlphabet - key + alphabet.size()) % alphabet.size());
        }

        return encryptedCharacter;
    }
}
