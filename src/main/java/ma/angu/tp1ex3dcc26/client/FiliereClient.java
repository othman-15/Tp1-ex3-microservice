package ma.angu.tp1ex3dcc26.client;

import ma.angu.tp1ex3dcc26.dtos.FiliereDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "filiere-service", url = "http://localhost:8085/v1/filieres")

public interface FiliereClient {
    @GetMapping ("/{id}")
    FiliereDto getFiliereById(@PathVariable("id") Long id);
}