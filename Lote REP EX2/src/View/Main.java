package View;

import Model.ProfessorHorista;
import Model.ProfessorTitular;

public class Main {
    public static void main(String[] args) throws Exception {
        ProfessorHorista horacio = new ProfessorHorista();

        horacio.setNome("Horacio");
        horacio.setIdade(60);
        horacio.setMatricula("0001");
        horacio.setHorasAula(40);
        horacio.setValorHoraAula(50);

        horacio.calcSalario();

        ProfessorTitular tito = new ProfessorTitular();

        tito.setNome("Tito");
        tito.setIdade(30);
        tito.setMatricula("0010");
        tito.setAnosInstituicao(5);
        tito.setSalario(2000);
        
        tito.calcSalario();
    }
}
