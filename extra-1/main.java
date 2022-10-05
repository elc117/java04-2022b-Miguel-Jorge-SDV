import java.util.Collections;
import java.util.Arrays;
import java.util.Random;

class main {
    public static void main(String[] args) {
        String[] nomes = { "André","Antônio","Arthur","Bernardo","Breno","Bruno","Caio","Carlos","Cauã",
                           "Daniel","Danilo","Davi","Diego","Douglas","Eduardo","Enzo","Erick","Felipe",
                           "Filipe","Franciso","Gabriel","Guilherme","Gustavo","Heitor","Henrique","Igor",
                           "Iuri","Joari","José","João","Joaquim","Juarez","Júlio","Juraci","Juvenal",
                           "Kaio","Kauan","Kauã","Kauê","Leonardo","Luan","Lucas","Luiz","Luís","Marcos",
                           "Mateus","Matheus","Miguel","Murilo","Nicolas","Otávio","Paulo","Pedro",
                           "Rafael","Renan","Ryan","Samuel","Thiago","Tiago","Victor","Vinícius","Vicente",
                           "Victor","Vitór","Adriana","Alice","Aline","Amanda","Ana","Anna","Antonia",
                           "Beatriz","Bianca","Brenda","Bruna","Camila","Carolina","Caroline","Clara",
                           "Daniela","Eduarda","Emilly","Emily","Evelyn","Fernanda","Francisca","Gabriela",
                           "Gabrielle","Gabrielly","Giovana","Giovanna","Helena","Isabela","Isabella",
                           "Isabelle","Janaina","Joseane","Júlia","Juliana","Juraci","Lara","Larissa",
                           "Laura","Lavinia","Letícia","Livia","Luana","Luisa","Luiza","Manuela","Marcia",
                           "Maria","Mariana","Marina","Melissa","Nicole","Patricia","Rafaela","Raissa",
                           "Rebeca","Sarah","Sofia","Sophia","Thaís","Vitória","Yasmin","Ágatha"};

        String[] sobrenome = { "Almeida","Alvaréz","Alves","Araújo","Azevedo","Barbosa","Barboza","Cardoso",
                               "Carvalho","Cavalcante","Cavalcanti","Correa","Correia","Costa","Cruz","Dias",
                               "Díaz","Fernandes","Fernandez","Ferreira","German","Gomes","Gomez","Gonzáles",
                               "Gonçalves","Gónzalez","Lima","Martins","Mello","Melo","Montes","Moraes",
                               "Morais","Oliveira","Pereira","Pinto","Ribeiro","Rocha","Rodrigues","Santiago",
                               "Santos","Schmidt","Schmitz","Silva","Sousa","Souza","Teixeira"};

        Random num = new Random();

        String name = nomes[num.nextInt(127)];
        String surname = sobrenome[num.nextInt(47)];

        System.out.println(name + " " + surname);
    }
}