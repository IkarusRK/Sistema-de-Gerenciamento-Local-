package br.com.pastelaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional; // Importe esta classe

@RestController
@RequestMapping("/insumos")
public class InsumoController {

    @Autowired
    private InsumoRepository repo;

    @GetMapping
    public List<Insumo> listarTodos() {
        return repo.findAll();
    }
    
    @GetMapping("/buscar")
    public List<Insumo> buscarPorNome(@RequestParam String nome) {
        return repo.findByNomeInsumoContainingIgnoreCase(nome);
    }

    @PostMapping
    public Insumo salvar(@RequestBody Insumo insumo) {
        return repo.save(insumo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Insumo> atualizar(@PathVariable Integer id, @RequestBody Insumo insumoDetalhes) {
        Optional<Insumo> insumoOptional = repo.findById(id);

        if (insumoOptional.isEmpty()) {
            // Se o optional estiver vazio, significa que o insumo não foi encontrado.
            // Retorna um erro 404 (Not Found).
            return ResponseEntity.notFound().build();
        }

        Insumo insumoExistente = insumoOptional.get();

        insumoExistente.setNomeInsumo(insumoDetalhes.getNomeInsumo());
        insumoExistente.setFornecedor(insumoDetalhes.getFornecedor());
        insumoExistente.setMedida(insumoDetalhes.getMedida());
        insumoExistente.setValorInicial(insumoDetalhes.getValorInicial());
        

        final Insumo insumoAtualizado = repo.save(insumoExistente);
        
        // Retorna uma resposta de sucesso (200 OK) com o insumo atualizado no corpo da resposta.
        return ResponseEntity.ok(insumoAtualizado);
    }
}
