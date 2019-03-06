package com.unitedinternet.Libary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Diese Klasse ist fuer die komplette Berechnung des Scores verantwortlich.
 * Jede Zeile wird weiter bearbeitet und anschliessend in einer Datei gespeichert.
 *
 * @author  Dominik Kunze
 * @since 1.0
 */
public class CalculateScoring {
    Scanner input;
    File file = null;

    /**
     * Oeffnet die angegebene Datei, damit diese weiter verarbeitet werden kann.
     *
     * @param   fileName
     *          Dateiname, der eingelesen werden soll.
     */
    public CalculateScoring(String fileName){
        try {
            file = new File(fileName);
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Berechnet die Scores jeder Zeile,
     * isId, isSummary, assetId, assetSummary und der Score der
     * jeweiligen Zeile wird in einer gleichnamigen endent mit _scoring
     * gespeichert.
     *
     * @see java.io.File
     * @see java.util.Scanner
     */
    public void calculateScores(){
        //Inizialisiere Klassen
        Evaluate evaluate = new Evaluate();

        StringBuilder totalScoreString = new StringBuilder("isId\tisSummary\tassetId\tassetSummary\tScore\n"); //Kopfzeile des Stringes der Ausgabe

        //Durchlaufe alle Zeilen der Ursprungsdatei und füg den Rückgabestring an totalScoreString an
        while(input.hasNextLine()) {
            totalScoreString.append(evaluate.evaluateAnswers(input.nextLine()));
        }

        new WriteToFile(file.getName()+"_scoring", totalScoreString.toString()); //Speichere die Rückgabe in neuer Datei
    }
}