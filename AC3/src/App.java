public class App {
    public static void main(String[] args) throws Exception {

        Eventos evento1;

        evento1 = new Eventos("evento legal", "27/08/23", "Ibmec", 70,"Informações adicionais sobre o envento. ");
        System.out.println(evento1.nome+", "+"sobre: "+ evento1.obs+"Data: "+ evento1.data+"Local: "+evento1.local);

        evento1.cadastrarAluno("joãozinho",5087);
    }
    
    
}
