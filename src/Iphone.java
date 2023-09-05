public class Iphone implements SmartPhone {


    @Override
    public void ReprodutorMusical() {
        System.out.println("tocar, pausar, selecionarMusica");
    }

    @Override
    public void AparelhoTelefonico() {
        System.out.println("ligar, atender, iniciarCorrerioVoz");
    }

    @Override
    public void NavegadorInternet() {
        System.out.println("exibirPagina, adicionarNovaAba, atualizarPagina");
    }
}
