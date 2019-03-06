package com.unitedinternet.Libary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Diese Klasse ist fuer die Speicherung in die Datei des gesammten Scores verantwortlich.
 *
 * @author  Dominik Kunze
 * @since   1.0
 */
public class WriteToFile {
    /**
     * Erstellt eine Datei mit angegebenen Namen und
     * schreibt einen angegebenen Text in diese.
     *
     * @param   fileName
     *          Namen der Datei, die erstellt und in diese reingeschrieben werden soll
     *
     * @param   text
     *          Text, der in die Datei geschrieben werden soll
     *
     * @see java.io.BufferedWriter
     * @see java.io.FileWriter
     */
    public WriteToFile(String fileName, String text){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
