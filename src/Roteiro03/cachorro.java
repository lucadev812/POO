package Roteiro03;

public class cachorro extends  Animal{


    public cachorro(String nome) {
        super(nome);
    }

    @Override
    void somEmitido(){
        System.out.println(nome+" faz au au");
    }
}
