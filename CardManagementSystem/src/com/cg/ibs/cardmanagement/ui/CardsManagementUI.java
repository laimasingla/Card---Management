package com.cg.ibs.cardmanagement.ui;

import java.util.*;

import java.io.*;

enum CardMenu{

 APPLY,UPGRADE,RESET,QUIT

}

public class CardManagementUI

{

    Scanner scan=new Scanner(System.in);

public CardManagement(){

    HashMap<String, ArrayList<String>> User_Details = new ArrayList<String, ArrayList<String>>();

	HashMap<String, ArrayList<String>> Customer_Details = new ArrayList<String, ArrayList<String>>();	

	HashMap<String, ArrayList<String>> Credit_Card_Details = new ArrayList<String, ArrayList<String>>();

	HashMap<String, ArrayList<String>> Debit_Card_Details = new ArrayList<String, ArrayList<String>>();

	HashMap<String, ArrayList<String>> Query_Type = new ArrayList<String, ArrayList<String>>();

	HashMap<String, ArrayList<String>> Query_Details = new ArrayList<String, ArrayList<String>>();

      CardService =new CardService();

    }

    

    public static void main(String args []){

        CardMenu choice;

        while(choice!=CardMenu.QUIT){

            System.out.println("Welcome to card management System");

            System.out.println("Enter 1 to login as a customer");

            System.out.println("Enter 2 to login as a bank admin");

            int userInput=scan.nextInt();

            if(userInput==1){

               

                System.out.println("enter username : ");

			    String username = obj.nextLine();

				

				System.out.print("enter password : ");

				String password = obj.nextLine();	

				

                System.out.println("Choice");

                choice=scan.nextInt();

                 

                 switch(choice){

                     case APPLY:

                     

                     case UPGRADE:

                     

                     case RESET:

                     

                     case QUIT:

            }

            if(userInput==2){

              

            }

            

            

            

        }

        

        

      

}
