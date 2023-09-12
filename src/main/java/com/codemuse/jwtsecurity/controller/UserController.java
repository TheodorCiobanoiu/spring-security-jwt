package com.codemuse.jwtsecurity.controller;

import com.codemuse.jwtsecurity.common.ResponseObject;
import com.codemuse.jwtsecurity.dto.response.UserResponse;
import com.codemuse.jwtsecurity.dto.request.UserRegistrationRequest;
import com.codemuse.jwtsecurity.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseObject<UserResponse> registerUser(@RequestBody @Valid UserRegistrationRequest userRegistrationRequest){
        log.info("Received user registration request: {}", userRegistrationRequest);

        return ResponseObject.<UserResponse>builder()
                .status(ResponseObject.ResponseStatus.SUCCESSFUL)
                .message("User registered successfully")
                .data(userService.registerUser(userRegistrationRequest))
                .build();
    }

    @GetMapping
    @PreAuthorize("hasAuthority('users:read')")
    public ResponseObject<Page<UserResponse>> getAllUsers(@PageableDefault(
                                                            sort = "id", direction = Sort.Direction.DESC
                                                          ) Pageable pageable){

        return ResponseObject.<Page<UserResponse>>builder()
                .status(ResponseObject.ResponseStatus.SUCCESSFUL)
                .data(userService.getAllUsers(pageable))
                .build();
    }
}
