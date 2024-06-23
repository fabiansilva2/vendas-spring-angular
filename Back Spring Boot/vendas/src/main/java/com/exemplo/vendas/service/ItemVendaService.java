package com.exemplo.vendas.service;

import com.exemplo.vendas.model.ItemVenda;
import com.exemplo.vendas.repository.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemVendaService {

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    public List<ItemVenda> findAll() {
        return itemVendaRepository.findAll();
    }

    public ItemVenda save(ItemVenda itemVenda) {
        return itemVendaRepository.save(itemVenda);
    }

    public void deleteById(Long id) {
        itemVendaRepository.deleteById(id);
    }
}
