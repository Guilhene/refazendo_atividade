public class Main {
    public static void main(String[] args) {

        //campo de objeto
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Guilherme";
        aluno1.idade = 20;
        aluno1.curso = "Ciencia da Computação";
        System.out.println("\nEu me chamo " + aluno1.nome + ", eu tenho " + aluno1.idade + " anos e faço " + aluno1.curso);

        //campo de objeto
        Livro livro1 = new Livro();
        livro1.titulo = "Um Curso de Cálculo - Vol. 1";
        livro1.autor = "Hamilton Luiz Guidorizzi";
        livro1.ano = 2001;
        livro1.exibir(livro1.titulo, livro1.autor, livro1.ano);

        //campo de objeto
        Retangulo retangulo1 = new Retangulo();
        retangulo1.comprimento = 14.50;
        retangulo1.largura = 7.50;
        retangulo1.calcularArea(retangulo1.comprimento, retangulo1.largura);
        retangulo1.exibirResultado(retangulo1.comprimento, retangulo1.largura);

        //campo de objeto
        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 1;
        triangulo1.ladoB = 5;
        triangulo1.ladoC = 5;
        triangulo1.formaTriangulo(triangulo1.ladoA, triangulo1.ladoB, triangulo1.ladoC);
        System.out.println("\n Tipo do triangulo1: " + triangulo1.obterTipo(triangulo1.ladoA, triangulo1.ladoB, triangulo1.ladoC));

    }
}

//exercicio 1
class Aluno{

    //campo de classe
    String nome;
    String curso;
    int idade;

}

//exercicio 2
class Livro{

    //campo de classe
    String titulo;
    String autor;
    int ano;

    //métodos
    void exibir(String titulo, String auto, int ano) {
        System.out.println("\nNome do livro: " + titulo + "\nAutor: " + auto + "\nAno: " + ano);

    }
}

//exercicio 3
class Retangulo {

    //campo de classe
    double comprimento;
    double largura;

    //métodos
    double calcularArea(double comprimento, double largura){
        return (comprimento * largura);
    }
    void exibirResultado (double comprimento, double largura){
        System.out.println("\nArea do Retangulo: " + calcularArea(comprimento, largura));
    }
}

//exercicio 4
class Triangulo{

    //campo de classe
    double ladoA;
    double ladoB;
    double ladoC;

    //métodos
    boolean formaTriangulo(double ladoA, double ladoB, double ladoC){

        return (ladoA + ladoB > ladoC & ladoA + ladoC > ladoB & ladoB + ladoC > ladoA);

    }

    String obterTipo(double ladoA, double ladoB, double ladoC){

        if (formaTriangulo(ladoA, ladoB, ladoC)){
            System.out.println("\n E um triagulo: " + formaTriangulo(ladoA, ladoB, ladoC));
        }else {
            System.out.println("\n Não forma um triangulo: " + formaTriangulo(ladoA, ladoB, ladoC));
        }

        if (ladoA == ladoB & ladoA == ladoC & ladoB == ladoC){
            return "Equilátero";
        }
        if (ladoA == ladoB & ladoA != ladoC & ladoB != ladoC || ladoA == ladoC & ladoA != ladoB & ladoC != ladoB || ladoB == ladoC & ladoB != ladoA & ladoC != ladoA){
            return "Isósceles";
        }
        return "Escaleno";
    }
}