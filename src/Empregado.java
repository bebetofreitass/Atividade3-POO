public class Empregado {
    private String nome;
    private String sobrenome;
        private double salarioMes;
    
public Empregado(String nome, String sobrenome, double salarioMes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMes = salarioMes > 0 ? salarioMes : 0;
        }
    
public String getnome() {
return nome;
        }
    
public String getsobrenome() {
return sobrenome;
        }
    
public double getsalarioMes() {
return salarioMes;
        }
public double calcularsalarioAno() {
return this.salarioMes * 12;
        }
    
public void setnome(String nome) {
this.nome = nome;
        }
public void setSobrenome(String sobrenome) {
this.sobrenome = sobrenome;
        }
public void setsalarioMes(double salarioMes) {
this.salarioMes = salarioMes > 0 ? salarioMes : 0;
        }
public void forneceaumento() {
this.salarioMes += this.salarioMes* 0.10;
}
}

