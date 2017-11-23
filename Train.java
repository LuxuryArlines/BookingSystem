package calsi;

import java.io.*;
import java.util.*;
 class Train
{
 public static void main() throws IOException
 {
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader x=new BufferedReader(isr);
int tp=0, c=0, no=0, r, o, i, count=0, position=0;
boolean flag = true;
boolean ar[][]=new boolean[10][4];
for (int row=0; row<10; row++)
{
    for (int column=0; column<4; column++)
    {
        ar[row][column]=false;
    }
}
System.out.print("***********WELCOME TO TICKET RESERVATION SYSTEM***********");
System.out.println();
System.out.println();
System.out.println("                TICKET RESERVATION");
while(flag==true)
    {
System.out.println("                   Main Menu");
System.out.println("1. Book Ticket");
System.out.println("2. Exit");
System.out.print("Enter Choice   :");
int choice = Integer.parseInt(x.readLine());
switch (choice)
{
    case 1:

      System.out.println();
            System.out.println();
            System.out.print("*********TRAIN TICKET RESERVATION COUNTER***********");
            System.out.println();
            System.out.println("Enter the number for the station as given in the menu below");
            System.out.println("1 for Station A");
            System.out.println("2 for Station B");
            System.out.println("3 for Station C");
            System.out.println("4 for Station D");
            System.out.println("5 for Station E");


            System.out.print("START STATION: ");
            int s=Integer.parseInt(x.readLine());
            System.out.print("DESTINATION STATION: ");
            int d=Integer.parseInt(x.readLine());
            int stat=d-s;
            s=--s;
            d=--d;

                while (no<10)
                {
                for (i=0; i<5; i++)
                {
                    if (ar[no][i]==false)
                    {
                        count=count+1;
                        position=i;
                    }
                }
                 if (count>=stat)
                 {
                   for (int j=position-stat+1; j<position; j++)
                   {
                      ar[no][j]=true;
                   }

                }
                if (count<stat)
                {
                    no=no+1;
                }
                count=0;
                no=0;
            }
    if (no>=10)
    {
        break;
    }
    else
    {

           int f=0;
    String starttime="", reaching="";
       if(s==0 && d==1)
        {

            f = 50;
            starttime = "08:00";
            reaching = "10:00";
        }
             if(s==0 && d==2)
        {
            int a =0;
            int b =2;
            f = 100;
            starttime = "08:00";
            reaching = "12:00";
        } 
        if(s==0 && d==3)
        {

            f = 150;
            starttime = "08:00";
            reaching = "14:00";
        }
         if(s==0 && d==4)
        {
            int a =0;
            int b =4;
            f = 200;
            starttime = "08:00";
            reaching = "16:00";
        }
         if(s==1 && d==2)
        {

            f = 50;
            starttime = "10:00";
            reaching = "12:00";
        }
         if(s==1 && d==3)
        {

            f = 100;
            starttime = "10:00";
            reaching = "14:00";
        }
         if(s==1 && d==4)
        {

            f = 150;
            starttime = "10:00";
            reaching = "16:00";
        }
         if(s==2 && d==3)
        {

            f = 50;
            starttime = "12:00";
            reaching = "14:00";
        }
         if(s==2 && d==4)
        {

            f = 100;
            starttime = "12:00";
            reaching = "16:00";
        }
         if(s==3 && d==4)
        {

            f = 50;
            starttime = "14:00";
            reaching = "16:00";
        }
       if (s==4 || d==0)
       {
         System.out.println ("Wrong Choice. Your ticket was not booked");

        }
                System.out.print("ENTER THE NAME: ");
                String people=x.readLine();
                System.out.print("ENTER THE AGE: ");
                int age=Integer.parseInt(x.readLine());
                System.out.print("GENDER OF THE PERSON: ");
                String gender=x.readLine();
                System.out.print("DATE OF JOURNRY: ");
                String date2=x.readLine();

            System.out.println();
            System.out.println();
            System.out.println("      *****RESERVATION TICKET*****");

                System.out.println("Name :"+people+"     "+"Age :"+age+"      "+"Gender :"+gender+"       ");




        System.out.println();
            System.out.println("START STATION: "+s);
            System.out.println("Boarding time: " + starttime);
            System.out.println("DESTINATION STATION: "+d);
            System.out.println("Expected time of Arrival:" + reaching);
            System.out.println();
       System.out.println("TOTAL AMOUNT: "+ f);
            System.out.println();
            System.out.println(" ***WISH YOU A HAPPY AND SAFE JOURNEY***");
            System.out.println("COURTESY: ROMIT RAILWAY STATION");
            }

            break;


            case 2:
            flag=false;
            System.out.println ("You have exited");
            break;
            default: System.out.println("Choice Does not Exit");
     }
         }
       }
        }