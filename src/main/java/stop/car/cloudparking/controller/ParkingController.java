package stop.car.cloudparking.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stop.car.cloudparking.DTO.ParkingCreateDTO;
import stop.car.cloudparking.DTO.ParkingDTO;
import stop.car.cloudparking.mapper.ParkingMapper;
import stop.car.cloudparking.model.Parking;
import stop.car.cloudparking.service.ParkingService;

import java.util.List;

@RestController
@RequestMapping("/parking")
@Api(tags = "Parking Controller")
public class ParkingController {

    private final ParkingService parkingService;
    private final ParkingMapper parkingMapper;

    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    }

    @GetMapping
    @ApiOperation("Find all parkings")
    public ResponseEntity<List<ParkingDTO>> findAll() {
        List<Parking> parkingList = parkingService.findAll();
        List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingDTO> findById(@PathVariable String id) {
        Parking parking = parkingService.findById(id);
        ParkingDTO result = parkingMapper.toParkingDTO(parking);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        parkingService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<ParkingDTO> create(@RequestBody ParkingCreateDTO dto) {
        Parking parkingCreate = parkingMapper.toParkingCreate(dto);
        Parking parking = parkingService.create(parkingCreate);
        var result = parkingMapper.toParkingDTO(parking);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ParkingDTO> update(@PathVariable String id, @RequestBody ParkingCreateDTO parkingCreteDTO) {
        Parking parkingUpdate = parkingMapper.toParkingCreate(parkingCreteDTO);
        Parking parking = parkingService.update(id, parkingUpdate);
        return ResponseEntity.ok(parkingMapper.toParkingDTO(parking));
    }

    @PostMapping("/{id}/exit")
    public ResponseEntity<ParkingDTO> checkOut(@PathVariable String id) {
        //TODO verificar se já não esta fechado e lançar exceção
        Parking parking = parkingService.checkOut(id);
        return ResponseEntity.ok(parkingMapper.toParkingDTO(parking));
    }

}
