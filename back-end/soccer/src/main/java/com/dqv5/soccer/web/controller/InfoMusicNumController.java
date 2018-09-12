package com.dqv5.soccer.web.controller;

import com.dqv5.soccer.dao.InfoMusicNumRepository;
import com.dqv5.soccer.entity.InfoMusicNum;
import com.dqv5.soccer.web.result.RestReturn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author admin
 * @date 2018/8/14
 */
@RestController
@RequestMapping("/info/music")
public class InfoMusicNumController {
    @Resource
    private InfoMusicNumRepository musicNumRepository;

    @GetMapping("/stats")
    public ResponseEntity stats() {
        List<InfoMusicNum> list = musicNumRepository.findAll();
        return RestReturn.ok(list);
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody InfoMusicNum musicNum) {
        InfoMusicNum entity = this.musicNumRepository.save(musicNum);
        return RestReturn.ok(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id) {
        this.musicNumRepository.delete(id);
        return RestReturn.ok();
    }


}
