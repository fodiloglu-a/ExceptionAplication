package com.example.exceptionaplication.Controller;

import com.example.exceptionaplication.mapper.WordDTO;
import com.example.exceptionaplication.services.EnglishServicesImp;
import com.example.exceptionaplication.services.TurkishServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turkish")
public class TurkishWordController {
    public final TurkishServices turkisServices;

    public TurkishWordController(TurkishServices turkisServices) {
        this.turkisServices = turkisServices;

    }



    @GetMapping("/all")
    public ResponseEntity<List<WordDTO>> getAll() {
        return ResponseEntity.ok().body(turkisServices.getAll());
    }

    @GetMapping("/likeName")
    public  ResponseEntity<List<WordDTO>> getByOrWord(@RequestParam String word){
        return ResponseEntity.ok().body(turkisServices.getByOrLike(word));
    }
    @PostMapping("/create")
    public ResponseEntity create(@RequestBody WordDTO wordDTO){
        return ResponseEntity.ok(turkisServices.create(wordDTO));
    }
}
