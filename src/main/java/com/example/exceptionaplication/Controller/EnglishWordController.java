package com.example.exceptionaplication.Controller;



import com.example.exceptionaplication.exceptio.CustomerException;
import com.example.exceptionaplication.mapper.WordDTO;
import com.example.exceptionaplication.services.EnglishServicesImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/english")
public class EnglishWordController {
    public final EnglishServicesImp englishServices;

    public EnglishWordController(EnglishServicesImp englishServices) {
        this.englishServices = englishServices;

    }


    @GetMapping("/all")
    public ResponseEntity<List<WordDTO>> getAll() {
        return ResponseEntity.ok().body(englishServices.getAll());
    }

    @GetMapping("/likeName")
    public  ResponseEntity<List<WordDTO>> getByOrWord(@RequestParam String word){
        return ResponseEntity.ok().body(englishServices.getByOrLike(word));
    }
    @PostMapping("/create")
    public ResponseEntity create(@RequestBody WordDTO wordDTO){
        return ResponseEntity.ok(englishServices.create(wordDTO));
    }






}
