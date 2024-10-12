package dio.mockito.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Pouso Alegre", "Rua 2", "Apto 3", "Sto Antonio");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("37552500")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Julia", "78985632", LocalDate.now(), "37552500");

        assertEquals("Julia", pessoa.getNome());
        assertEquals("78985632", pessoa.getDocumento());
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("Apto 3", pessoa.getEndereco().getComplemento());

    }


}
