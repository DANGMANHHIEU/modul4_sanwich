package com.example.giavi.controller;

import com.example.giavi.model.GiaVi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import javax.xml.ws.Service;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GiaViController {
    @GetMapping("/")
    public String TrangChu(ModelMap mode){
        // tao dach cac gia vi
        List<GiaVi> giaViList = new ArrayList<>();
       giaViList.add(new GiaVi("Rau xanh", false));
        giaViList.add(new GiaVi("Thịt gà", false));
        giaViList.add(new GiaVi("Trứng", false));
        giaViList.add(new GiaVi("Xúc xích", false));

        mode.addAttribute("giaViList",giaViList);
        return "trangchu";
    }

    @PostMapping("/chongiavi")
    public String chonGiaVi(@RequestParam (name = "giavi",required = false) List<String>list, ModelMap mode){
        List<GiaVi> giaViList = new ArrayList<>();
        // tao danh sach gia vi duoc chon
        if(list != null){
            for(String giavi: list){
                giaViList.add(new GiaVi(giavi,true));

            }
        }
        mode .addAttribute("giaviList",giaViList);
        return "ketqua";
    }
}
