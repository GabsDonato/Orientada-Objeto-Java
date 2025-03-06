public class MSNmessenger {
    public static void main(String[] args) throws Exception {
        MSNmessenger messenger = new MSNmessenger();
        messenger.enviarMensagem();
        messenger.receberMensagem();
        messenger.validarConectadoInternet();
        messenger.salvarHistoricoMensagem();
    }

    public void enviarMensagem(){
        System.out.println("Enviando mensagem");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    public void validarConectadoInternet(){
        System.out.println("Valindo se esta conectado a internet");
    }

    public void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
