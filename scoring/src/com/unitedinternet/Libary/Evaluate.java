package com.unitedinternet.Libary;

import com.unitedinternet.Configuration.Config;

/**
 * Diese Klasse ist fuer die Berechnung des Scores verantwortlich.
 *
 * @author  Dominik Kunze
 * @since   1.1
 */
public class Evaluate implements Config{
    /**
     * Berechnet aus den Antworten der angegebenen Zeile
     * den Score. Alle Antworten, die nicht "yes" sind, werden
     * als "no" gewertet. Die Scorewerte sind in der Config gespeichert.
     * @param   line
     *          Ein String, welcher eine Zeile enthaelt, die ausgewertet werden soll.
     *
     * @see com.unitedinternet.Configuration.Config
     */
    public String evaluateAnswers(String line){

        String [] splits = line.split(DIVIDE_COLUMNS_CHARACTER); // Trennt Zeil mit definierten Trennzeichen

        int score = 0;
        for (int i = 0; i <= COLUMS_NUMBER; i++) {

            // Prüft, ob die Antwort "yes" ist
            if (splits[i + ANSWER_BEGIN_SPLIT_NUM].equalsIgnoreCase("yes")) {
                score += QUESTION_SCORING[i][0]; // Addiert den entnommenden Score für "yes" zum gesammten Score
            } else {
                score += QUESTION_SCORING[i][1]; // Addiert den entnommenden Score für "no" zum gesammten Score
            }
        }

        //Gebe die Ausgewertete Zeile mit den Spalten isId, isSummary, assetId, assetSummary sowie dem Score zurück
        return String.join(DIVIDE_COLUMNS_CHARACTER,splits[1],splits[2],splits[4],splits[5],String.valueOf(score),"\n");
    }
}