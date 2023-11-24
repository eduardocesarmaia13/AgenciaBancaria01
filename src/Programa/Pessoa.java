package Programa;

public class Pessoa {

    private static int counter = 1;
    private String name;
    private String cpf;
    private String email;

    public Pessoa(String name, String cpf, String email){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

}
