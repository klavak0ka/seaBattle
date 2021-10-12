package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class player {
    Scanner scan = new Scanner(System.in);
    private char[][] enemyBoard =   {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
    private char[][] playerBoard =  {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

    public void createPlayerBoard(){
        int[] ships = {0, 4, 3, 2, 1}; //0 размером 0, 4 размером 1, 3 ращмером 2 и т.д.
        while (true) {
            System.out.print("Игрок, поставьте корабль: ");
            String[] position = scan.nextLine().split(" ");
            int x = Integer.parseInt(position[0]) - 1;
            int y = Integer.parseInt(position[1]) - 1;
            int orientation = Integer.parseInt(position[2]);
            int shipLength = Integer.parseInt(position[3]);
            int act = Integer.parseInt(position[4]);
            switch (shipLength){
                case 1:
                    if (ships[1] != 0){
                        putShip(playerBoard, x, y, orientation, shipLength, act);
                        if (act == 1) {
                            ships[1] -= 1;
                        }
                        else {
                            ships[1]++;
                        }
                    }
                case 2:
                    if (ships[2] != 0){
                        putShip(playerBoard, x, y, orientation, shipLength, act);
                        if (act == 1) {
                            ships[2] -= 1;
                        }
                        else {
                            ships[2]++;
                        }
                    }
                case 3:
                    if (ships[3] != 0){
                        putShip(playerBoard, x, y, orientation, shipLength, act);
                        if (act == 1) {
                            ships[3] -= 1;
                        }
                        else {
                            ships[3]++;
                        }
                    }
                case 4:
                    if (ships[4] != 0){
                        putShip(playerBoard, x, y, orientation, shipLength, act);
                        if (act == 1) {
                            ships[4] -= 1;
                        }
                        else {
                            ships[4]++;
                        }
                    }
            }
            int end = 0;
            for (int i : ships){
                if(i == 0){
                    end++;
                }
            }
            if (end != 0){
                System.out.println("Кораблей длины 1 - " + ships[1]);
                System.out.println("Кораблей длины 2 - " + ships[2]);
                System.out.println("Кораблей длины 3 - " + ships[3]);
                System.out.println("Кораблей длины 4 - " + ships[4]);
            }
            else {
                break;
            }
        }
    }

    private void putShip(char[][] playerBoard, int x, int y, int orientation, int shipLength, int act){
        if (orientation == 1) {
            if (act == 1) {
                for (int i = 0; i <= shipLength - 1; i++) {
                    playerBoard[y][i + x] = '□';
                }
            }
            else {
                for (int i = 0; i <= shipLength - 1; i++) {
                    playerBoard[y][i + x] = ' ';
                }
            }
        }
        else {
            if (act == 1) {
                for (int i = 0; i <= shipLength - 1; i++) {
                    playerBoard[i][i + y] = '□';
                }
            } else {
                for (int i = 0; i <= shipLength - 1; i++) {
                    playerBoard[i][i + y] = ' ';
                }
            }
        }
    }

    public char[][] getPlayerBoard(){
        return playerBoard;
    }

    public char[][] getEnemyBoard(){
        return enemyBoard;
    }

    public void setPlayerBoard(char[][] playerBoard){
        this.playerBoard = playerBoard;
    }

    public void setEnemyBoard(char[][] enemyBoard){
        this.enemyBoard = enemyBoard;
    }
}

