package edu.icet.mos.controller;

import edu.icet.mos.dto.Item;
import edu.icet.mos.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/mos/item")
@RestController
@CrossOrigin
public class ItemController {

    final ItemService service;

    @PostMapping("/add")
    public void addItem(@RequestBody Item item) {
        service.add(item.getName(),item.getPrice(),item.getImage());
    }

    @PutMapping("/update/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable Integer id) {
        service.update(item, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable Integer id) {
        service.delete(id);
    }

    @GetMapping("/get-all")
    List<Item> getAll() {
        return service.getAll();
    }

    @GetMapping("/search-by-id/{id}")
    List<Item> searchById(@PathVariable Integer id) {
        return service.searchById(id);
    }


}
