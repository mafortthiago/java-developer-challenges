public class Smartphone implements Navegador, ReprodutorMusical,AparelhoTelefonico{

    public void ligar() {
        System.out.println("Fazer ligação");
    }

    public void atender() {
        System.out.println("Atender ligação");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Inciar correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }

    public void tocar() {
        System.out.println("Tocar música");
    }

    public void pausar() {
        System.out.println("Pausar música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }
}
