package br.gov.sp.fatec.projetolab5.service;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import br.gov.sp.fatec.projetolab5.entity.Documento;
import br.gov.sp.fatec.projetolab5.entity.Usuario;
import br.gov.sp.fatec.projetolab5.repository.DocumentoRepository;
import br.gov.sp.fatec.projetolab5.repository.UsuarioRepository;

@SpringBootTest
public class DocumentoServiceTest {

    @Autowired
    private DocumentoService service;

    @MockBean
    private UsuarioRepository usuarioRepo;

    @MockBean
    private DocumentoRepository documentoRepository;


    /**
     * 
     */
    @Test
    public void novoDocumentoTestOk() {
        Documento documento = new Documento();
        documento.setNumero(11222444);
        documento.setDigito(3);
        documento.setTipo("cpf");
        documento.setDataEmissao(new Date());
        documento.setUsuario("Teste");
        documento.setUsuario.setId(3);
        Optional<Usuario> usuarioOp = Optional.of(usuario);
        Mockito.when(usuarioRepo.findByNome("Teste")).thenReturn(usuarioOp);

      
    }






    
}
