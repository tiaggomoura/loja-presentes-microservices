package com.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.client.FornecedorClient;
import com.microservices.dto.CompraDTO;
import com.microservices.dto.InfoPedidoDTO;
import com.microservices.modelo.Compra;

@Service
public class CompraService {

	@Autowired
	private FornecedorClient fornecedorClient;

	public Compra realizaCompra(CompraDTO compraDTO) {

		//InfoFornecedorDTO info = this.fornecedorClient.getInfoPorEstado(compraDTO.getEndereco().getEstado());

		InfoPedidoDTO pedido = this.fornecedorClient.realizaPedido(compraDTO.getItens());

		Compra compraSalva = new Compra(pedido, compraDTO);

		return compraSalva;

	}

}
