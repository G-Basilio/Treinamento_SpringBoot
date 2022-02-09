package br.com.solinftec.treinamento.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solinftec.treinamento.dto.fazenda.GetAllFazendaDto;
import br.com.solinftec.treinamento.service.FazendaService;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/fazenda")
@RequiredArgsConstructor
public class FazendaResource {

     private final FazendaService service;

     @GetMapping("")
     public ResponseEntity<List<GetAllFazendaDto>> getAll() {
         return ResponseEntity.ok().body(service.getAll());
     }
 
 }
