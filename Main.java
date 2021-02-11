package com.game;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        Game Play = new Game();
        Play.GamePlay();
        while (true)
        {
            int restart;
            System.out.println("\n If You want to Restart the Game then enter 1: Otherwise enter any number: ");
            restart = get.nextInt();
            if (restart == 1)
            {
                Play.GamePlay();
            } else {
                break;
            }
        }
    }
}
