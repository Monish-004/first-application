package my_work.controller;

import lombok.AllArgsConstructor;
import my_work.entity.WorkEntity;
import my_work.service.MonishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("api")
@RestController
public class Controller
{

    private MonishService service;

    // http://localhost:8080/api/storing
    @PostMapping("storing")
    public ResponseEntity<WorkEntity> postDatas(@RequestBody WorkEntity values1)
    {
        WorkEntity values2 = service.createData(values1);
       return new ResponseEntity<>(values2, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/taking
    @GetMapping("taking")
    public ResponseEntity<List<WorkEntity>> getDatas()
    {
        List<WorkEntity> values = service.getALLData();
        return new ResponseEntity<>(values,HttpStatus.OK);
    }
}
