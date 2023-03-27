package com.example.springboot.user.demo.Resources;

import com.example.springboot.user.demo.Service.UserService;
import com.example.springboot.user.demo.Test.User;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@RestController
public class UserResource {
    @Autowired

    private UserService userService;

@RequestMapping(path="/api/users/generate/{count}",method = RequestMethod.GET)
public ByteArrayResource Filename(@PathVariable int count){
    ByteArrayResource resource = userService.Filename(count);
    if (resource == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND) ;;
    return resource;
}


  /*  @RequestMapping(path = "/api/users/generate", method = RequestMethod.GET)
    public ResponseEntity<Resource> download(String param) throws IOException {

        // ...
        Path path = Paths.get(file.getAbsolutePath());
        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));

        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }
    */

}
