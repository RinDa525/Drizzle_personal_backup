package com.example.parayo.domain.user.auth

data class SignupRequest(
    val email:String,
    val name:String,
    val password:String
)
