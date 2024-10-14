package dio.mockito.examples;

public class ServicoEnvioEmail {
    private PlataformaDeEnvio plataforma;

    public ServicoEnvioEmail(PlataformaDeEnvio plataforma) {
        this.plataforma = plataforma;
    }

    void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {

        Email email = null;

        if(formatoHtml) {
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        }else{
            email = new Email(enderecoEmail, mensagem, Formato.TEXTO);
        }

        plataforma.enviaEmail(email);
    }
}
