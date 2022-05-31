package com.api.controller;


import com.api.service.ArquivoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/arquivos")
@AllArgsConstructor
public class ArquivoController {

    private ArquivoService arquivoService;

    @PostMapping
    public void upload(@RequestParam MultipartFile arquivo) {
        arquivoService.salvarFoto(arquivo);
    }

}
