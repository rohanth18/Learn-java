public class Theatreseat 
{
    public static void main(String[] args) {
        
   
    int audience=125;
    int seatsPerRow=12;
    //To find no. of filled rows
    int filledrows=audience/seatsPerRow;
    //To find no. of people in last row
    int peopleInLastRow=audience%seatsPerRow;
    System.out.println("No. of filled rows ="+filledrows);
    System.out.println("People in last row="+peopleInLastRow);
    }
}