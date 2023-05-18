package Juego;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;

public class Domino {

    private int left;
    private int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    @Override
    public String toString() {
        return left + ":" + right;
    }

    public void girarFicha() {
        int temp = left;
        left = right;
        right = temp;
    }

    public boolean esUnDouble() {
        return left == right;
    }

    public static ArrayList<Domino> generateAllTokens(int maxNum) {
        ArrayList<Domino> tokens = new ArrayList<>();
        for (int i = 0; i <= maxNum; i++) {
            for (int j = 0; j <= maxNum; j++) {

                tokens.add(new Domino(i, j));
            }
        }
        return tokens;
    }

    public static void main(String[] args) {
        ArrayList<Domino> tokens = Domino.generateAllTokens(6);

        // Shuffle the tokens
        for (int i = 0; i < tokens.size(); i++) {
            int randomIndex = (int) (Math.random() * tokens.size());
            Domino temp = tokens.get(i);
            tokens.set(i, tokens.get(randomIndex));
            tokens.set(randomIndex, temp);
        }

        // Create a hand and a table
        ArrayList<Domino> hand = new ArrayList<>();
        ArrayList<Domino> table = new ArrayList<>();

        // Deal 7 tokens to the hand
        for (int i = 0; i < 7; i++) {
            hand.add(tokens.remove(0));
        }
        boolean NoPlayableToken = false;
        // Keep playing until the hand is empty
        while (!(hand.isEmpty() || NoPlayableToken) && !tokens.isEmpty()) {
            // Find the first token that can be played
            for (int i = 0; i < hand.size(); i++) {

                //for (Domino token : hand) {
                if (table.isEmpty()) {
                    for (int j = 0; j < hand.size(); j++) {
                        if (hand.get(j).esUnDouble() && table.isEmpty()) {
                            table.add(hand.get(j));
                            hand.remove(j);
                        } else {
                            System.out.println("Falta algo...");
                            if (!hand.isEmpty() && !tokens.isEmpty()) {
                                hand.add(tokens.remove(0));
                            }
                        }

                    }

                    continue;
                }
                if (hand.get(i).getLeft() == table.get(0).getLeft() || hand.get(i).getLeft() == table.get(table.size()-1).getRight()) {
                    hand.get(i).girarFicha();
                    table.add(hand.get(i));
                    hand.remove(i);

                } else if (hand.get(i).getRight() == table.get(0).getLeft() || hand.get(i).getRight() == table.get(table.size()-1).getRight()) {

                    table.add(hand.get(i));
                    hand.remove(i);
                }
            }

            // If no token can be played, draw a new token from the stock
            if (hand.isEmpty() && !tokens.isEmpty()) {
                hand.add(tokens.remove(0));
            } else {
                for (Domino domino : hand) {
                    int cntTodas = 0;
                    if (table.get(0).left != (domino.right) && table.get(table.size() - 1).right != domino.left) {
                        cntTodas++;
                        if (cntTodas == hand.size()) {
                            NoPlayableToken = true;
                        }
                    }
                }
            }
            System.out.println("\nHand: ");
            for (Domino token : hand) {
                System.out.print(token + " ");
            }
            System.out.println("");
        }

        // Print the table
        System.out.println("Table:");
        for (Domino token : table) {
            System.out.print(token + " ");

        }

    }
}
