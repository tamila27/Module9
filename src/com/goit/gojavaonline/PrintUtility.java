package com.goit.gojavaonline;

import java.util.List;

public class PrintUtility {
    private static final String FORMAT_STRING = "| %-10s | %-10s |\n";
    public static StringBuilder listToString(List<? extends Printable> printableList){
        StringBuilder result = new StringBuilder();
        for(Printable printable : printableList){
            result.append(printable.print()).append("\n");
        }
        return result;
    }

    public static StringBuilder listToTable(List<? extends Printable> printableList){
        StringBuilder result = new StringBuilder();
        for(Printable printable : printableList){
            result.append(String.format(FORMAT_STRING, printable.printTableLine() ));
        }
        return result;
    }

    public static StringBuilder listToEncryptedTable(List<? extends Printable> printableList){
        StringBuilder result = new StringBuilder();
        for(Printable printable : printableList){
            StringBuilder[] encryptedTableLine = new StringBuilder[printable.printTableLine().length];
            for(int i = 0; i < printable.printTableLine().length; i++){
                encryptedTableLine[i] = EncryptionUtility.encryptString(printable.printTableLine()[i]);
            }
            result.append(String.format(FORMAT_STRING, encryptedTableLine));
        }
        return result;
    }

    public static StringBuilder listToDecryptedTable(List<? extends Printable> printableList){
        StringBuilder result = new StringBuilder();
        for(Printable printable : printableList){
            StringBuilder[] decryptedTableLine = new StringBuilder[printable.printTableLine().length];
            for(int i = 0; i < printable.printTableLine().length; i++){
                decryptedTableLine[i] = EncryptionUtility.decryptString(printable.printTableLine()[i]);
            }
            result.append(String.format(FORMAT_STRING, decryptedTableLine));
        }
        return result;
    }
}
