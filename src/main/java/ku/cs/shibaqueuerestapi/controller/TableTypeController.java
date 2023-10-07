package ku.cs.shibaqueuerestapi.controller;

import ku.cs.shibaqueuerestapi.entity.Category;
import ku.cs.shibaqueuerestapi.entity.TableType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class TableTypeController {
    @Autowired
    private TableTypeService service;

    @GetMapping("/tableType")
    public TableType getAllTableTypes(){
        return service.getAll();
    }

    @GetMapping("/tableType/{idTableType}")
    public TableType getTableTypeById(@PathVariable UUID idTableType){
        return service.getTableTypeById(idTableType);
    }

    @PostMapping("/tableType")
    public TableType create(@RequestBody TableType tableType){
        return service.create(tableType);
    }

    @DeleteMapping("/tableType/{idTableType}")
    public TableType delete(@PathVariable UUID idTableType){
        return service.delete(idTableType);
    }
}
