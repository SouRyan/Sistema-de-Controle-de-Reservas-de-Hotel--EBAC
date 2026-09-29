void main() {

    boolean continuar=true;
    int qtdeReservas = 0;
    Reserva[] reserva = new Reserva[5];
    Scanner sc = new Scanner(System.in);

    do{
        IO.println("Seja bem vindo ao hotel. Escolha entre as seguintes opções:");
        IO.println("1- Nova Reserva");
        IO.println("2- Listar Reserva");
        IO.println("3- Buscar reserva por nome do hóspede");
        IO.println("4- Ordernar Reserva por número de dias (decrecente)");
        IO.println("5- Sair");
        String opcao = sc.nextLine();

        switch (opcao) {
            case "1":
                if (qtdeReservas < 5) {
                reserva[qtdeReservas] = new Reserva();
                IO.println("Insira o nome do hospede:");
                String nomeHospede =  sc.nextLine();
                reserva[qtdeReservas].setNomeHospede(nomeHospede);

                IO.println("Insira o tipo de quarto");
                String tipoQuarto =  sc.nextLine();
                reserva[qtdeReservas].setTipoQuarto(tipoQuarto);
                boolean tryer = true;
                while (tryer) {

                IO.println("Insira a quantidade de dias:");
                int numeroDias =  sc.nextInt();

                if (!reserva[qtdeReservas].setNumeroDias(numeroDias)) {

                }else{
                    reserva[qtdeReservas].setNumeroDias(numeroDias);
                    tryer = false;
                }
                }
                IO.println("Insira o valor da  diaria:");
                double valorDiaria =  sc.nextDouble();
                reserva[qtdeReservas].setValorDiaria(valorDiaria);

                qtdeReservas++;
                }
                else {
                    IO.println("Os quartos estão lotados");
                }
                break;
            case "2":
                if (qtdeReservas == 0) {
                    IO.println("Ainda sem reservas");
                }else{
                for (int i = 0; i < qtdeReservas; i++) {
                    IO.println("--------------------------------------------------------");
                    IO.println(reserva[i].toString());
                    IO.println("--------------------------------------------------------");

                }
                }
                break;
            case "3":
                IO.println("Insira o nome para buscar");
                String nome = sc.nextLine().toLowerCase();
                boolean achou = false;
                for(int i = 0; i < qtdeReservas; i++){
                    if(reserva[i].getNomeHospede().toLowerCase().equals(nome)){
                        IO.println("Reserva Encontrada");
                        IO.println("--------------------------------------------------------");
                        IO.println(reserva[i].toString());
                        IO.println("--------------------------------------------------------");
                        achou = true;
                        break;
                    }
                }
                if(!achou){
                    IO.println("Reserva NÃO Encontrada");
                }
                break;
            case "4":
                for (int i = 0; i < qtdeReservas - 1; i++) {
                    for (int j = 0; j < qtdeReservas - 1 - i; j++) {

                        if (reserva[j].getNumeroDias() < reserva[j + 1].getNumeroDias()) {

                            Reserva temp = reserva[j];
                            reserva[j] = reserva[j + 1];
                            reserva[j + 1] = temp;
                        }
                    }
                }

                IO.println("Reservas ordenadas por número de dias:");

                for (int i = 0; i < qtdeReservas; i++) {
                    IO.println(reserva[i]);
                    IO.println("------------------");
                }
                break;
            case "5":
                IO.println("Saindo...");
                continuar = false;
                break;
            default:
                IO.println("Escolha alguma opção das opções disponiveis");
                break;
        }
    }while(continuar);


}
