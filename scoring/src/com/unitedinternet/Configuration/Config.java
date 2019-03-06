package com.unitedinternet.Configuration;

/**
 * Die Config beinhaltet alle Konfigurationen sowie die Scorewertung.
 *
 * @author  Dominik Kunze
 * @since   1.0
 */
public interface Config {
    /**
     * Trennzeichen der jeweiligen Spalten in der Ursprungsdatei
     * @since   1.1
     */
    String DIVIDE_COLUMNS_CHARACTER = "\t";
    /**
     * Splitnummer, bei der die Antworten beginnen
     * @since   1.1
     */
    int ANSWER_BEGIN_SPLIT_NUM = 6;
    /**
     * Anzahl der Spalten
     * @since   1.1
     */
    int COLUMS_NUMBER = 24;
    /**
     * Die verschiedenen Scores auf "Yes" und "No" der jeweiligen Fragen
     */
    int [][] QUESTION_SCORING = { // yes, no
            {0,-1300},
            {1300,0},
            {0,-80},
            {-80,0},
            {8,0},
            {13,0},
            {8,0},
            {-3,0},
            {13,0},
            {5,0},
            {8,0},
            {-8,0},
            {8,0},
            {13,0},
            {-5,0},
            {13,0},
            {5,0},
            {3,0},
            {-8,8},
            {-5,5},
            {-5,5},
            {0,5},
            {-3,3},
            {-8,8},
            {-13,13}
    };
}
