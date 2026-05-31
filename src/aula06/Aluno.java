package aula06;
import aula05.*;
import java.time.LocalDate;



public class Aluno extends Pessoa {
    
    private static DateYMD dataAtual; 
    private DateYMD DataInsc;

    Aluno(String iNome, int icc, DateYMD iDataNasc, DateYMD iDataInsc) {
       super(iNome, icc, iDataNasc);
     DataInsc = iDataInsc;  
    }

    Aluno(String iNome, int icc, DateYMD iDataNasc) {
        super(iNome, icc, iDataNasc);
        DataInsc = dataAtual;
    }

    private LocalDate dataAtual() {
        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }






    public static void main(String[] args) {
    
    
    
    }
}
