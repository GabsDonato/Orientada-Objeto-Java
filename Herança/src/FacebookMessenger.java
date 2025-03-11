public class FacebookMessenger {
    public static void main(String[] args) throws Exception {

        MSNmessenger messenger = new MSNmessenger();
        messenger.enviarMensagem();
        messenger.receberMensagem();
        
    }

    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo facebook");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo facebook");
    }

    private void validarConectadoInternet(){
        System.out.println("Valindo se esta conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }

    
}
