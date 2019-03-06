package com.unitedinternet;

import com.unitedinternet.Libary.CalculateScoring;

/**
 * Dieses Programm soll den Score aus mehreren Antworten von einer Datei berechnen.
 * Die berechneten Scores werden mit isId, isSummary, assetId und assetSummary
 * in einer neuen Datei gespeichert.
 *
 * @author  Dominik Kunze
 * @version 1.1
 */
public class Main {
    /**
     * Hauptprogramm.
     *
     * @param   args
     *          Kommandozeilenparameter (erster Parameter ist die Datei mit den Antworten)
     */
    public static void main(String[] args) {
        //Inizialisiere Klassen
        CalculateScoring cs = new CalculateScoring(args[0]);

        //Berechne Score
        cs.calculateScores();
    }
}
