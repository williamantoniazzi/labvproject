package br.gov.sp.fatec.projetolab5.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class DocumentoControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void Documento novoDocumento(@RequestBody Documento documento) {
        return service.novoDocumento(documento);
    }

    @GetMapping(value = "/{tipo}/{numero}")
    public Documento buscarDocumento(@PathVariable("tipo") String tipo, @PathVariable("numero") Long numero) {
        return service.buscarDocumento(tipo, numero);
    }
    
}
