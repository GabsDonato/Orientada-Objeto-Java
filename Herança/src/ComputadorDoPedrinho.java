public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        MSNmessenger msn = new MSNmessenger();

        msn.enviarMensagem();

        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }

}
