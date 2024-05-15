package massacorporeaprincipal;

import java.util.Scanner;

public class MassaCorporea {

    public static void main(String[] args) {
        
        //adiociona as classes
        Scanner sc = new Scanner(System.in);
        IMC imc = new IMC();
        //variavel de apoio
        String selecao = "";
        
        //inicia a comunicaç?o com o usuario
        System.out.println("Deseja calcular o seu");
        System.out.println("Indice de Massa Corporal? ");
        //tomada de decis?o
        System.out.print("Responta com S para SIM e N para NAO: ");
        selecao = sc.nextLine();
        
        //executa conforme selecionado acima
        switch (selecao){
            case "S" -> { 
                System.out.println("\n-------- Indice de Massa Corporal --------");
                System.out.print("Informe o seu nome: ");
                String nome = sc.nextLine();

                System.out.print("\nInforme a sua altura(cm): ");
                float altura = sc.nextFloat()/100f;

                System.out.print("\nInforme o seu peso(Kg) : ");
                float peso = sc.nextFloat();

                imc.exibicao(nome, altura, peso);
                selecao = "";
                selecao = sc.nextLine();
            }
            
            case "N" -> { 
                System.out.println("Muito Obrigado");
                System.out.println("");
                System.exit(0);
            }
            
            
            default -> System.out.println("Opç?o invalida");
                
        }
        
        //repetiç?o para um possivel novo calculo
        while(true){
            
            selecao = "";
            System.out.println("Deseja calcular um novo");
            System.out.println("Indice de Massa Corporal? ");
            System.out.print("Responta com S para SIM e N para NAO: ");
            selecao = sc.nextLine();
            
            switch (selecao){
                case "S" -> {
                    System.out.println("-------- Indice de Massa Corporal --------");
                    System.out.print("informe o seu nome: ");
                    String nome = sc.nextLine();

                    System.out.print("\nInforme a sua altura(cm): ");
                    float altura = sc.nextFloat() / 100f;
                    
                    System.out.print("\nInforme o seu peso(Kg) : ");
                    float peso = sc.nextFloat();

                    imc.exibicao(nome, altura, peso);
                }
                
                case "N" -> { 
                    System.out.println("Muito Obrigado");
                    System.out.println("");
                    System.exit(0);
                }
                
                default -> System.out.println("Opç?o invalida");
                    
            } 
        }
        
        
        
    }
    
}
