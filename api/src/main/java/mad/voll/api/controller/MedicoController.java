package mad.voll.api.controller;

import mad.voll.api.medico.DadosCadastroMedico;
import mad.voll.api.medico.Medico;
import mad.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar (@RequestBody DadosCadastroMedico dados) {
       repository.save(new Medico(dados));
    }
}