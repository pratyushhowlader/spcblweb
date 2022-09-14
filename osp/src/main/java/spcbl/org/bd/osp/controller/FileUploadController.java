package spcbl.org.bd.osp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController {
    @RequestMapping("/upload")
    public String upload(){
        return "upload.html";
    }
}
