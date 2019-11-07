package com.dbserver;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dbserver.domain.Categoria;
import com.dbserver.domain.Cidade;
import com.dbserver.domain.Cliente;
import com.dbserver.domain.Endereco;
import com.dbserver.domain.Estado;
import com.dbserver.domain.ItemPedido;
import com.dbserver.domain.Pagamento;
import com.dbserver.domain.PagamentoComBoleto;
import com.dbserver.domain.PagamentoComCartao;
import com.dbserver.domain.Pedido;
import com.dbserver.domain.Produto;
import com.dbserver.domain.enums.EstadoPagamento;
import com.dbserver.domain.enums.TipoCliente;
import com.dbserver.repositories.CategoriaRepository;
import com.dbserver.repositories.CidadeRepository;
import com.dbserver.repositories.ClienteRepository;
import com.dbserver.repositories.EnderecoRepository;
import com.dbserver.repositories.EstadoRepository;
import com.dbserver.repositories.ItemPedidoRepository;
import com.dbserver.repositories.PagamentoRepository;
import com.dbserver.repositories.PedidoRepository;
import com.dbserver.repositories.ProdutoRepository;

@SpringBootApplication
public class SpringIonicApplication implements CommandLineRunner {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIonicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
	
}