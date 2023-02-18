
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //instanciando as raças
        Raca raca1 = new Raca();
        raca1.setId(1L);
        raca1.setNome("Pitbul");

        Raca raca2 = new Raca();
        raca2.setId(2L);
        raca2.setNome("Pastor Alemão");

        Raca raca3 = new Raca();
        raca3.setId(3L);
        raca3.setNome("Labrador");

        Raca raca4 = new Raca();
        raca4.setId(4L);
        raca4.setNome("Poodle");

        Raca raca5 = new Raca();
        raca5.setId(5L);
        raca5.setNome("Husky");


        //instanciando os cachorros
        Cachorro cachorro1 = new Cachorro("amarelo");
        cachorro1.setId(6L);
//        cachorro1.setCor("amarelo");
        cachorro1.setPorte("medio");
        cachorro1.setIdade(10);
        cachorro1.setRaca(raca1);

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setId(7L);
        cachorro2.setCor("azul");
        cachorro2.setPorte("medio");
        cachorro2.setIdade(11);
        cachorro2.setRaca(raca2);

        Cachorro cachorro3 = new Cachorro();
        cachorro3.setId(8L);
        cachorro3.setCor("preto");
        cachorro3.setPorte("pequeno");
        cachorro3.setIdade(7);
        cachorro3.setRaca(raca3);

        Cachorro cachorro4 = new Cachorro();
        cachorro4.setId(9L);
        cachorro4.setCor("azul");
        cachorro4.setPorte("grande");
        cachorro4.setIdade(5);
        cachorro4.setRaca(raca2);

        Cachorro cachorro5 = new Cachorro();
        cachorro5.setId(10L);
        cachorro5.setCor("branco");
        cachorro5.setPorte("medio");
        cachorro5.setIdade(2);
        cachorro5.setRaca(raca1);

        Cachorro cachorro6 = new Cachorro();
        cachorro6.setId(11L);
        cachorro6.setCor("preto");
        cachorro6.setPorte("medio");
        cachorro6.setIdade(3);
        cachorro6.setRaca(raca5);

        Cachorro cachorro7 = new Cachorro();
        cachorro7.setId(12L);
        cachorro7.setCor("rosa");
        cachorro7.setPorte("grande");
        cachorro7.setIdade(10);
        cachorro7.setRaca(raca2);

        Cachorro cachorro8 = new Cachorro();
        cachorro8.setId(13L);
        cachorro8.setCor("marrom");
        cachorro8.setPorte("grande");
        cachorro8.setIdade(7);
        cachorro8.setRaca(raca4);

        Cachorro cachorro9 = new Cachorro();
        cachorro9.setId(14L);
        cachorro9.setCor("rosa");
        cachorro9.setPorte("medio");
        cachorro9.setIdade(1);
        cachorro9.setRaca(raca5);

        Cachorro cachorro10 = new Cachorro();
        cachorro10.setId(15L);
        cachorro10.setCor("branco");
        cachorro10.setPorte("medio");
        cachorro10.setIdade(9);
        cachorro10.setRaca(raca5);

        ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();

        cachorros.add(cachorro1);
        cachorros.add(cachorro2);
        cachorros.add(cachorro3);
        cachorros.add(cachorro4);
        cachorros.add(cachorro5);
        cachorros.add(cachorro6);
        cachorros.add(cachorro7);
        cachorros.add(cachorro8);
        cachorros.add(cachorro9);
        cachorros.add(cachorro10);

        cachorros.forEach(cachorro -> {
            System.out.println( " cachorro " + cachorro.getId() + " cor= " +cachorro.getCor()+ " porte= "+ cachorro.getPorte()+ " idade= " + cachorro.getIdade()+ " raça= "+ cachorro.getRaca().getNome()
             );
        });

    }
}