public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        MSNmesseger msn = new MSNmesseger();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }

}
