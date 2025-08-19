package com.back.global.jpa

import com.querydsl.jpa.impl.JPAQueryFactory
import jakarta.persistence.EntityManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JpaConfig(
    private val entityManager: EntityManager
) {
    @Bean
    fun jpaQueryFactory(): JPAQueryFactory {    // QueryDSL에서 제공하는 타입 안전한 쿼리를 작성할 수 있게 해주는 팩토리 클래스
        return JPAQueryFactory(entityManager)
    }
}