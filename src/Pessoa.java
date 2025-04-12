import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private int anoNasci;
    private double altura;

public Pessoa(String nome,String cpf,int anoNasci,double altura){
this.nome = nome;
this.cpf = cpf;
this.anoNasci = anoNasci;
this.altura = altura;
}
public String getnome(){
return nome;
}
public String getcpf(){
    return cpf;
}
public int  getanoNasci(){
    return anoNasci;
}
public double  getaltura(){
return altura;
}
public int calculoIdade(){
    int idadeHoje = LocalDate.now().getYear();
    return idadeHoje - anoNasci;
}
public void setnome(String nome){
    this.nome = nome;
}
public void  setcpf(String cpf){
    this.cpf = cpf;
}
public void  setanoNasci(int anoNasci){
    this.anoNasci = anoNasci;
}
public void  setaltura(double altura){
    this.altura = altura;
}
public void mostrar(){
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Ano Nascimento: " + anoNasci);
    System.out.println("Altura: " + altura + " metros");
    System.out.println("Idade: " + calculoIdade() + " Anos");
}
}
