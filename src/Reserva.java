public class Reserva {

    private String nomeHospede;
    private String tipoQuarto;
    private int  numeroDias;
    private double valorDiaria ;

    public Reserva() {
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public boolean setNumeroDias(int numeroDias) {
        if (numeroDias < 1) {
            IO.println("Não é possivel reservar menos que um dia");
            return false;
        }else {
            this.numeroDias = numeroDias;
            return true;
        }
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }


    private double calcularValorTotal(){
        return  this.valorDiaria * this.numeroDias;
    }


    @Override
    public String toString() {
        return "nome do Hospede: " + this.nomeHospede +
                "\ntipo do Quarto: " + this.tipoQuarto +
                "\nnumero de Dias: " + this.numeroDias +
                "\nvalor da Diaria: " + this.valorDiaria +
                "\nvalor Total: " + this.calcularValorTotal();
    }

}
