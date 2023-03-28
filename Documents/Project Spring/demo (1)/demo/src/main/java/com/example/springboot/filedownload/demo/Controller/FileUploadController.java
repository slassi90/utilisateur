package com.example.springboot.filedownload.demo.Controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class FileUploadController {
    @Autowired
    private FileStorageService fileStorageService;
    @PostMapping("/uploadFile")
    public Response uploadFile(@RequestParam(file) MultipartFile file)
    {
        String fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();
        return new Response(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

        @PostMapping("/uploadMultipleFiles")
        public List < Response > uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
               // .map(file - > uploadFile(file))
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());

    }

}
