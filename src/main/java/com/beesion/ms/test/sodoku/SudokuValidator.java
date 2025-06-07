package com.beesion.ms.test.sodoku;

import java.util.HashSet;

public class SudokuValidator {

    public static boolean isValidSudoku(char[][] board) {
        // Cada arreglo es de tamaño [9][9], uno por fila/columna/caja
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if (c == '.') continue;

                int num = c - '1'; // convierte '1'..'9' a índice 0..8
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Si ya vimos ese número en fila/columna/caja, inválido
                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // Marcar como visto
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}

