package com.everestechoes.controller;

import org.springframework.ui.Model;
import com.everestechoes.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtistsController {
    @Autowired
    private MusicService musicService;

    @GetMapping("/artists")
    public String artists(Model model) {
        model.addAttribute("artists", musicService.getAllArtists());
        return "artists";
    }
}
