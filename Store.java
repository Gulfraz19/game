package com.game;

import java.util.Scanner;

public class Store
{
    Scanner get = new Scanner(System.in);
    public void buyAnimal(Player gameplayers[], int k)
    {
        while (true) //this loop is used to handle the control of Buy the Animals
        {
            int choice2; //this variable is used to select the Animal Type
            System.out.println("\n Enter 1 for Buy the Cat: 3000SEK for Cat ");
            System.out.println(" Enter 2 for Buy the Dog: 5000SEK for Dog  ");
            System.out.println(" Enter 3 for Buy the Horse: 15000SEK for Horse ");
            System.out.println(" Enter 4 for Buy the Cow: 20000SEK for Cow ");
            System.out.println(" Enter 5 for Buy the Buffalo: 25000 for Buffalo ");
            choice2 = get.nextInt();
            if (choice2 == 1)
            {
                if (gameplayers[k].getMoney()>=3000)
                {
                    gameplayers[k].cats[gameplayers[k].total_cat] = new Cat();
                    String name, gender;
                    System.out.println("\n Enter the Cat Name= ");
                    get.nextLine(); name = get.nextLine();
                    System.out.println(" Gender of Cat: Enter 1 for Female and 2 for Male:  ");
                    int gen;
                    while(true)
                    {
                        gen = get.nextInt();
                        if(gen ==1)
                        {
                            gender = "Female";
                            break;
                        }
                        else if(gen==2)
                        {
                            gender = "Male";
                            break;
                        }
                        else
                        {
                            System.out.println("\n You entered incorrect choice " +
                                    "\n Please select correct choice for Gender. Thanks ");
                        }
                    };
                    gameplayers[k].cats[gameplayers[k].total_cat].set_data(name, gender);
                    System.out.println(" You Buy a Cat ( 'Name='"
                            + gameplayers[k].cats[gameplayers[k].total_cat].get_name() + "' Gender='"
                            + gameplayers[k].cats[gameplayers[k].total_cat].get_gender() + "' Health="
                            + gameplayers[k].cats[gameplayers[k].total_cat].get_health() + "% Price="
                            + gameplayers[k].cats[gameplayers[k].total_cat].get_price());
                    gameplayers[k].total_cat = gameplayers[k].total_cat+1;
                    System.out.println(" You Buy a"+gameplayers[k].total_cat+" Total cats");
                    break;
                }
                else
                {
                    System.out.println("\n You don't have enough money to buy a Cat" +
                            "\n Please perform another action. Thanks ");
                }
            } else if (choice2 == 2)
            {
                if (gameplayers[k].getMoney()>=5000)
                {
                    gameplayers[k].dogs[gameplayers[k].total_dog] = new Dog();
                    String name, gender;
                    System.out.println("\n Enter the Dog Name= ");
                    get.nextLine(); name = get.nextLine();
                    System.out.println(" Gender of Dog: Enter 1 for Female and 2 for Male:  ");
                    int gen;
                    while(true)
                    {
                        gen = get.nextInt();
                        if(gen ==1)
                        {
                            gender = "Female";
                            break;
                        }
                        else if(gen==2)
                        {
                            gender = "Male";
                            break;
                        }
                        else
                        {
                            System.out.println("\n You entered incorrect choice " +
                                    "\n Please select correct choice for Gender. Thanks ");
                        }
                    };
                    gameplayers[k].dogs[gameplayers[k].total_dog].set_data(name, gender);
                    System.out.println(" You Buy a Dog ( 'Name='"
                            + gameplayers[k].dogs[gameplayers[k].total_dog].get_name() + "' Gender='"
                            + gameplayers[k].dogs[gameplayers[k].total_dog].get_gender() + "' Health="
                            + gameplayers[k].dogs[gameplayers[k].total_dog].get_health() + "% Price="
                            + gameplayers[k].dogs[gameplayers[k].total_dog].get_price());
                    gameplayers[k].total_dog = gameplayers[k].total_dog+1;
                    break;
                }
                else
                {
                    System.out.println("\n You don't have enough money to buy a Dog " +
                            "\n Please perform another action. Thanks ");
                }

            } else if (choice2 == 3)
            {
                if (gameplayers[k].getMoney()>=15000)
                {
                    gameplayers[k].horses[gameplayers[k].total_horse] = new Horse();
                    String name, gender;
                    System.out.println("\n Enter the Horse Name= ");
                    get.nextLine(); name = get.nextLine();
                    System.out.println(" Gender of Horse: Enter 1 for Female and 2 for Male:  ");
                    int gen;
                    while(true)
                    {
                        gen = get.nextInt();
                        if(gen ==1)
                        {
                            gender = "Female";
                            break;
                        }
                        else if(gen==2)
                        {
                            gender = "Male";
                            break;
                        }
                        else
                        {
                            System.out.println("\n You entered incorrect choice " +
                                    "\n Please select correct choice for Gender. Thanks ");
                        }
                    };
                    gameplayers[k].horses[gameplayers[k].total_horse].set_data(name, gender);
                    System.out.println(" You Buy a Horse ( 'Name='"
                            + gameplayers[k].horses[gameplayers[k].total_horse].get_name() + "' Gender='"
                            + gameplayers[k].horses[gameplayers[k].total_horse].get_gender() + "' Health="
                            + gameplayers[k].horses[gameplayers[k].total_horse].get_health() + "% Price="
                            + gameplayers[k].horses[gameplayers[k].total_horse].get_price());
                    gameplayers[k].total_horse = gameplayers[k].total_horse+1;
                    break;
                }
                else
                {
                    System.out.println("\n You don't have enough money to buy a Horse " +
                            "\n Please perform another action. Thanks ");
                }
            } else if (choice2 == 4)
            {
                if (gameplayers[k].getMoney()>=20000)
                {
                    gameplayers[k].cows[gameplayers[k].total_cow] = new Cow();
                    String name, gender;
                    System.out.println("\n Enter the Cow Name= ");
                    get.nextLine(); name = get.nextLine();
                    System.out.println(" Gender of Cow: Enter 1 for Female and 2 for Male:  ");
                    int gen;
                    while(true)
                    {
                        gen = get.nextInt();
                        if(gen ==1)
                        {
                            gender = "Female";
                            break;
                        }
                        else if(gen==2)
                        {
                            gender = "Male";
                            break;
                        }
                        else
                        {
                            System.out.println("\n You entered incorrect choice " +
                                    "\n Please select correct choice for Gender. Thanks ");
                        }
                    };
                    gameplayers[k].cows[gameplayers[k].total_cow].set_data(name, gender);
                    System.out.println(" You Buy a Cow ( 'Name='"
                            + gameplayers[k].cows[gameplayers[k].total_cow].get_name() + "' Gender='"
                            + gameplayers[k].cows[gameplayers[k].total_cow].get_gender() + "' Health="
                            + gameplayers[k].cows[gameplayers[k].total_cow].get_health() + "% Price="
                            + gameplayers[k].cows[gameplayers[k].total_cow].get_price());
                    gameplayers[k].total_cow = gameplayers[k].total_cow+1;
                    break;
                }
                else
                {
                    System.out.println("\n You don't have enough money to buy a Cow " +
                            "\n Please perform another action. Thanks ");
                }
            } else if (choice2 == 5)
            {
                if (gameplayers[k].getMoney()>=25000)
                {
                    gameplayers[k].buffaloes[gameplayers[k].total_buffalo] = new Buffalo();
                    String name, gender;
                    System.out.println("\n Enter the Buffalo Name= ");
                    get.nextLine(); name = get.nextLine();
                    System.out.println(" Gender of Buffalo: Enter 1 for Female and 2 for Male:  ");
                    int gen;
                    while(true)
                    {
                        gen = get.nextInt();
                        if(gen ==1)
                        {
                            gender = "Female";
                            break;
                        }
                        else if(gen==2)
                        {
                            gender = "Male";
                            break;
                        }
                        else
                        {
                            System.out.println("\n You entered incorrect choice " +
                                    "\n Please select correct choice for Gender. Thanks ");
                        }
                    };
                    gameplayers[k].buffaloes[gameplayers[k].total_buffalo].set_data(name, gender);
                    System.out.println(" You Buy a Buffalo ( 'Name='"
                            + gameplayers[k].buffaloes[gameplayers[k].total_buffalo].get_name() + "' Gender='"
                            + gameplayers[k].buffaloes[gameplayers[k].total_buffalo].get_gender() + "' Health="
                            + gameplayers[k].buffaloes[gameplayers[k].total_buffalo].get_health() + "% Price="
                            + gameplayers[k].buffaloes[gameplayers[k].total_buffalo].get_price());
                    gameplayers[k].total_buffalo = gameplayers[k].total_buffalo+1;
                    break;
                }
                else
                {
                    System.out.println("\n You don't have enough money to buy a Buffalo " +
                            "\n Please perform another action. Thanks ");
                }
            } else {
                System.out.println("\n You entered Invalid Choice " +
                        "\n Please enter correct Choice. Thanks ");
            }
        }
    }
    public void saleAnimal( Player player[], int player_num) {
        int choice;
        while (true) {
            System.out.println("\n\n  Enter 1 for Sale the Cat ");
            System.out.println("\n  Enter 2 for Sale the Dog ");
            System.out.println("\n  Enter 3 for Sale the Horse ");
            System.out.println("\n  Enter 4 for Sale the Cow ");
            System.out.println("\n  Enter 5 for Sale the Buffalo");
            choice = get.nextInt();
            if (choice == 1) {
                int total_cats = player[player_num].total_cat;
                if (total_cats == 0)
                {
                    System.out.println(" You has no Cat! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].cats[total_cats-1].get_health()*player[player_num].cats[total_cats-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].total_cat = player[player_num].total_cat -1;
                    player[player_num].setMoney(money);
                    System.out.println(" The cat is sold: You get Money= "+price+"SEK and this amount is added to your account!");
                    break;
                }
            } else if (choice == 2) {
                int total_dogs = player[player_num].total_dog;
                if (total_dogs == 0)
                {
                    System.out.println(" You has no Cat! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].dogs[total_dogs-1].get_health()*player[player_num].dogs[total_dogs-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].setMoney(money);
                    player[player_num].total_dog = player[player_num].total_dog -1;
                    System.out.println(" The Dog is sold: You get Money= "+price+"SEK and this amount is added tp your account!");
                    break;
                }

            } else if (choice == 3) {
                int total_horses = player[player_num].total_horse;
                if (total_horses == 0)
                {
                    System.out.println(" You has no Horse! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].horses[total_horses-1].get_health()*player[player_num].horses[total_horses-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].setMoney(money);
                    player[player_num].total_horse = player[player_num].total_horse -1;
                    System.out.println(" The Horse is soled: You get Money= "+price+"SEK and this amount is added tp your account!");
                    break;
                }

            } else if (choice == 4) {
                int total_cows = player[player_num].total_cow;
                if (total_cows == 0)
                {
                    System.out.println(" You has no Cow! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].cows[total_cows-1].get_health()*player[player_num].cows[total_cows-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].setMoney(money);
                    player[player_num].total_cow = player[player_num].total_cow -1;
                    System.out.println(" The Cow is sold: You get Money= "+price+"SEK and this amount is added tp your account!");
                    break;
                }

            } else if (choice == 5) {
                int total_buffalos = player[player_num].total_buffalo;
                if (total_buffalos == 0)
                {
                    System.out.println(" You has no Buffalo! You can sale other Animal.");
                } else {
                    double price;
                    price = (player[player_num].buffaloes[total_buffalos-1].get_health()*player[player_num].buffaloes[total_buffalos-1].get_price())/100;
                    double money = player[player_num].getMoney()+price;
                    player[player_num].setMoney(money);
                    player[player_num].total_buffalo = player[player_num].total_buffalo -1;
                    System.out.println(" The Buffalo is Sold: You get Money= "+price+"SEK and this amount is added tp your account!");
                    break;
                }

            } else {
                System.out.println(" You entered invalid choice! Enter correct choice. Thanks.");
            }
        }
    }
    public void  buyFood(Player gameplayers[], int k)
    {
        while (true)
        {
            int quantity;
            int choice2;
            System.out.println("\n Enter 1 for Buy the Fruits ");
            System.out.println(" Enter 2 for Buy the Vegetables ");
            System.out.println(" Enter 3 for Buy the CattleFeed ");
            choice2 = get.nextInt();
            if (choice2 == 1)
            {
                System.out.println(" The Price for Fruits per Kg is= "+gameplayers[k].fruits.get_price()
                        +"\n Enter the Quantity you wants to Buy: Enter the Quantity: ");
                quantity = get.nextInt();
                if(gameplayers[k].getMoney()>=(quantity*gameplayers[k].fruits.get_price()))
                {
                    quantity = quantity + gameplayers[k].fruits.get_quantity();
                    gameplayers[k].fruits.set_quantity(quantity);
                    System.out.println(" You Buy the "+quantity+"kg Fruits in Price= "+quantity*gameplayers[k].fruits.get_price());
                    break;
                }
                else
                {
                    System.out.println("\n You don't have enough money to buy the Fruits " +
                            "\n Please perform another action. Thanks ");
                }
            } else if (choice2 == 2)
            {
                System.out.println("\n The Price for Vegetables per Kg is= "+gameplayers[k].vegetables.get_price()
                        +"\n Enter the Quantity you wants to Buy: Enter the Quantity: ");
                quantity = get.nextInt();
                if(gameplayers[k].getMoney()>=(quantity*gameplayers[k].vegetables.get_price()))
                {
                    quantity = quantity + gameplayers[k].vegetables.get_quantity();
                    gameplayers[k].vegetables.set_quantity(quantity);
                    System.out.println(" You Buy the "+quantity+"kg Vegetables in Price= "+quantity*gameplayers[k].vegetables.get_price());
                    break;
                }
                else
                {
                    System.out.println("\n You don't have enough money to buy the Vegetables " +
                            "\n Please perform another action. Thanks ");
                }
            } else if (choice2 == 3)
            {
                System.out.println("\n The Price for CattleFeed per Kg is= "+gameplayers[k].cattlefeeds.get_price()
                        +"\n Enter the Quantity you wants to Buy: Enter the Quantity: ");
                quantity = get.nextInt();
                if(gameplayers[k].getMoney()>=(quantity*gameplayers[k].cattlefeeds.get_price()))
                {
                    quantity = quantity + gameplayers[k].cattlefeeds.get_quantity();
                    gameplayers[k].cattlefeeds.set_quantity(quantity);
                    System.out.println(" You Buy the "+quantity+"kg Vegetables in Price= "+quantity*gameplayers[k].cattlefeeds.get_price());
                    break;
                }
                else
                {
                    System.out.println("\n You don't have enough money to buy the CattleFeed " +
                            "\n Please perform another action. Thanks ");
                }
            } else {
                System.out.println("\n You entered Invalid Choice " +
                        "\n Please enter correct Choice. Thanks ");
            }
        }
    }
}
