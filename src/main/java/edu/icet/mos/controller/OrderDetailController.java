package edu.icet.mos.controller;

import edu.icet.mos.dto.OrderDetails;
import edu.icet.mos.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mos/orderDetail")
@CrossOrigin
@RequiredArgsConstructor

public class OrderDetailController {
    final OrderDetailService service;

    @GetMapping("/get-all-byID/{id}")
    List<OrderDetails> getAllBYId(@PathVariable Integer id) {
        return service.getAllBYId(id);
    }

}
