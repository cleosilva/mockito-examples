package dio.mockito.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

/**
 * Teste da classe {@link EnviarMensagem} exemplificando Spy
 */
@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {
    @Spy
    EnviarMensagem enviarMensagem = new EnviarMensagem();

    @Test
    void adicionarMensagem() {
        Mensagem mensagem = new Mensagem("Hello Spy!");

        enviarMensagem.adicionarMensagem(mensagem);

        // Verifica se a classe EnviarMensagem está chamando o método
        verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertEquals(1, enviarMensagem.getMensagens().size());
    }
}
