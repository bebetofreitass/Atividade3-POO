public class App {
    public static void main(String[] args) throws Exception {

Pessoa p1 = new Pessoa("Carlos Alberto", "08392150376", 2001, 1.65);
Pessoa p2 = new Pessoa("Suzy Helen", "48092033122", 2007, 1.68);
p1.mostrar();
System.out.println();
p2.mostrar();
System.out.println();

Empregado empregado1 = new Empregado("Carlos", "Alberto", 3000);
Empregado empregado2 = new Empregado("Suzy", "Helen", 4000);
     
System.out.println("Salário anual de " + empregado1.getnome() + ": R$ " + empregado1.calcularsalarioAno());
System.out.println("Salário anual de " + empregado2.getnome() + ": R$ " + empregado2.calcularsalarioAno());
     
System.out.println();   

System.out.println("Salário anual de " + empregado1.getnome() + ": R$ " + empregado1.calcularsalarioAno() + " Após aumento de 10%: ");
System.out.println("Salário anual de " + empregado2.getnome() + ": R$ " + empregado2.calcularsalarioAno() + " Após aumento de 10%: ");
}
}

