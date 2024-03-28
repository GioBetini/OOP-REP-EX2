package Model;

public class ProfessorHorista extends Professor {
    private int horasAula;
    private double valorHoraAula;


    public double getValorHoraAula(){
        return valorHoraAula; 
    }

    public void setValorHoraAula(double valorHoraAula){
        this.valorHoraAula = valorHoraAula;
    }

    public int getHorasAula(){
        return horasAula;
    }

    public void setHorasAula(int horasAula){
        this.horasAula = horasAula;
    }

    @Override
    public void calcSalario() {
        System.out.println("O salário do professor "+ getNome()+" é: R$"+horasAula*valorHoraAula);
        
    }
    
}
