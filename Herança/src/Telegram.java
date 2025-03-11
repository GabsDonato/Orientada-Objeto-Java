public class Telegram {
    public static void main(String[] args) throws Exception {

        MSNmessenger messenger = new MSNmessenger();
        messenger.enviarMensagem();
        messenger.receberMensagem();
        messenger.validarConectadoInternet();
        messenger.salvarHistoricoMensagem();
    }

    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo telegram");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo telegram");
    }

    private void validarConectadoInternet(){
        System.out.println("Valindo se esta conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }

}
