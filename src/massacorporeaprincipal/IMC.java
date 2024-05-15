package massacorporeaprincipal;

public class IMC {
    
    public void exibicao(String nome, float altura, float peso){
        float imc = realizarCalculo(altura, peso);
        String nivel = classificacao(imc);
        System.out.printf("%s seu indice de massa corporea é: %.2f\n", nome, imc);
        System.out.println("Isso nos leva a sua classificaçao de " + nivel + "\n\n");
        
    }
    
    private float realizarCalculo(float altura, float peso){
        float imc = peso / (altura * altura);       
        
        return imc;   
    }
    
    private String classificacao(float imc){
        String resposta = "";
        if (imc < 18.5)resposta = "magreza";
        if (imc > 18.6)resposta = "normal";
        if (imc > 25)resposta = "sobrepeso";
        if (imc > 30)resposta = "obesidade grau I";
        if (imc > 35)resposta = "obesidade grau II";
        if (imc > 40)resposta = "obesidade grau III";
        
        return resposta;
    }
    
    
    
}
