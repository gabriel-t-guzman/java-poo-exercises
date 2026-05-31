package aula11;
import java.time.LocalDate;
// importar LocalDate
public class Contact {

    static int id; //pertence a clase
    String name;
    String cellnumber;
    String email;
    LocalDate bdate;

    Contact(String name, String cellnumber, String email, LocalDate bdate) {

        counter();
        
        this.name = name;
        this.cellnumber = cellnumber;
        this.email = email;
        this.bdate = bdate;
    }

    public static void counter(){
        id++;       
    }


    @Override
    public String toString(){

        return ("The person " + name + " has: " + id + " " + cellnumber + " " + email + " " + bdate);
    }

    //SETTERS

    public void setName(String newName){name = newName;}
    public void setCellNumber(String newNumber){cellnumber = newNumber;}
    public void setEmail(String newEmail){email = newEmail;}
    public void setBdate(LocalDate newBdate){bdate = newBdate;}

    //GETTERS

    public int getId(){return id;}
    public String getName(){return name;}
    public String getCellNumber(){return cellnumber;}
    public String getEmail(){return email;}
    public LocalDate getBdate(){return bdate;}


}
