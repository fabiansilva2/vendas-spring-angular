package com.exemplo.vendas.controller;

import com.exemplo.vendas.model.ItemVenda;
import com.exemplo.vendas.service.ItemVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemVendaController {

    @Autowired
    private ItemVendaService itemVendaService;

    @GetMapping
    public List<ItemVenda> findAll() {
        return itemVendaService.findAll();
    }

    @PostMapping
    public ItemVenda save(@RequestBody ItemVenda itemVenda) {
        return itemVendaService.save(itemVenda);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        itemVendaService.deleteById(id);
    }
}

