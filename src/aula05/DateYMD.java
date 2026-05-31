package aula05;
// import java.util.Scanner;
// import java.util.Calendar;
// import java.util.GregorianCalendar;
// import java.time.Month;


    public class DateYMD {

        private int year,month,day; // INTANCES VARIABLES

        public DateYMD(int y, int m, int d) {
            if (!(validDate(y, m, d)))
                throw new Error("not valid value of date");
                
            year = y;
            month = m;
            day = d;
                
        }

        public boolean  validMonth(int m) {
            if ((m >= 0) && (m <= 12)) {
                return true;}
            return false;        
        }

        public boolean validDate(int y, int m, int d) {
            boolean b_m = validMonth(m);
            if (!b_m) 
                return false;
            int dias_supostos = monthDays( y, m);
            if (d >= dias_supostos)
                return false;
            return true;

        }
        public int monthDays(int y, int m) {
            boolean aux = leapYear(y);
            switch (m) {
                case 2:
                    if (aux) {return 29;}
                    return 28;
                case 4:
                case 6:
                case 9:
                case 11: 
                    return 30;
                default : 
                    return 31;          
            }
        
        }

        public static boolean leapYear(int y) {
            if (y%400==0)
                return true;
            if (y%4 == 0 && !(y%100==0))
                return true;
            else 
                return false;

        }
        @Override
        public String toString(){
            String s = (year + "/" +  month + "/" + day);
            return s;
        }
      // GETTERS
        public int getDay() {
            return day;
        }
        public int getMonth() {
            return month;
        }
        public int getYear() {
            return year;
        }

      // SETTERS 
        public void setData(int y, int m, int d){
             if (!(validDate(d, m, y)))
                throw new Error("not valid value of date");
                
            year = y;
            month = m;
            day = d;
        }






    public static void main(String[] args) {    

       // DateYMD a = new DateYMD(2002,5,7);
       // System.out.println(a.toString());
       // System.out.println(DateYMD.leapYear(2002));
    }
}
