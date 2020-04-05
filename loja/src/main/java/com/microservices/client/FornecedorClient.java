package com.microservices.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.microservices.dto.InfoFornecedorDTO;
import com.microservices.dto.InfoPedidoDTO;
import com.microservices.dto.ItemDaCompraDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {
	
	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);

	@RequestMapping(method = RequestMethod.POST, value = "/pedido")
	public InfoPedidoDTO realizaPedido(List<ItemDaCompraDTO> itens);

}
