package variables;

public class Time1 {
    
    public static void main(String[] args) {
        
        int second = 5450;

        int hr = second/3600; //1
        int mins = (second/3600)/60; //30

        second = (second%3600)%60; //50

        System.out.println(hr+"hr:"+mins+"mins:"+second+"sec");


    }

}
