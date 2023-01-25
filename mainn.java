import java.util.ArrayList;
import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {


    }


    public static  int [] twoSum(int [] nums,int target) {
        int [] sum=new int[2];
        int ctr=0;

        for (int i=0;i< nums.length;i++)
        {
            if (nums[i]+nums[i+1]==target)
            {
                sum[ctr]=nums[i];
                sum[ctr+1]=nums[i+1];

            }


        }




        return sum;
    }
    public static int getEvenDigitSum(int num){
        if (num>=0){

            int sum=0,n;
            while (num>0) {
                n = num % 10;
                if (n%2==0){sum+=n;}
                    num/=10;
                            }
                    return sum;
    }
        return -1;
    }
    public static int DigitSum(int number){

        int sum=0;
        while(number>0)
        {
            int n;
            n=number%10;
            sum+=n;
            number/=10;
        }
        return sum;
    }
    public static boolean isEven(int number){
        boolean flag = number % 2 == 0 ? true : false;



        return flag;
    }
    public static String minstoyears(long mins) {

        long hrs = mins / 60;
        long days = hrs / 24;
        long years = days / 365;
        long remains = days % 365;
        String ttl = mins + " min" + " = " + years + " y " + "and " + remains + "d";

        return ttl;
    }

    public static double area(double radius) {
        if (radius <= -1) {
            return -1;
        }
        return radius * radius * Math.PI;

    }

    public static double area(double width, double height) {
        if (width <= -1 || height <= -1) {
            return -1;
        }
        return width * height;
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        }

        return false;
    }

    public static double toMilesPerHour(double kmh) {
        if (kmh < 0) {
            return -1;
        }
        return Math.round(kmh / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("invalid value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = Math.round(kilobytes / 1024);
            int remin = kilobytes % 1024;

            System.out.println(kilobytes + " KB" + " = " + mb + " MB " + "and " + remin + " KB");
        }


    }

    public static boolean shouldWakeUp(boolean dog_sound, int hours) {
        if (hours>12)
        {
            int NewHours=hours-12;
            if (dog_sound==true)
            {
                if (NewHours>8||NewHours<10){return true;}

            }

        }
        return false;
    }
    public static String quarter(String month) {
        return switch (month)
        {
            case "jan", "feb", "mar" ->  "1st";
            case "apr","may","jun"-> "2nd";
            case "jul","aug","sep"-> "3rd";
            case "oct","nov","dec"-> "4th";
            default ->  "not a month";

        };

    }
    public static String printday(int day) {
        switch (day)
        {
            case 0->{return"sat";}
            case 1->{return "sun";}
            case 2->{return "mon";}
            case 3->{return "tue";}
            case 4->{return "wed";}
            case 5->{return "thu";}
            case 6->{return "fri";}
            default -> {return "not a valid day";}


        }


    }
    public static boolean isOdd(int num){
        if (num>=0){

            if (num % 2 != 0) {
                return true;
            }
            else {
                return false;
            }

                    }
        return false;
    }
    public static int sumOdd(int start,int end){
        int sum=0;
        if (start>0&&end>start){
        for (int i=start;i<end;i++)
        {
            if (isOdd(i))
            {
                sum+=i;
                i++;

            }
            else {
                i++;
            }


        }



    }
        return sum;
    }




}



