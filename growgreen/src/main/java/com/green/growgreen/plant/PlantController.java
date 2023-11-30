package com.green.growgreen.plant;

import com.green.growgreen.common.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import com.green.growgreen.plant.model.PlantSelVo;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/plant")
public class PlantController {
    public final PlantService plantService;

    @PostMapping
    public ResVo insPlant(@RequestBody PlantInsDto dto){
        return plantService.insPlant(dto);
    }
    @GetMapping
    public List<PlantSelVo> selPlant(@RequestBody PlantInsDto dto){
        return plantService.selPlant(dto);
    }
}
