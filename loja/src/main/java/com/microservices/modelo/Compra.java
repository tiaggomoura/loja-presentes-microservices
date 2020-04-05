package com.microservices.modelo;

import com.microservices.dto.CompraDTO;
import com.microservices.dto.InfoPedidoDTO;

public class Compra {

	private Long pedidoId;

	private Integer tempoDePreparo;

	private String enderecoDestino;

	public Compra() {

		// TODO Auto-generated constructor stub
	}

	public Compra(InfoPedidoDTO pedido, CompraDTO compraDTO) {

		this.pedidoId = pedido.getId();
		this.tempoDePreparo = pedido.getTempoDePreparo();
		this.enderecoDestino = compraDTO.getEndereco().toString();
	}

	public Long getPedidoId() {

		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {

		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreparo() {

		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {

		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEnderecoDestino() {

		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {

		this.enderecoDestino = enderecoDestino;
	}

}
