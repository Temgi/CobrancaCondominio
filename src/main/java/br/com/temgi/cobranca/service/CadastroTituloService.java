package br.com.temgi.cobranca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.temgi.cobranca.model.StatusTitulo;
import br.com.temgi.cobranca.model.Titulo;
import br.com.temgi.cobranca.repository.Titulos;
import br.com.temgi.cobranca.repository.filter.TituloFilter;


@Service
public class CadastroTituloService {

	@Autowired
	private Titulos titulos;
	
	public void salvar(Titulo titulo) {
		try {
			titulos.save(titulo);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválido");
		}
	}

	public void excluir(Long codigo) {
		titulos.deleteById(codigo);
	}

	@SuppressWarnings("deprecation")
	public String receber(Long codigo) {
		Titulo titulo = titulos.getOne(codigo);
		titulo.setStatus(StatusTitulo.RECEBIDO);
		titulos.save(titulo);
		
		return StatusTitulo.RECEBIDO.getDescricao();
	}
	
	public List<Titulo> filtrar(TituloFilter filtro) {
		String descricao = filtro.getDescricao() == null ? " " : filtro.getDescricao();
		return titulos.findByDescricaoContaining(descricao);
	}
	
}
