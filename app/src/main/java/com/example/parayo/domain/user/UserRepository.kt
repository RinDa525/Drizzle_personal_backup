package com.example.parayo.domain.user

import org.springframework.data.jpa.repository.JpaRepository
import org.stringframework.stereotype.Repository

@Pepository
interface UserRepository :JpaRepository<User, Long>{
}