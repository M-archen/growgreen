package com.green.growgreen.plant;

import com.green.growgreen.common.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import com.green.growgreen.plant.model.PlantSelVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlantService {
    public final PlantMapper plantMapper;
    public ResVo insPlant(PlantInsDto dto){
        plantMapper.insPlant(dto);
        return new ResVo(dto.getIplant());
    }
    public List<PlantSelVo> selPlant(PlantInsDto dto){
        List<PlantSelVo> plantSelVoList=plantMapper.selPlantAll(dto);
        return plantSelVoList;
    }
}
