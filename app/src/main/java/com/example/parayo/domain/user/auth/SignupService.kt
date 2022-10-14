package com.example.parayo.domain.user.auth

import com.example.parayo.domain.user.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SignupService @Autowired constructor(
    private val userRepository: UserRepository
){
    fun signup(signupRequest: SignupRequest){
        validateRequest(signupRequest)
        checkDuplications(signupRequest.email)
        registerUser(signupRequest)
    }
}