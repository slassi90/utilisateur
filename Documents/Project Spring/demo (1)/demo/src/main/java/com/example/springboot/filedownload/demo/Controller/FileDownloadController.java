package com.example.springboot.filedownload.demo.Controller;

import com.example.springboot.filedownload.demo.Service.FileStorageService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FileDownloadController {
   // private static final Logger logger = LoggerFactory.getLogger(FileDownloadController.class);

    @Autowired
    private FileStorageService fileStorageService;
    @GetMapping("/downloadFile/{filename:.+}")
    public ResponseEntity<Resource> downloadfile(@PathVariable String filename, HttpServletRequest request){
        Resource resource = fileStorageService.loadFileAsResource(fileName);

        // Try to determine file's content type
        String contentType = null;
      /*  try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }
        */

        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }


}
