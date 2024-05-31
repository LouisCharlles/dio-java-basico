import java.util.Scanner;

public class SmartTv {
    Scanner pergunta = new Scanner(System.in);
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public int aumentarVolume(){
        return ++volume;
    }

    public int diminuirVolume(){
        return --volume;
    }

    public void mudarCanal(){
        System.out.println("[1]-Avançar 1 |ou| [2]-Retornar |ou| [3] - escolher o canal?");
        int escolher = pergunta.nextInt();
        if(escolher == 1){
            ++canal;
            System.out.println("O canal agora está no: "+ canal);
        }
        else if(escolher == 2){
            --canal;
            System.out.println("O canal agora está no: "+canal);
        }
        else if(escolher == 3){
            System.out.println("Qual canal você quer?:");
            int novo_canal = pergunta.nextInt();
            canal = novo_canal;
            System.out.println("Troquei o canal para o: "+canal);
        }
        else{
            System.out.println("Opção não disponível.");
        }
    }
}
